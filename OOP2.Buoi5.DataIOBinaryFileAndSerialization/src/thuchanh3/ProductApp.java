package thuchanh3;

public class ProductApp {
    public static void main(String[] args) {
        // Bước 1
        Product objProduct1 = new Product();
        objProduct1.setProID("P001");
        objProduct1.setProName("Product 1");
        objProduct1.setPrice(10.0);

        Product objProduct2 = new Product("P002", "Product 2", 20.0);

        // Bước 2
        ProductProcess objProductProcess = new ProductProcess();

        boolean writeResult = objProductProcess.writeObjectData(objProduct1, "object.dat");
        if (writeResult) {
            System.out.println("Ghi đối tượng thành công");
        } else {
            System.out.println("Ghi đối tượng không thành công");
        }

        Product[] listProduct = objProductProcess.readObjectData("object.dat");
        if (listProduct != null) {
            System.out.println("Danh sách đối tượng đọc từ file:");
            for (Product product : listProduct) {
                System.out.println(product);
            }
        } else {
            System.out.println("Đọc dữ liệu từ file không thành công hoặc file không có dữ liệu");
        }
    }
}
