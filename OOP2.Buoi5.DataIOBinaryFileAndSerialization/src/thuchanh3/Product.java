package thuchanh3;

import java.io.Serializable;

public class Product implements Serializable {
    private String proID;
    private String proName;
    private double price;

    public Product() {
    }

    public Product(String proID, String proName, double price) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proID='" + proID + '\'' +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
