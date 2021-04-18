import java.util.Iterator;
import java.util.TreeSet;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(8);

        for (Iterator<Integer> i = treeSet.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
