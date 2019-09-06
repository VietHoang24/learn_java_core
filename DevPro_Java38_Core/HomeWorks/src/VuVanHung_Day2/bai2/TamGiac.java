package VuVanHung_Day2.bai2;

public class TamGiac {
    public static boolean check(double a, double b, double c){
        if(a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0)
            return true;
        else
            return false;
    }

    public static double chuVi(double a, double b, double c){
        return a+b+c;
    }

    public static double dienTich(double a, double b, double c){
        double s = chuVi(a, b, c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static void main(String[] args) {
        double a = 10.5, b = 6.5, c = 7.4;
        if(check(a, b, c)){
            System.out.println("Chu vi tam giac: " + chuVi(a, b, c));
            System.out.println("Dien tich tam giac: " + dienTich(a, b, c));
        } else {
            System.out.println("Ba canh khong tao thanh tam giac.");
        }
    }
}
