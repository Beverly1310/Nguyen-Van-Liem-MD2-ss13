package bai2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // tạo mảng rồi đừa phần tử vào hashmap, đếm số phtu trong mảng
        int[] array = {1,2,3,3,4,5,5,6,7,8,8,9};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            }
            else {
                map.put(array[i],1);
            }
        }
        // đưa những phần tử có value 1 vào map2
        System.out.println(map);
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i])==1){
                map2.put(array[i],1);
            }
        }
        // in ra
        System.out.println(map2);
    }
}
