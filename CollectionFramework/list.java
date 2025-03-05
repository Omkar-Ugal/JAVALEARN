package CollectionFramework;
import java.util.*;

public class list {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println(li);

        List li1 = new LinkedList<Integer>();
        li1.add(1);
        li1.add(2);
        li1.add(3);
        System.out.println(li1);

        Vector vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);

        Stack st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.contains(2);

        System.out.println(st);//method add, get , set,remove,contain
    }
}
