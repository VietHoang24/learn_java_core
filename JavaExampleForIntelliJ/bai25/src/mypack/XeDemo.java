package mypack;
import java.util.Scanner;

public class XeDemo {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ten chu xe: ");
        tenChuXe = input.nextLine();
        System.out.print("Loai xe: ");
        loaiXe = input.nextLine();
        System.out.print("Dung tich: ");
        dungTich = input.nextInt();
        System.out.print("Tri gia: ");
        triGia = input.nextLong();
        input.nextLine();
    }

    public static void inTieuDe(){
        System.out.printf("%20s%20s%20s%20s%20s%n", "Ten Chu Xe",
                "Loai Xe", "Dung Tich", "Tri Gia", "Thue Phai Nop");
    }

    public double thueNop(){
        double thue = 0;
        if(dungTich<100)
            thue = triGia*0.01;
        else{
            if(100<dungTich && dungTich<200)
                thue = triGia*0.03;
            else
                thue = triGia*0.05;
        }
        return thue;
    }

    public void xuat(){
        System.out.printf("%20s%20s%20d%20.2f%20.2f%n",
                tenChuXe, loaiXe, dungTich, triGia, thueNop());
    }
}
