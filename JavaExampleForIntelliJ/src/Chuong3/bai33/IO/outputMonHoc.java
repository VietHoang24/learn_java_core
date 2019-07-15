package Chuong3.bai33.IO;

public class outputMonHoc extends inputSinhVien {
    public static void tieuDe(){
        System.out.printf("%20s%20s%20s%n", "Ten Mon Hoc", "So Trinh", "Diem");
    }

    public static float diemTB(int i){
        float kq = 0, soTrinh = 0;

        for(int j=0; j<listSV.get(i).getListMH().size(); j++){
            soTrinh += listSV.get(i).getListMH().get(j).getSoTrinh();
        }

        for(int j=0; j<listSV.get(i).getListMH().size(); j++){
            kq += ( listSV.get(i).getListMH().get(j).getSoTrinh() *
                    listSV.get(i).getListMH().get(j).getDiem() )/soTrinh;
        }

        return kq;
    }

    public static void xuatMonHoc(int i){
        for(int j=0; j<listSV.get(i).getListMH().size(); j++){
            System.out.printf("%20s%20d%20.2f%n", listSV.get(i).getListMH().get(j).getTenMonHoc(),
                    listSV.get(i).getListMH().get(j).getSoTrinh(), listSV.get(i).getListMH().get(j).getDiem());
        }
    }
}
