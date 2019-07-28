package Chuong3.bai38.Process;

public class ThanhTien extends inputHoaDon {
    public static double getThanhTienTime(int i){
        double thanhTien = listTime.get(i).getSoGioThue() * listTime.get(i).getDonGia();
        if (24<listTime.get(i).getSoGioThue() &&listTime.get(i).getSoGioThue()<30){
            return thanhTien;
        } else {
            return -1;
        }
    }

    public static double getThanhTienDay(int i){
        double thanhTien = listDay.get(i).getSoNgayThue() * listDay.get(i).getDonGia();
        if (listDay.get(i).getSoNgayThue()<1){
            return -1;
        } else {
            if (listDay.get(i).getSoNgayThue()>7)
                return thanhTien + (listDay.get(i).getSoNgayThue()-7) * (0.2*listDay.get(i).getDonGia());
            else
                return thanhTien;
        }
    }

    public static double getTongThanhTien(){
        double tongTime = 0;
        double tongDay = 0;

        for (int i=0; i<listTime.size(); i++){
            if (listTime.get(i).getNgayHD().getThang()==9 &&
                listTime.get(i).getNgayHD().getNam()==2013 && getThanhTienTime(i)!=-1){
                tongTime += getThanhTienTime(i);
            } else {
                tongTime = 0;
            }
        }

        for (int i=0; i<listDay.size(); i++){
            if (listDay.get(i).getNgayHD().getThang()==9 &&
                listDay.get(i).getNgayHD().getNam()==2013 && getThanhTienDay(i)!=-1){
                tongDay += getThanhTienDay(i);
            } else {
                tongDay = 0;
            }
        }

        return ((tongTime/listTime.size()) + (tongDay/listDay.size()))/2;
    }
}
