import java.util.ArrayList;
import java.util.Collections;

public class MyListModified<T extends Comparable<T>> {
    private ArrayList<T> list;

    public MyListModified() {
        this.list = new ArrayList<>();
    }

    public void add(T value) {
        list.add(value);
    }

    public T largest() {
        if (list.isEmpty()) {
            return null;
        }
        return Collections.max(list);
    }

    public T smallest() {
        if (list.isEmpty()) {
            return null;
        }
        return Collections.min(list);
    }
}
