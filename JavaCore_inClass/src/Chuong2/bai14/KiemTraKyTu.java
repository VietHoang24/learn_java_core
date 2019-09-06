package Chuong2.bai14;

import java.util.Scanner;

public class KiemTraKyTu {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String a;
        System.out.print("Nhap chuoi bat ky: ");
        a = input.nextLine();
        for(int i=0; i<a.length(); i++){
            if(Character.isLetter(a.charAt(i))){
                System.out.print(a.charAt(i));
            } else{
                System.out.println();
            }
        }
        System.out.println();
    }
}
