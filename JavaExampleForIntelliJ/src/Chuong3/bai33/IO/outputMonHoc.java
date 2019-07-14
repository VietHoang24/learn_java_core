package Chuong3.bai33.IO;

public class outputMonHoc extends inputSinhVien {
    public static void tieuDe(){
        System.out.printf("%20s%20s%20s%n", "Ten Mon Hoc", "So Trinh", "Diem");
    }

    public static void xuatMonHoc(){
        for(int i=0; i<listMH.size(); i++){
            System.out.printf("%20s%20d%20.2f%n", listSV.get(i).getListMH().get(i).getTenMonHoc(),
                    listSV.get(i).getListMH().get(i).getSoTrinh(), listSV.get(i).getListMH().get(i).getDiem());
        }
    }
}
