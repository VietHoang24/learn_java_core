package FinalTest.Cau1.Process.OUTPUT;

import FinalTest.Cau1.Module.CongNhan;
import FinalTest.Cau1.Module.KySu;
import FinalTest.Cau1.Process.INPUT.iNguoiLaoDong;

public class oNguoiLaoDong extends iNguoiLaoDong {
    public static void xuatCongNhan(){
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tDANH SACH CONG NHAN");
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%n",
                "Ho Ten", "Gioi Tinh", "Nam Sinh", "Dia Chi", "So Ngay Cong", "Don Gia", "Luong");
        for (int i=0; i<nguoiLaoDongs.size(); i++) {
            if (nguoiLaoDongs.get(i) instanceof CongNhan) {
                System.out.printf("%20s%20s%20s%20s%20d%20.1f%20.1f%n",
                        nguoiLaoDongs.get(i).getHoTen(),
                        nguoiLaoDongs.get(i).getGioiTinh(),
                        nguoiLaoDongs.get(i).getNamSinh(),
                        nguoiLaoDongs.get(i).getDiaChi(),
                        ((CongNhan) nguoiLaoDongs.get(i)).getSoNgayCong(),
                        ((CongNhan) nguoiLaoDongs.get(i)).getDonGia(),
                        nguoiLaoDongs.get(i).getLuong());
            }
        }
    }

    public static void xuatKySu(){
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tDANH SACH KY SU");
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%n",
                "Ho Ten", "Gioi Tinh", "Nam Sinh", "Dia Chi", "Xep Loai", "He So Luong", "Luong");
        for (int i=0; i<nguoiLaoDongs.size(); i++){
            if (nguoiLaoDongs.get(i) instanceof KySu) {
                System.out.printf("%20s%20s%20s%20s%20s%20.1f%20.1f%n",
                        nguoiLaoDongs.get(i).getHoTen(),
                        nguoiLaoDongs.get(i).getGioiTinh(),
                        nguoiLaoDongs.get(i).getNamSinh(),
                        nguoiLaoDongs.get(i).getDiaChi(),
                        ((KySu) nguoiLaoDongs.get(i)).getXepLoai(),
                        ((KySu) nguoiLaoDongs.get(i)).getHeSoLuong(),
                        nguoiLaoDongs.get(i).getLuong());
            }
        }
    }
}
