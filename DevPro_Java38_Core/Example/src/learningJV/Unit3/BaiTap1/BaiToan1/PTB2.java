package learningJV.Unit3.BaiTap1.BaiToan1;

import java.util.Scanner;

public class PTB2 {
    static private double a, b, c;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.println("Nhap he so phuong trinh: ");
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();
        input.nextLine();
    }

    public static void giaiPT(){
        if(a<0)
            System.out.println("Phuong trinh vua nhap khong phai phuong trinh bac 2.");
        else{
            double delta = b*b-4*a*c;
            if(delta==0)
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + (-b/(2*a)) );
            else if(delta<0)
                System.out.println("Phuong trinh vo nghiem.");
            else
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + ((-b-Math.sqrt(delta))/(2*a)) + " va x2 = " + ((-b+Math.sqrt(delta))/(2*a)));
        }
    }
}
