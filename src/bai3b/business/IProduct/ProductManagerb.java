package bai3b.business.IProduct;

import bai3.business.config.InputMethods;
import bai3.business.design.CRUD;
import bai3.business.entity.Product;

import java.util.*;

public class ProductManagerb implements CRUD {
   LinkedList<Product> list = new LinkedList<>();
    @Override
    // thêm mới sản phẩm
    public void createProduct() {
        Product newProduct = new Product();
        System.out.println("Nhap ten san pham:");
        newProduct.setNameProduct(InputMethods.getString());
        System.out.println("Nhap gia san pham:");
        newProduct.setPrice(InputMethods.getInteger());
        list.add(newProduct);

    }
    //sửa thông tin sản phẩm
    @Override
    public void editProduct() {
        System.out.println("Nhap ma ID cua san pham can sua");
        int input = InputMethods.getInteger();
        ListIterator<Product> iterator = list.listIterator();// tạo iterator để duyệt linkedlít
        while (iterator.hasNext()){// trong khi danh sách còn phân tử để duyệt
            Product product = iterator.next();// đặt biến product là phần tử tiếp theo
            if (product.getIdProduct()==input){// tìm thấy thì h thị thông tin sản phẩm và cho phép thay đổi thông tin
                product.toString();
                System.out.println("Nhap ten san pham:");
                product.setNameProduct(InputMethods.getString());
                System.out.println("Nhap ma ID:");
                product.setPrice(InputMethods.getInteger());
                break;
            }
            else {
                System.out.println("Khong co san pham can sua: ");// nếu ko tìm thấy thì thông báo
            }
        }
    }
    // xóa sản phẩm
    @Override
    public void deleteProduct() {
        System.out.println("Nhap ma ID cua san pham can xoa");
        int input = InputMethods.getInteger();
        ListIterator<Product> iterator = list.listIterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if (product.getIdProduct()==input){// tìm thấy thì xóa băng method remove()
                list.remove(product);
                break;
            }
            else {
                System.out.println("Khong co san pham can xoa: ");
            }
        }
    }
    // hiển thị danh sách sản phẩm
    @Override
    public void displayProduct() {
        for (Product product : list) {
            System.out.println("Ma ID: "+product.getIdProduct());
            System.out.println("Ten san pham: "+product.getNameProduct());
            System.out.println("Gia: "+product.getPrice());
            System.out.println("-------------------------------");
            break;
        }
    }
    //tìm sản phẩm
    @Override
    public void searchProduct() {
        System.out.println("Nhap ma ten cua san pham can tim");
        String input = InputMethods.getString();
        ListIterator<Product> iterator=list.listIterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if (product.getNameProduct().equals(input)){// tìm thấy thì trả về thông tin sản phẩm
                product.toString();
                break;
            }
            else {
                System.out.println("Khong co san pham can tim: ");
            }
        }
    }

    @Override
    public void sortProduct() {
        if (list.isEmpty()){
            System.out.println("Khong co san pham nap de sap xep");
        }
        else {
            // sắp xếp theo giá tăng dần
            Collections.sort(list, (o1, o2) -> {
                return o1.getPrice() - o2.getPrice();
            });
            // trả lại về danh sách sau sx
            displayProduct();
        }
    }
}
