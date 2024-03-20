package bai3b.presentation;

import bai3b.business.IProduct.ProductManagerb;
import bai3.business.config.InputMethods;
import bai3.business.design.CRUD;

public class Mainb {
    public static void main(String[] args) {
        CRUD product = new ProductManagerb();
        byte choice;
        do {
            System.out.println("-------------MENU-------------" +
                    "●\t1.Thêm sản phẩm\n" +
                    "●\t2.Sửa thông tin sản phẩm theo id\n" +
                    "●\t3.Xóa sản phẩm theo id\n" +
                    "●\t4.Hiển thị danh sách sản phẩm\n" +
                    "●\t5.Tìm kiếm sản phẩm theo tên\n" +
                    "●\t6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "Chon tác vụ");
            choice = InputMethods.getByte();
            switch (choice){
                case 1:
                    product.createProduct();
                    break;
                case 2:
                    product.editProduct();
                    break;
                case 3:
                    product.deleteProduct();
                    break;
                case 4:
                    product.displayProduct();
                    break;
                case 5:
                    product.searchProduct();
                    break;
                case 6:
                    product.sortProduct();
                    break;
                default:
                    System.out.println("Moi nhap lai");
                    break;
            }
        }
        while (choice!=7);
    }
}
