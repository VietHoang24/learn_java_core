package Controller;

public class Helper {
    public static boolean kiemTraNam(int nam) {
        return nam>0 && nam%100!=0;
    }

    public static void kiemTraKyTuSo(String check) {
        for (int i=0; i<check.length(); i++) {
            check.charAt(i)
        }
    }

    public static boolean kiemTraKyTuDacBiet(String check) {
        String s = "~`!@#$%^&*()_+-={}[]|:;'<,>.?";
        for (int i=0; i<check.length(); i++) {
            if (s.indexOf(check.charAt(i))!=-1) return true;
        }
        return false;
    }

    public static boolean kiemTraGioiTinh(String gioiTinh) {
        return gioiTinh.compareToIgnoreCase("nam")==0 || gioiTinh.compareToIgnoreCase("nu")==0;
    }
}
