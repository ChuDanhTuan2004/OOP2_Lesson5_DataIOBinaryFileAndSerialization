package baitap1;

import java.io.*;

public class StudentProcess {
    public static boolean writeStudent(Student objStudent, String fileName){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
            oos.writeObject(objStudent);
            oos.close();
            return true;
        } catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }

    public static Student[] readStudent (String fileName){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(new File(fileName)));
            Student[] students = new Student[5];
            for (int i = 0; i < 5; i++) {
                students[i] = (Student) objectInputStream.readObject();
            }
            objectInputStream.close();
            return students;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
