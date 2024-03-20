package bai11;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,5,4,3,6,9,8,7,10};
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            treeMap.put(array[i],0);
        }
        System.out.println(treeMap);
    }
}
