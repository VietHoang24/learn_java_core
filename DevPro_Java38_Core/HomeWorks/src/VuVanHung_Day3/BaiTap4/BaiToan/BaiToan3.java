package VuVanHung_Day3.BaiTap4.BaiToan;

public class BaiToan3 {
    public static void bangCuuChuong(){
        System.out.printf("%n%60s%n%n", "BANG CUU CHUONG");
        for(int i=1; i<=10; i++){
            for(int j=2; j<=10; j++){
                System.out.printf("%d x%2d =%3d | ", j, i, i*j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        bangCuuChuong();
    }
}
