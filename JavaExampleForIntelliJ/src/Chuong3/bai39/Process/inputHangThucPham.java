package Chuong3.bai39.Process;

import Chuong3.bai39.Module.DMY;
import Chuong3.bai39.Module.HangThucPham;

import java.util.ArrayList;
import java.util.Scanner;

public class inputHangThucPham {
    static ArrayList<HangThucPham> listThucPham = new ArrayList<HangThucPham>();
    static Scanner input = new Scanner(System.in);

    public static void nhap(HangThucPham htp){
        System.out.print("Ma hang: ");
        String maHang = input.nextLine();
        htp.setMaHang(maHang);

        System.out.print("Ten hang: ");
        String tenHang = input.nextLine();
        htp.setTenHang(tenHang);

        System.out.print("So luong ton: ");
        int slt = input.nextInt();
        htp.setSoLuongTonKho(slt);

        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        htp.setDonGia(donGia);

        System.out.println("\t-> Ngay san xuat <-");
        DMY nsx = new DMY();
        inputDMY.nhapDate(nsx);
        htp.setNsx(nsx);

        System.out.println("\t-> Han su dung <-");
        DMY hsd = new DMY();
        inputDMY.nhapDate(hsd);
        htp.setHsd(hsd);

        input.nextLine();
    }

    public static void nhapThucPham(){
        HangThucPham htp = new HangThucPham();
        nhap(htp);
        listThucPham.add(htp);
    }

    public static void themThucPham(){
        HangThucPham themHtp = new HangThucPham();
        System.out.println("\tNhap hang thuc pham can them.");
        nhap(themHtp);
        for (int i=0; i<listThucPham.size(); i++){
            if (themHtp.getMaHang().compareToIgnoreCase(listThucPham.get(i).getMaHang())!=0){
                System.out.println("Them hang thuc pham thanh cong.");
                listThucPham.add(themHtp);
            } else {
                System.out.println("Ma hang thuc pham bi trung, khong the them.");
                break;
            }
        }
    }

    public static void nhapDSTP(){
        System.out.print("So hang thuc pham can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Hang hoa thu " + (i+1));
            nhapThucPham();
        }
    }
}
