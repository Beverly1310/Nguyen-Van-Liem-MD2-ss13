package bai9;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        // tạo map
        Map<Integer,Integer> map = new HashMap<>();
        // thêm ptu vào map
        map.put(1, random.nextInt(100));
        map.put(3, random.nextInt(100));
        map.put(5, random.nextInt(100));
        map.put(7, random.nextInt(100));
        map.put(9, random.nextInt(100));
        map.put(10, random.nextInt(100));
        map.put(4, random.nextInt(100));
        map.put(6, random.nextInt(100));
        map.put(22, random.nextInt(100));
        map.put(11, random.nextInt(100));
        //ktra key 50
        System.out.println(map.containsKey(50));
        //ktra key 22
        System.out.println(map.containsKey(22));
    }
}
