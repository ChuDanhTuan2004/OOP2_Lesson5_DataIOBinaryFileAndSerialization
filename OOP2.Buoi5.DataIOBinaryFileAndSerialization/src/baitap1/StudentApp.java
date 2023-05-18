package baitap1;

public class StudentApp {
    public static void main(String[] args) {
        String fileName = "students.txt";
        Student[] students = new Student[5];
        students[0] = new Student("SV001", "Lan Anh", 21, "CQ 45");
        students[1] = new Student("SV002", "Trung Hiếu", 22, "CQ 45");
        students[2] = new Student("SV003", "Thanh Tâm", 23, "CQ 45");
        students[3] = new Student("SV004", "Ngọc Anh", 20, "CQ 45");
        students[4] = new Student("SV005", "Thị Nụ", 19, "CQ 45");

        for (Student student : students) {
            if (!StudentProcess.writeStudent(student, fileName)) {
                System.out.println("Ghi file thất bại");
            }
        }

        Student[] studentsFromFile = StudentProcess.readStudent(fileName);
        if (studentsFromFile == null) {
            System.out.println("Đọc file thất bại");
        } else {
            for (Student student : studentsFromFile) {
                System.out.println(student.getId() + " - " + student.getName() + " - "
                        + student.getAge() + " - " + student.getClassName());
            }
        }
    }
}
