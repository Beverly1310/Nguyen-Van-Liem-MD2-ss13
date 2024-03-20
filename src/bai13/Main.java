package bai13;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //tạo mảng, tạo treemap
        int[] array = {1,2,5,4,3,6,9,8,7,10};
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        //đưa các phtu của mảng vào treemap
        for (int i = 0; i < array.length; i++) {
            treeMap.put(array[i],0);
        }
        System.out.println(treeMap);
        // tạo đối tượng entry và gán giá trị là firstEntry() của tree map
        Map.Entry<Integer,Integer> firstEntry = treeMap.firstEntry();
        System.out.println(firstEntry);
    }
}
