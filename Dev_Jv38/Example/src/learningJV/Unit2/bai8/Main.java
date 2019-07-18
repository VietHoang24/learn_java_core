package learningJV.Unit2.bai8;

import java.util.Scanner;

public class Main {
    public static void nhapX(HocSinh hs){
        String name, gender;
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        name = input.nextLine();
        hs.setName(name);

        System.out.print("Age: ");
        age = input.nextInt();
        hs.setAge(age);
        input.nextLine();

        System.out.print("Gender: ");
        gender = input.nextLine();
        hs.setGender(gender);
    }

    public static HocSinh nhap(){
        String name, gender;
        int age;
        Scanner input = new Scanner(System.in);
        HocSinh hs = new HocSinh();

        System.out.print("Name: ");
        name = input.nextLine();
        hs.setName(name);

        System.out.print("Age: ");
        age = input.nextInt();
        hs.setAge(age);
        input.nextLine();

        System.out.print("Gender: ");
        gender = input.nextLine();
        hs.setGender(gender);

        return hs;
    }

    public static HocSinh xuat(HocSinh hs){
        System.out.println("\nThong tin hoc sinh vua nhap");
        System.out.println("\tName  : " + hs.getName());
        System.out.println("\tAge   : " + hs.getAge());
        System.out.println("\tGender: " + hs.getGender());
        return hs;
    }

    public static void main(String[] args) {
        HocSinh hs;
        hs = nhap();

        hs = new HocSinh();
        nhapX(hs);   //phuong thuc nap chong

        xuat(hs);
    }
}
