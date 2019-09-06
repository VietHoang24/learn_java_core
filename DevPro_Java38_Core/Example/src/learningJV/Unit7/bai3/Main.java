package learningJV.Unit7.bai3;

public class Main {
    public static void xuatHH(HangDienTu[] hd){
        System.out.println("\n----- DANH SACH HON HOP -----\n");
        for(int i=0; i<hd.length; i++){
            System.out.println(hd[i].toString() + "\n");
        }
    }

    public static void xuatTV(HangDienTu[] hd){
        System.out.println("\n----- DANH SACH TIVI -----");
        for(int i=0; i<hd.length; i++){
            if(hd[i] instanceof TiVi){
                System.out.println(hd[i].toString());
            }
            System.out.println();
        }
    }

    public static void xuatMT(HangDienTu[] hd){
        System.out.println("\n----- DANH SACH MAY TINH -----\n");
        for(int i=0; i<hd.length; i++){
            if(hd[i] instanceof MayTinh){
                System.out.println(hd[i].toString());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HangDienTu[] hdt = new HangDienTu[8];
        hdt[0] = new MayTinh("001", "Laptop", 3, 2500, "ASUS", 3.5, 1000, 8, 3.4);
        hdt[1] = new TiVi("002", "SamSung", 5, 3000, "SamSung", 220, "Seri 7", 50);
        hdt[2] = new TiVi("003", "SamSung", 5, 3000, "SamSung", 220, "Seri 7", 50);
        hdt[3] = new MayTinh("004", "Laptop", 3, 2500, "ASUS", 3.5, 1000, 8, 3.4);
        hdt[4] = new TiVi("005", "SamSung", 5, 3000, "SamSung", 220, "Seri 7", 50);
        hdt[5] = new MayTinh("006", "Laptop", 3, 2500, "ASUS", 3.5, 1000, 8, 3.4);
        hdt[6] = new TiVi("007", "SamSung", 5, 3000, "SamSung", 220, "Seri 7", 50);
        hdt[7] = new TiVi("008", "SamSung", 5, 3000, "SamSung", 220, "Seri 7", 50);

        xuatHH(hdt);
        xuatTV(hdt);
        xuatMT(hdt);
    }
}
