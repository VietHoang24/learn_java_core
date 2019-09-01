package Controller;

import java.sql.PreparedStatement;

public class Database_Delete {
    public static boolean xoaSinhVien(String maSinhVien){
        int result = 0;
        String sqlDeleteSV = "DELETE FROM SinhVien WHERE maSinhVien=?";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlDeleteSV);
            ps.setString(1, maSinhVien);
            result = ps.executeUpdate();
        } catch (Exception e) {e.printStackTrace();}
        return result>0;
    }

    public static boolean xoaMonHoc(String maMonHoc){
        int result = 0;
        String sqlDeleteMH = "DELETE FROM MonHoc WHERE maMonHoc=?";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlDeleteMH);
            ps.setString(1, maMonHoc);
            result = ps.executeUpdate();
        } catch (Exception e) {e.printStackTrace();}
        return result>0;
    }

    public static boolean xoaDiem(String maSinhVien, String maMonHoc){
        int result = 0;
        String sqlDeleteSV = "DELETE FROM SinhVien WHERE maSinhVien=?, maMonHoc=?";
        try {
            PreparedStatement ps = Database_Connect.getConnection().prepareStatement(sqlDeleteSV);
            ps.setString(1, maSinhVien);
            ps.setString(2, maMonHoc);
            result = ps.executeUpdate();
        } catch (Exception e) {e.printStackTrace();}
        return result>0;
    }
}
