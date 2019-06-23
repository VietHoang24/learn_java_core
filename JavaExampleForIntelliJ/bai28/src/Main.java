import mypack.*;

public class Main {
    public static void main(String[] args){
        /*
        CNhanVien nv1 = new CNhanVien();
        CNhanVien nv2 = new CNhanVien();
        System.out.println("- Nhap nhan vien 1");
        nv1.nhap();
        System.out.println("- Nhap nhan vien 2");
        nv2.nhap();
        System.out.println("\n\t\t\t\t\t\t\t\t- Danh sach sinh vien\n");
        CNhanVien.xuatTieuDe();
        nv1.xuat();
        nv2.xuat();
        */
        /*
        //cach 1: su dung soSanhNV()
        if(nv1.soSanhNV(nv2)){
            System.out.println("\n=> So san pham cua nhan vien 1 lon hon so san pham cua nhan vien 2. ");
            System.out.println("\n=> So san pham chenh lech la: " + (nv1.getmSoSP()-nv2.getmSoSP()) );
        } else{
            System.out.println("\n=> So san pham cua nhan vien 1 khong lon hon so san pham cua nhan vien 2.");
        }
        */
        /*
        //cach 2: khong su dung soSanhNV()
        if(nv1.getmSoSP()>nv2.getmSoSP()){
            System.out.println("\n=> So san pham cua nhan vien 1 lon hon so san pham cua nhan vien 2. ");
            System.out.println("\n=> So san pham chenh lech la: " + (nv1.getmSoSP()-nv2.getmSoSP()) );
        } else{
            System.out.println("\n=> So san pham cua nhan vien 1 khong lon hon so san pham cua nhan vien 2.");
        }
        */

        //phan mo rong
        System.out.println("\n- Nhap vao danh sach nhan vien.\n");
        List a = new List();
        a.nhap();
        System.out.println("\n\t\t\t\t\t\t\t\t- Danh sach nhan vien vua nhap\n");
        a.xuat();
        System.out.println("\n\t\t\t- Danh sach nhan vien sau khi sap xep theo chieu tang dan cua luong\n");
        a.sort();
        a.xuat();
    }
}
