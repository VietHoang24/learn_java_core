package TestCuoiKhoa.Controller.Process;

import TestCuoiKhoa.Module.*;
import java.util.Scanner;

public class nhapDiem {
    static Scanner input = new Scanner(System.in);

    public static void nhapD(tblMonHoc mh) {
        tblMonHoc diem = new tblDiem();
        System.out.print("Diem so: ");
        float diemSo = input.nextFloat();
        input.nextLine();
        ((tblDiem) diem).setDiemSo(diemSo);
    }
}
