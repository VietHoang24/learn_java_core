package Controller;

public class xuatSinhVien extends nhapSinhVien {
    public static void xuatDanhSachSinhVien() {
        System.out.printf("%60s%n", "KET QUA HOC TAP");
        for (int i=0; i<list.size(); i++) {
            System.err.println("- SINH VIEN THU " + (i+1));
            System.out.printf("%24s%s%n", "Ma sinh vien: ", list.get(i).getMaSinhVien());
            System.out.printf("%21s%s%n", "Ho va ten: ", list.get(i).getHoDem() + " " + list.get(i).getTen());
            System.out.printf("%20s%s%20s%s%n", "Nam sinh: ", list.get(i).getNamSinh(), "Gioi tinh: ", list.get(i).getGioiTinh());
            System.out.printf("%n%60s%n", "DANH SACH MON HOC");
            xuatMonHoc.tieuDe(); float kq = 0; int hs = 0;
            for (int j=0; j<list.get(i).getList().size(); j++) {
                xuatMonHoc.xuatMotMonHoc(i, j);
                kq += xuatMonHoc.diemTB(i, j);
                hs += list.get(i).getList().get(j).getHeSo();
            }
            System.err.printf("%20s%80.1f%n", "Tong ket", kq/hs);
        }
    }
}
