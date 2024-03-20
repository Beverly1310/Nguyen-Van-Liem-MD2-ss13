package bai1;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,2,6,1,2,3,9,8,7,5,1,23,6,4,5,8};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            }
            else {
                map.put(array[i],1);
            }
        }
        System.out.println(map);
    }
}