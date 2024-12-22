import java.util.List;

public class OrderProcessor {

    // Cần xử lý : findBestSupplier 
    // --> Giá thấp nhất (ưu tiên hàng đầu) , Chất lượng cao nhất (nếu giá bằng nhau) , Thời gian giao hàng ngắn nhất (nếu cả giá và chất lượng đều bằng nhau).

    // FindBestSuppliers
    public SupplierProduct findBestSupplier ( Products product, List<Suppliers> suppliers ) {
        SupplierProduct best = null ; // Best Supplier

        for ( Suppliers supplier : suppliers ) {
            for ( SupplierProduct sp : supplier.getProducts() ) {
                
                // Condition to choose the best supplier
                var condition1 = sp.getPrice() < best.getPrice() ; 
                var condition2 = sp.getPrice() == best.getPrice() ; 
                var condition3 = supplier.getQualityRating() > best.getSuppliers().getQualityRating() ; 
                var condition4 = supplier.getQualityRating() == best.getSuppliers().getQualityRating() ;
                var condition5 = supplier.getLeadTime() < best.getSuppliers().getLeadTime(); 
                
                // Check if product dc provided by supplier
                if ( sp.getProducts().getId().equalsIgnoreCase(product.getId() ) ) {
                    if ( best == null || condition1 || 
                    (condition2 && condition3) || (condition2 && condition4 && condition5)  ) {
                        best = sp ; 
                    }
                }
            }
        }
        return best ; 
    }
    
    public void processOrder( Orders order , List<Suppliers> suppliers  ) {
        // Check trạng thái đơn hàng 
        boolean allFulfilled = true ; 

        // tìm nhà cung cấp tốt nhất cho sản phẩm
        for ( OrderItem item : order.getItems() ) {
            // tìm best suppliers for each product
            SupplierProduct bestSupplierProduct = findBestSupplier(item.getProduct() , suppliers); 

            if ( bestSupplierProduct != null ) {
                // show suppliers 
                System.out.println("Product: " + item.getProduct().getName() + ", supplier: " + bestSupplierProduct.getSuppliers().getName() + ", Price: " + bestSupplierProduct.getPrice() )  ;

                // update nhà cung cấp cho sản phẩm đơn hàng 
                

            } else {
                // if không có supplier --> đánh dấu là backOrdered 
                System.out.println("Product: " + item.getProduct().getName() + " is backordered" );
                
                allFulfilled = false ; 
            }
        }

        // update status đơn hàng 
        if ( allFulfilled ) {
            order.setStatus("Fullfilled");
        } else {
            order.setStatus("Partially Fullfilled");
        }

        
    }

}
