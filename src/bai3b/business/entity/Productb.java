package bai3b.business.entity;

public class Productb {
    private static int count = 0;
    private int idProduct;
    private String nameProduct;
    private int Price;

    public Productb() {
    }

    public Productb(String nameProduct, int price) {
        this.idProduct = count++;
        this.nameProduct = nameProduct;
        Price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }


    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", Price=" + Price +
                '}';
    }
}
