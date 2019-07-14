package Chuong3.bai33.Main;

import Chuong3.bai33.IO.*;

public class Main {
    public static void main(String[] args) {
        inputSinhVien.nhapDSSV();
        System.out.println("\tY/C1");
        outputSinhVien.tieuDeSV();
        outputSinhVien.xuatDSSV();
        System.out.println("\tY/C2");
        outputSinhVien.phieuBaoDiem();
    }
}
