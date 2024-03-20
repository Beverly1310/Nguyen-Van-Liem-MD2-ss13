package bai15;

import java.util.Scanner;
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
        // Nhập key cần xóa và xóa key khỏi treemap
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap key can xoa");
        treeMap.remove(Integer.parseInt(scanner.nextLine()));
    }
}
