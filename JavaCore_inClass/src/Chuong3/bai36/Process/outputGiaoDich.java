package Chuong3.bai36.Process;

public class outputGiaoDich extends inputGiaoDich {
    public static void tieuDe(){
        System.out.printf("%15s%15s%15s%15s%15s%15s%15s%15s%15s%n",
                "Ma GD", "Ngay GD", "Don Gia", "Loai Dat", "Dien Tich",
                "Loai Nha", "Dia Chi", "Tien Dat", "Tien Nha");
    }

    public static void ouput1Target(int i){
        System.out.printf("%15s%15s%15.1f%15s%15.1f%15s%15s%15.1f%15.1f%n",
                listNha.get(i).getMaGiaoDich(),
                listNha.get(i).getNgayGiaoDich().toString(),
                listNha.get(i).getDonGia(),
                listNha.get(i).getLoaiDat(),
                listNha.get(i).getDienTich(),
                listNha.get(i).getLoaiNha(),
                listNha.get(i).getDiaChi(),
                ThanhTien.getTienDat(i),
                ThanhTien.getTienNha(i));
    }

    public static void xuatDS(){
        for (int i=0; i<listNha.size(); i++){
            ouput1Target(i);
        }
    }

    public static void tongSoLuong(){
        int tongA = 0, tongB = 0, tongC = 0;
        int tongThuong = 0, tongCaoCap = 0;

        for (int i=0; i<listNha.size(); i++){
            if (listNha.get(i).getLoaiDat().compareToIgnoreCase("A")==0){
                tongA++;
            } else {
                if (listNha.get(i).getLoaiDat().compareToIgnoreCase("B")==0){
                    tongB++;
                } else {
                    tongC++;
                }
            }

            if (listNha.get(i).getLoaiNha().compareToIgnoreCase("thuong")==0){
                tongThuong++;
            } else {
                tongCaoCap++;
            }
        }

        System.out.println("=> Co tat ca " + tongA + " giao dich dat loai A, " +
                tongB + " giao dich dat loai B, " +
                tongC + " giao dich dat loai C.\n   Va co tat ca " +
                tongThuong + " nha loai thuong, " +
                tongCaoCap + " nha loai cao cap trong danh sach giao dich.");
    }

    public static void trungBinh(){
        double tongTienDat = 0;
        for (int i=0; i<listNha.size(); i++){
            tongTienDat += ThanhTien.getTienDat(i);
        }
        System.out.println("- Trung binh thanh tien cua gia dich dat: " + tongTienDat/listNha.size());
    }

    public static void timGiaoDich(){
        for (int i=0; i<listNha.size(); i++){
            if (listNha.get(i).getNgayGiaoDich().getThang()==9 &&
                    listNha.get(i).getNgayGiaoDich().getNam()==2013){
                ouput1Target(i);
            }
        }
    }
}
