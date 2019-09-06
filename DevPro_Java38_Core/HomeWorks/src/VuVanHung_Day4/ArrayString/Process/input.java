package VuVanHung_Day4.ArrayString.Process;

import VuVanHung_Day4.ArrayString.Module.HoGiaDinh;

import java.util.ArrayList;
import java.util.Scanner;

public class input {
    static Scanner input = new Scanner(System.in);
    static ArrayList<HoGiaDinh> listHoGD = new ArrayList<HoGiaDinh>();
    public static void nhap(){
        HoGiaDinh a = new HoGiaDinh();
        System.out.print("Ten chu ho: ");
        String name = input.nextLine();
        a.setTen(name);
        System.out.print("So kwh: ");
        int soDien = input.nextInt();
        a.setSoKwh(soDien);
        input.nextLine();

        listHoGD.add(a);
    }

    public static void nhapDS(){
        System.out.print("Tong so ho gia dinh can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("-> Ho gia dinh thu " + (i+1));
            nhap();
        }
    }
}
