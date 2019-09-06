package Chuong3.bai33.IO;

public class outputSinhVien extends inputSinhVien {
    public static void tieuDeSV(){
        System.out.printf("%20s%20s%20s%20s%n", "Ma Sinh Vien", "Ten Sinh Vien", "Lop", "Khoa");
    }

    public static void xuatDSSV(){
        for(int i=0; i<listSV.size(); i++){
            System.out.printf("%20s%20s%20s%20d%n", listSV.get(i).getMaSinhVien(),
                    listSV.get(i).getTenSinhVien(), listLH.get(i).getTenLop(), listLH.get(i).getKhoa());
        }
    }

    public static void phieuSV(int i){
        System.out.println("\t- Phieu thu " + (i+1));
        System.out.printf("%40s%n", "PHIEU BAO DIEM");
        System.out.print("\t\tMa sinh vien: " + listSV.get(i).getMaSinhVien() + ". ");
        System.out.println("\t\tTen sinh vien: " + listSV.get(i).getTenSinhVien() + ".");
        System.out.print("\t\tLop:\t\t  " + listLH.get(i).getTenLop());
        System.out.print("\t\tKhoa: " + listLH.get(i).getKhoa() + ";");
        System.out.println("\t\tDiem TB: " + outputMonHoc.diemTB(i));
        System.out.println("\t\tBang diem:");
    }

    public static void phieuBaoDiem(){
        for(int i=0; i<listSV.size(); i++){
            phieuSV(i);
            outputMonHoc.tieuDe();
            outputMonHoc.xuatMonHoc(i);
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
    }
}
