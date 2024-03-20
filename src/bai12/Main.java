package bai12;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // tạo mảng, tạo treemap
            int[] array = {1,2,5,3,6,9,8,7,11,15,19};
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        // gán giá trị cho mảng
        for (int i = 0; i < array.length; i++) {
            tree.put(array[i],0);
        }
        // nhập vào phần từ muốn tìm là phần tử thứ mấy
        System.out.println("Ban muon tim so lon thu may trong mang? ");
        int count = Integer.parseInt(scanner.nextLine());
        // đổi mã thành phần tử lớn thứ n
        int max = tree.lastKey();
        for (int i = 1; i < count; i++) {
            max = tree.lowerKey(max);
        }
        // in ra phần tử lớn thứ x trong mảng
        System.out.printf("So lon thu %d trong mang la %d",count,max);
    }
}
