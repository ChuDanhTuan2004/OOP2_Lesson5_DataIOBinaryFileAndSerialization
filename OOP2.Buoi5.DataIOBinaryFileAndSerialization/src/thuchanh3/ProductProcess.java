package thuchanh3;

import java.io.*;

public class ProductProcess {
    public static boolean writeObjectData(Product objProduct, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(objProduct);
            objectOut.close();
            fileOut.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Product[] readObjectData(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Product[] products = (Product[]) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            return products;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
