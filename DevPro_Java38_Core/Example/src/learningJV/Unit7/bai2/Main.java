package learningJV.Unit7.bai2;

public class Main {
    public static void xuat(HangDienTu[] hdt){
        System.out.println("\n----- DSHDT -----");
        for(int i=0; i<hdt.length; i++){
            System.out.println(hdt[i].toString());
        }
    }

    public static void xuatMin(HangDienTu[] hdt){
        System.out.println("\n----- DSHDT min -----");
        double min = hdt[0].getTrongLuong();
        for(int i=0; i<hdt.length; i++){
            if(hdt[i].getTrongLuong() < min)
                min = hdt[i].getTrongLuong();
        }
        for(int i=0; i<hdt.length; i++){
            if(hdt[i].getTrongLuong()==min)
                System.out.println(hdt[i].toString());
        }
    }

    public static void main(String[] args) {
        HangDienTu[] hdt = new HangDienTu[3];
        hdt[0] = new HangDienTu("H01", "TiVi", "20/07/2019", 20.5, "Den", 40.5, "2 chieu");
        hdt[1] = new HangDienTu("H01", "TiVi", "20/07/2019", 25.5, "Den", 40.5, "2 chieu");
        hdt[2] = new HangDienTu("H01", "TiVi", "20/07/2019", 20.5, "Den", 40.5, "2 chieu");

        System.out.println("Danh sach hang dien tu khoi tao");
        xuat(hdt);

        System.out.println("Danh sach hang dien tu co trong luong nho nhat");
        xuatMin(hdt);
    }
}
