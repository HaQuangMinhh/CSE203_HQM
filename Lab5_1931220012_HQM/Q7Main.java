
public class Q7Main {
    public static void main(String[] args) {
        
        // Of int
        MyListModified<Integer> intList = new MyListModified<>();
        
        intList.add(15);
        intList.add(8);
        intList.add(42);
        
        
        System.out.println("Largest (Integers): " + intList.largest());
        System.out.println("Smallest (Integers): " + intList.smallest());

        // Of String
        MyListModified<String> stringList = new MyListModified<>();
        
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        
        System.out.println("Largest (Strings): " + stringList.largest());
        System.out.println("Smallest (Strings): " + stringList.smallest());
    }
}

