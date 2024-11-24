
import java.util.*;

public class MyList<T extends Number> {

    // T is data type 
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<T>();
    }

    public void add(T value) {
        list.add(value);
    }

    public T largest() {
        T largest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (largest.doubleValue() < list.get(i).doubleValue()) {
                largest = list.get(i);
            }

        }

        return largest;
    }

    public T smallest() {
        T smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (smallest.doubleValue() > list.get(i).doubleValue()) {
                smallest = list.get(i);
            }

        }

        return smallest;
    }

}
