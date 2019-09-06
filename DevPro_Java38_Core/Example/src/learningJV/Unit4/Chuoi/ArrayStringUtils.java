package learningJV.Unit4.Chuoi;

public class ArrayStringUtils {
    public static String[] name = {"Dung", "Truong", "Trung", "Khang",
            "Chien", "Binh", "Hong", "Trang", "Thuy", "Bich"};

    public static int[] cto = {100, 58, 234, 190, 98, 351, 60, 210, 320, 142};

    public static long tienDien(int soKwh){
        long t = 0;
        if(soKwh<=50)
            t = soKwh*1678;
        else if(50<soKwh && soKwh<=100)
            t = 50*1678l + (soKwh-50)*1734l;
        else if(100<soKwh && soKwh<=200)
            t = 50*1678l + 50*1734l + (soKwh-100)*2014l;
        else if(200<soKwh && soKwh<=300)
            t = 50*1678l + 50*1734l + 100*2014l + (soKwh-200)*2536l;
        else if(300<soKwh && soKwh<=400)
            t = 50*1678l + 50*1734l + 100*2014l + 100*2536l + (soKwh-300)*2834l;
        else
            t = 50*1678l + 50*1734l + 100*2014l + 100*2536l + 100*2834l + (soKwh-400)*2927l;
        return t;
    }

    public static void xuat() {
        System.out.println("----- Danh sach cac ho gia dinh -----");
        System.out.println("STT " + "Ten     " + "   SoKwh" + "      ThanhTien");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%2d  ", (i + 1));
            System.out.printf("%-10s", name[i]); //-10s can le trai
            System.out.printf("%6d", cto[i]);
            System.out.printf("%12d vnd\n", tienDien(cto[i]));
        }
    }

    public static void main(String[] args) {
        xuat();
    }
}
