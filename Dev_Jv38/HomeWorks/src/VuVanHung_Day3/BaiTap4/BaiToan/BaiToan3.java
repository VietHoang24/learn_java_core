package VuVanHung_Day3.BaiTap4.BaiToan;

public class BaiToan3 {
    public static void bangCuuChuong(){
        for(int i=2; i<=10; i++){
            System.out.println("\n\tBang nhan " + i);
            for(int j=1; j<=10; j++){
                System.out.println("\t" + i + " x " + j + " = " + i*j);
            }
        }
    }
}
