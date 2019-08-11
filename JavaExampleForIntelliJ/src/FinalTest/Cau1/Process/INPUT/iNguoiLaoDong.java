package FinalTest.Cau1.Process.INPUT;

import FinalTest.Cau1.Module.NguoiLaoDong;

import java.util.ArrayList;
import java.util.Scanner;

public class iNguoiLaoDong {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<NguoiLaoDong> nguoiLaoDongs = new ArrayList<>();

    public static void nhapNguoiLaoDong(NguoiLaoDong nguoiLaoDong){
        System.out.print("Ho ten: ");
        String hoTen = input.nextLine();
        nguoiLaoDong.setHoTen(hoTen);
        System.out.print("Gioi tinh: ");
        String gioiTinh = input.nextLine();
        nguoiLaoDong.setGioiTinh(gioiTinh);
        System.out.print("Ngay sinh: ");
        String ngaySinh = input.nextLine();
        nguoiLaoDong.setNamSinh(ngaySinh);
        System.out.print("Dia chi: ");
        String diaChi = input.nextLine();
        nguoiLaoDong.setDiaChi(diaChi);
    }
}
