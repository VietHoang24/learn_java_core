package Controller;

public class xuatMonHoc extends nhapSinhVien {
    public static void tieuDe() {
        System.out.printf("%20s%20s%20s%20s%20s%n", "Ma Mon Hoc", "Ten Mon Hoc", "He So", "Diem Tong Ket", "Diem Mon Hoc");
    }

    public static float diemTB(int i, int j) {
        float kq = list.get(i).getList().get(j).getHeSo()*list.get(i).getList().get(j).getDiemSo();
        return kq;
    }

    public static void xuatMotMonHoc(int i, int j) {
        System.out.printf("%20s%20s%20d%20.1f%20.1f%n",
                list.get(i).getList().get(j).getMaMonHoc(),
                list.get(i).getList().get(j).getTenMonHoc(),
                list.get(i).getList().get(j).getHeSo(),
                list.get(i).getList().get(j).getDiemSo(),
                diemTB(i, j));
    }
}
