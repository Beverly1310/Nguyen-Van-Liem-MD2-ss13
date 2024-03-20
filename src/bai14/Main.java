package bai14;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Integer,Integer> tree = new TreeMap<>(Comparator.reverseOrder());
        int[] array = {1,2,5,3,6,9,8,7,11,15,19};
        // gán giá trị cho mảng
        for (int i = 0; i < array.length; i++) {
            tree.put(array[i],0);
        }
        System.out.println(tree);
    }
}
