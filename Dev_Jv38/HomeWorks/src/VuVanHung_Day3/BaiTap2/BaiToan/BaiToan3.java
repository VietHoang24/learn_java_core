package VuVanHung_Day3.BaiTap2.BaiToan;

import java.util.Scanner;

public class BaiToan3 {
    private static float m;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap vao khoi luong gao can mua: ");
        m = input.nextFloat();
        while (m<1){
            System.out.print("Yeu cau so luong mua lon hon 1kg, moi nhap lai: ");
            m = input.nextFloat();
        }
    }

    public static void tinhTien(){
        if(m<50){
            System.out.println("So tien phai tra la: " + m*14000);
        } else {
            float tg = m-50;
            if(1<=tg && tg<=25)
                System.out.println("So tien phai tra la: " + (m*14000-tg*500));
            else if(26<=tg && tg<=40)
                System.out.println("So tien phai tra la: " + (m*14000-tg*750));
            else if(41<=tg && tg<=55)
                System.out.println("So tien phai tra la: " + (m*14000-tg*1000));
            else
                System.out.println("So tien phai tra la: " + (m*14000-tg*1500));
        }
    }
}
