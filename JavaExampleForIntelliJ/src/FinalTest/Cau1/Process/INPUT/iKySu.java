package FinalTest.Cau1.Process.INPUT;

import FinalTest.Cau1.Module.KySu;
import FinalTest.Cau1.Module.NguoiLaoDong;

public class iKySu extends iNguoiLaoDong {
    public static void nhapKySu(){
        NguoiLaoDong kySu = new KySu();
        nhapNguoiLaoDong(kySu);
        System.out.print("Xep loai: ");
        String xepLoai = input.nextLine();
        ((KySu) kySu).setXepLoai(xepLoai);
        System.out.print("He so luong: ");
        float heSoLuong = input.nextFloat();
        ((KySu) kySu).setHeSoLuong(heSoLuong);
        input.nextLine();
        nguoiLaoDongs.add(kySu);
    }

    public static void nhapDanhSachKySu(){
        System.out.print("So ky su can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("- Ky su thu" + (i+1));
            nhapKySu();
        }
    }
}
