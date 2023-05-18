package baitap2;

import java.io.*;

public class ProductProcess {
    public static boolean writeProduct(Product objProduct, String fileName) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(new File(fileName)));
            objectOutputStream.writeObject(objProduct);
            objectOutputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Product[] readProduct(String fileName) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(new File(fileName)));
            Product[] products = new Product[5];
            for (int i = 0; i < 5; i++) {
                products[i] = (Product) objectInputStream.readObject();
            }
            objectInputStream.close();
            return products;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
