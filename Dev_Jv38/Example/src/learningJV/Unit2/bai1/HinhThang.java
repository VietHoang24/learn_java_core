package learningJV.Unit2.bai1;

public class HinhThang {
    public static double area(double a, double b, double h){
        return (a+b)*h/2;
    }

    public static void main(String[] args) {
        double a = 10.4, b = 8.33, h = 9;
        System.out.println("Dien tich hinh thang: " + area(a, b, h));
    }
}
