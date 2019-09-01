package Controller;

import Module.*;

import java.util.Scanner;

public class Data_Input {
    static Scanner input = new Scanner(System.in);
    public static SinhVien nhapSinhVien() {
        SinhVien sinhVien = new SinhVien();
        System.out.print("Ma sinh vien  : ");
        String maSinhVien = input.nextLine();
        while (maSinhVien.length()<2 || Helper_Exception.kiemTraKyTuDacBiet(maSinhVien) || maSinhVien.equals("")) {
            System.out.print("Ma sinh vien phai nhieu hon 2 ky tu, va khong co ky tu dac biet. Moi nhap lai: ");
            maSinhVien = input.nextLine();
        }
        sinhVien.setMaSinhVien(maSinhVien);

        System.out.print("Ho dem        : ");
        String hoDem = input.nextLine();
        while (Helper_Exception.kiemTraKyTuDacBiet(hoDem) || Helper_Exception.kiemTraKyTuSo(hoDem) || hoDem.equals("")) {
            System.out.print("Ho dem khong duoc chua ky tu dac biet, va ky tu so. Moi nhap lai: ");
            hoDem = input.nextLine();
        }
        sinhVien.setHoDem(hoDem);

        System.out.print("Ten           : ");
        String ten = input.nextLine();
        while (Helper_Exception.kiemTraKyTuDacBiet(ten) || ten.length()<2 || Helper_Exception.kiemTraKyTuSo(ten) || hoDem.equals("")) {
            System.out.print("Ten khong duoc chua ky tu dac biet, ky tu so va phai nhieu hon 2 ky tu. Moi nhap lai: ");
            ten = input.nextLine();
        }
        sinhVien.setTen(ten);

        System.out.print("Nam sinh      : ");
        int namSinh = input.nextInt();
        while (!Helper_Exception.kiemTraNam(namSinh)) {
            System.out.print("Nam khong duoc la nam the ky, va khong duoc am. Moi nhap lai: ");
            namSinh = input.nextInt();
        }
        input.nextLine();
        sinhVien.setNamSinh(namSinh);

        System.out.print("Gioi tinh     : ");
        String gioiTinh = input.nextLine();
        if (!Helper_Exception.kiemTraGioiTinh(gioiTinh)) {
            System.out.print("Gioi tinh phai la Nam hoac Nu. Moi nhap lai: ");
            gioiTinh = input.nextLine();
        }
        sinhVien.setGioiTinh(gioiTinh);

        return sinhVien;
    }

    public static MonHoc nhapMonHoc() {
        MonHoc monHoc = new MonHoc();
        System.out.print("Ma mon hoc    : ");
        String maMonHoc = input.nextLine();
        while (maMonHoc.length()<2 || Helper_Exception.kiemTraKyTuDacBiet(maMonHoc) || maMonHoc.equals("")) {
            System.out.print("Ma mon hoc khong duoc co ky tu dac biet, va phai co nhieu hon 2 ky tu. Moi nhap lai: ");
            maMonHoc = input.nextLine();
        }
        monHoc.setMaMonHoc(maMonHoc);

        System.out.print("Ten mon hoc   : ");
        String tenMonHoc = input.nextLine();
        while (tenMonHoc.length()<2 || Helper_Exception.kiemTraKyTuDacBiet(tenMonHoc) || tenMonHoc.equals("")) {
            System.out.print("Ten mon hoc khong duoc co ky tu dac biet, va phai co nhieu hon 2 ky tu. Moi nhap lai: ");
            tenMonHoc = input.nextLine();
        }
        monHoc.setTenMonHoc(tenMonHoc);

        System.out.print("He so mon hoc (0<n<5): ");
        int heSo = input.nextInt();
        while (heSo<1 || heSo>4) {
            System.out.print("He so mon hoc phai luon duong va khong duoc vuot qua 4. Moi nhap lai: ");
            heSo = input.nextInt();
        }
        input.nextLine();
        monHoc.setHeSoMonHoc(heSo);

        return monHoc;
    }

    public static Diem nhapDiem() {
        Diem diem = new Diem();
        System.out.print("Ma sinh vien  : ");
        String maSinhVien = input.nextLine();
        while (maSinhVien.length()<2 || Helper_Exception.kiemTraKyTuDacBiet(maSinhVien) || maSinhVien.equals("")) {
            System.out.print("Ma sinh vien phai nhieu hon 2 ky tu, va khong co ky tu dac biet. Moi nhap lai: ");
            maSinhVien = input.nextLine();
        }
        diem.setMaSinhVien(maSinhVien);

        System.out.print("Ma mon hoc    : ");
        String maMonHoc = input.nextLine();
        while (maMonHoc.length()<2 || Helper_Exception.kiemTraKyTuDacBiet(maMonHoc) || maMonHoc.equals("")) {
            System.out.print("Ma mon hoc khong duoc co ky tu dac biet, va phai co nhieu hon 2 ky tu. Moi nhap lai: ");
            maMonHoc = input.nextLine();
        }
        diem.setMaMonHoc(maMonHoc);

        System.out.print("Diem mon hoc: ");
        float diemSo = input.nextFloat();
        while (diemSo<0 || diemSo>10) {
            System.out.print("Diem thanh phan phai luon duong va khong vuot qua 10. Moi nhap lai: ");
            diemSo = input.nextFloat();
        }
        input.nextLine();
        diem.setDiemSo(diemSo);

        return diem;
    }
}
