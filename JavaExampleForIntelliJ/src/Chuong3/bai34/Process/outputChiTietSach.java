package Chuong3.bai34.Process;

public class outputChiTietSach extends inputPhieuNhapSach {
    public static void tieuDe(){
        System.out.printf("%20s%20s%20s%20s%n", "Ten sach", "Ten tac gia", "Ten NXB", "So luong");
    }

    public static void xuat(int i){
        for(int j=0; j<listPhieu.get(i).getListBook().size(); j++){
            System.out.printf("%20s%20s%20s%20d%n", listPhieu.get(i).getListBook().get(j).getTenSach(), listPhieu.get(i).getListBook().get(j).getTenTacGia(),
                    listPhieu.get(i).getListBook().get(j).getTenNXB(), listPhieu.get(i).getListBook().get(j).getSoLuong());
        }
    }

    public static int tong(int i){
        int tong = 0;
        for(int j=0; j<listPhieu.get(i).getListBook().size(); j++){
            tong += listPhieu.get(i).getListBook().get(j).getSoLuong();
        }
        return tong;
    }
}
