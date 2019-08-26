package TestCuoiKhoa.Controller.Process;

import TestCuoiKhoa.Module.tblDiem;

public class xuatMonHoc extends nhapSinhVien {
    public static void tieuDeMH() {
        System.out.printf("%20s%20s%20s%20s%n", "Ma Mon Hoc", "Ten Mon Hoc", "He So", "Diem So");
    }

    public static void xuatDSMH(int i, int j) {
        System.out.printf("%20s%20s%20d%20.1f%n",
                list.get(i).getListMH().get(j).getMaMonHoc(),
                list.get(i).getListMH().get(j).getTenMonHoc(),
                list.get(i).getListMH().get(j).getHeSo(),
                ((tblDiem) list.get(i).getListMH().get(j)).getDiemSo());
    }
}
