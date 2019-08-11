package FinalTest.Cau1.Process.INPUT;

import FinalTest.Cau1.Module.CongNhan;
import FinalTest.Cau1.Module.NguoiLaoDong;

public class iCongNhan extends iNguoiLaoDong {
    public static void nhapCongNhan(){
        NguoiLaoDong congNhan = new CongNhan();
        nhapNguoiLaoDong(congNhan);
        System.out.print("So ngay cong: ");
        int soNgayCong = input.nextInt();
        ((CongNhan) congNhan).setSoNgayCong(soNgayCong);
        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        ((CongNhan) congNhan).setDonGia(donGia);
        input.nextLine();
        nguoiLaoDongs.add(congNhan);
    }

    public static void nhapDanhSachCongNhan(){
        System.out.print("So cong nhan can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("- Cong nhan thu " + (i+1));
            nhapCongNhan();
        }
    }
}
