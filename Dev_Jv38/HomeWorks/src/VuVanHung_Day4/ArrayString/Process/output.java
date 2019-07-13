package VuVanHung_Day4.ArrayString.Process;

public class output extends input {
    public static void xuatTieuDe(){
        System.out.printf("%10s%20s%20s%20s%n", "STT", "Chu Ho", "So KwH", "Tong Tien");
    }

    public static void xuatDs(){
        System.out.printf("%n%50s%n", "DANH SACH HO GIA DINH");
        xuatTieuDe();
        for(int i=0; i<listHoGD.size(); i++){
            System.out.printf("%10d%20s%20d%20d%n", (i+1), listHoGD.get(i).getTen(),
                    listHoGD.get(i).getSoKwh(), TienDien.tienDien(listHoGD.get(i).getSoKwh()));
        }
    }

    public static void hienThi3GD(){
        xuatTieuDe();
        for(int i=listHoGD.size()-1; i>listHoGD.size()-4; i--){
            System.out.printf("%10d%20s%20d%20d%n", (i+1), listHoGD.get(i).getTen(),
                    listHoGD.get(i).getSoKwh(), TienDien.tienDien(listHoGD.get(i).getSoKwh()));
        }
    }

    public static void hienThiChuHo(){
        xuatTieuDe();
        int dem = 0;
        for(int i=0; i<listHoGD.size(); i++){
            if(listHoGD.get(i).getTen().compareTo("Truong")==0 || listHoGD.get(i).getTen().compareTo("truong")==0){
                dem++;
                System.out.printf("%10d%20s%20d%20d%n", (i+1), listHoGD.get(i).getTen(),
                        listHoGD.get(i).getSoKwh(), TienDien.tienDien(listHoGD.get(i).getSoKwh()));
            } else {
                continue;
            }
        }
        if(dem==0){
            System.out.println("\n\t=> Danh sach vua nhap khong co chu ho ten la TRUONG\n");
        }
    }
}
