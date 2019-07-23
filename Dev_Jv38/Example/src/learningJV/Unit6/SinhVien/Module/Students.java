package learningJV.Unit6.SinhVien.Module;

import java.util.Arrays;
import java.util.Scanner;

public class Students {
    private int code;
    private String firstName;
    private String lastName;
    private int year;
    private String gender;
    private Subjects[] subject;

    public Students() {
    }

    public Students(int code, String firstName, String lastName, int year, String gender, Subjects[] subject) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.gender = gender;
        this.subject = subject;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Subjects[] getSubject() {
        return subject;
    }

    public void setSubject(Subjects[] subject) {
        this.subject = subject;
    }

    public double diemTK(){
        double t = 0;
        int d = 0;
        for (int i=0; i<subject.length; i++){
            t+=subject[i].getDiem()*subject[i].getSoTC();
            d+=subject[i].getSoTC();
        }
        return t/d;
    }

    public void modifySubject(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ma hoc phan can sua: ");
        int code = in.nextInt();
        int i = 0;
        while (i<subject.length && subject[i].getMaHocPhan()!=code){
            i++;
        }
        if(i==subject.length){
            System.out.println("Ma vua nhap khong ton tai.");
            return;
        }

        System.out.println(subject[i].toString());

        System.out.print("New name: ");
        in.nextLine();
        String newName = in.nextLine();

        System.out.print("New credit: ");
        int credit = in.nextInt();

        System.out.print("New mark: ");
        double newMark = in.nextDouble();

        subject[i].setTenHocPhan(newName);
        subject[i].setSoTC(credit);
        subject[i].setDiem(newMark);
    }

    @Override
    public String toString() {
        return "Students{" +
                "code=" + code +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", gender='" + gender + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }
}
