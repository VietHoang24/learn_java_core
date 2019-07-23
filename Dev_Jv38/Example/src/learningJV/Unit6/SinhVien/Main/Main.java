package learningJV.Unit6.SinhVien.Main;

import learningJV.Unit6.SinhVien.Module.Students;
import learningJV.Unit6.SinhVien.Module.Subjects;

public class Main {
    public static void main(String[] args) {
        Subjects[] subject = new Subjects[3];
        subject[0] = new Subjects(101, "Java", 4, 8.9);
        subject[1] = new Subjects(102, "PHP", 3, 8.5);
        subject[2] = new Subjects(103, "DTB", 3, 7.8);
        Students student = new Students(101, "Tran Van", "Thuong", 1998, "Nam", subject);
        System.out.println(student);
        System.out.println("Diem trung binh: " + student.diemTK());

        student.modifySubject();
        System.out.println(student.toString());
        System.out.println("Diem TB moi: " + student.diemTK());
    }
}
