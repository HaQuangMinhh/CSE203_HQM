public class MainRunQ8 {

    public static void main(String[] args) {
        Customer customer = new Customer("Minh", "hehe111", "1112222", "customer1", true);
        System.out.println(customer);

        PreferredCustomer preferredCustomer = new PreferredCustomer("thuy", "111/888 Australia", "03699999",
                "hihi", false, 366666);
        System.out.println(preferredCustomer + ", Price: " + preferredCustomer.buyProduct(8000));


    }


}
