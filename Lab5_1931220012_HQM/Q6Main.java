
public class Q6Main {

    public static void main(String[] args) {

        MyList<Number> list = new MyList<>();
        
        list.add(100);
        list.add(3.14);
        list.add(50);
        list.add(1);

        System.out.println("The number highest: " + list.largest());
        System.out.println("The number smallest:  " + list.smallest());

    }

}
