package learningJV.Unit7.bai3;

public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuong;
    protected double giaTien;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, int soLuong, double giaTien) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "HangHoa{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soLuong=" + soLuong +
                ", giaTien=" + giaTien +
                '}';
    }
}
