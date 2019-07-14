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

    public static void phieuBaoDiem(){
        for(int i=0; i<listSV.size(); i++){
            System.out.println("\t- Phieu thu " + (i+1));
            System.out.printf("%n%40s%n", "PHIEU BAO DIEM");
            System.out.print("Ma sinh vien: " + listSV.get(i).getMaSinhVien() + ". ");
            System.out.println("\tTen sinh vien: " + listSV.get(i).getTenSinhVien() + ".");
            System.out.print("Lop:\t" + listLH.get(i).getTenLop());
            System.out.println("\tKhoa: " + listLH.get(i).getKhoa() + ";");
            System.out.println("Bang diem:");
            outputMonHoc.tieuDe();
            for(int j=0; j<listMH.size(); j++){
                System.out.printf("%20s%20d%20.2f%n", listSV.get(j).getListMH().get(j).getTenMonHoc(),
                        listSV.get(j).getListMH().get(j).getSoTrinh(), listSV.get(j).getListMH().get(j).getDiem());
            }
        }
    }
}
