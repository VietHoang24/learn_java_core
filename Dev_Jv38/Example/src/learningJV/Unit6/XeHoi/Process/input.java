package learningJV.Unit6.XeHoi.Process;

import learningJV.Unit6.XeHoi.Module.XeHoi;

import java.util.Scanner;

public class input {
    static Scanner input = new Scanner(System.in);
    static XeHoi car = new XeHoi("MAZ", "Toyota", "Toyota", "Sport", 350000, "USA");

    public static void menuSuaTT(){
        System.out.println("\n===== Menu Thong Tin =====");
        System.out.println("1. Sua nhan hieu.");
        System.out.println("2. Sua nha san xuat.");
        System.out.println("3. Sua kieu dang.");
        System.out.println("4. Sua gia tien.");
        System.out.println("5. Sua xuat xu.");
        System.out.println("6. Thoat.");
        System.out.println("==========================");
    }

    public static void luaChon(int n){
        switch (n){
            case 1:
                System.out.print("Nhan hieu moi: ");
                String nhanHieu = input.nextLine();
                car.setNhanHieu(nhanHieu);
                break;
            case 2:
                System.out.print("Hang san xuat moi: ");
                String hang = input.nextLine();
                car.setHangSX(hang);
                break;
            case 3:
                System.out.print("Kieu dang moi: ");
                String kieu = input.nextLine();
                car.setKieuDang(kieu);
                break;
            case 4:
                System.out.print("Gia tien moi: ");
                double gia = input.nextInt();
                car.setGiaTien(gia);
                input.nextLine();
                break;
            case 5:
                System.out.print("Xuat xu moi: ");
                String xuatXu = input.nextLine();
                car.setXuatXu(xuatXu);
                break;
            case 6:
                System.err.println("Dung sua thong tin => EXIT");
                return;
        }
    }

    public static void suaThongTin(){
        do {
            menuSuaTT();
            System.out.print("Nhap lua chon ban muon sua: ");
            int n = input.nextInt();
            while (n<0 || n>6){
                System.out.print("Lua chon khong ton tai, moi nhap lai: ");
                n = input.nextInt();
            }
            input.nextLine();
            luaChon(n);
        } while (true);
    }
}
