import java.text.DecimalFormat;
import java.util.Random;

public class hcn {
    public static void main(String[] args) {
        float dai, rong, chuVi, dienTich;
        Random random = new Random();
        dai = random.nextFloat() + 1;
        rong = random.nextFloat() + 1;
        chuVi = (dai + rong) / 2;
        dienTich = dai * rong;

        // khai bao dinh dang xuat gia tri thuc
        DecimalFormat dinhDang = new DecimalFormat("###,###.0#");

        System.out.println("Kich thuoc hinh chu nhat tu sinh: dai = " + dai + ", rong = " + rong);
        System.out.println("Chu vi hinh chu nhat: " + dinhDang.format(chuVi));
        System.out.println("Dien tich hinh chu nhat: " + dinhDang.format(dienTich));
    }
}