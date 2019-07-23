package learningJV.Unit7.bai3;

public class HangDienTu extends HangHoa {
    protected String hangSanXuat;
    protected double congSuat;

    public HangDienTu() {
    }

    public HangDienTu(String maHang, String tenHang, int soLuong, double giaTien, String hangSanXuat, double congSuat) {
        super(maHang, tenHang, soLuong, giaTien);
        this.hangSanXuat = hangSanXuat;
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "HangDienTu{" +
                "hangSanXuat='" + hangSanXuat + '\'' +
                ", congSuat=" + congSuat +
                ", maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soLuong=" + soLuong +
                ", giaTien=" + giaTien +
                '}';
    }
}
