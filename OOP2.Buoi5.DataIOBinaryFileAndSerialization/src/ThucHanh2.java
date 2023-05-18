import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ThucHanh2 {
    public static boolean writeData(String data, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(data.getBytes());
            fos.close();

            return true;
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi dữ liệu vào file: " + e.getMessage());
            return false;
        }
    }

    public static String readData(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            byte[] data = fis.readAllBytes();
            fis.close();

            return new String(data);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc dữ liệu từ file: " + e.getMessage());
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần ghi vào file: ");
        String input = scanner.nextLine();
        String fileName = "data.dat";
        boolean result = writeData(input, fileName);
        if (result) {
            System.out.println("Đã ghi dữ liệu vào file " + fileName);
        } else {
            System.out.println("Ghi dữ liệu vào file " + fileName + " thất bại");
        }

        String resultData = readData(fileName);
        if (!resultData.isEmpty()) {
            System.out.println("Dữ liệu trong file " + fileName + ": ");
            System.out.println(resultData);
        }

        scanner.close();
    }
}
