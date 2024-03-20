package bai5;

import java.util.*;

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
        System.out.println(map);
        // đưa key-value vào map
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        // sắp xếp
        Collections.sort(list,(o1, o2) -> {
            return o1.getValue()- o2.getValue();
        });
        System.out.println(list);

    }
}
