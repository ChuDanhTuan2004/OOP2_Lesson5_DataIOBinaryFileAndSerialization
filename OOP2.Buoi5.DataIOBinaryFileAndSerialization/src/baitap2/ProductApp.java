package baitap2;

public class ProductApp {
    public static void main(String[] args) {
        String fileName = "products.txt";
        Product[] products = new Product[5];
        products[0] = new Product("PR001", "Laptop Dell Inspiron", 13500000, "Dell");
        products[1] = new Product("PR002", "Điện thoại iPhone 12", 24990000, "Apple");
        products[2] = new Product("PR003", "Máy ảnh Canon EOS M200", 12999000, "Canon");
        products[3] = new Product("PR004", "Tai nghe không dây Sony WH-1000XM4", 8990000, "Sony");
        products[4] = new Product("PR005", "Bàn phím cơ Logitech G413 Carbon", 1690000, "Logitech");

        for (Product product : products) {
            if (!ProductProcess.writeProduct(product, fileName)) {
                System.out.println("Ghi file thất bại");
            }
        }
    }
}
