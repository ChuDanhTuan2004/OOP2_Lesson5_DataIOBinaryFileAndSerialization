import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThucHanh1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("person.dat");
            String data = "Hello World!";
            fos.write(data.getBytes());
            System.out.println("Da ghi du lieu vao file");
            fos.close();
        } catch (IOException e) {
            System.out.println("Loi: " + e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream("person.dat");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
