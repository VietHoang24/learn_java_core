package learningJV.Unit7.bai1;

public class TamGiac extends DoanThang {
    private Diem C;

    public TamGiac() {
    }

    public TamGiac(Diem a, Diem b, Diem c) {
        super(a, b);
        C = c;
    }

    public double dienTich(){
        double a = A.distance(B);
        double b = A.distance(C);
        double c = B.distance(C);
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
