package CollectionFramework;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<Integer>();
        st.add(1);
        st.add(2);
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(3);
        System.out.println(st);

        LinkedHashSet<Integer> st1 = new LinkedHashSet<Integer>();
        st1.add(1);
        st1.add(1);
        st1.add(2);
        st1.add(1);
        st1.add(3);
        st1.add(3);
        System.out.println(st1);

        TreeSet<Integer> st2 = new TreeSet<>();
        st2.add(1);
        st2.add(2);
        st2.add(3);
        st2.add(3);
        System.out.println(st2);
    }
}
