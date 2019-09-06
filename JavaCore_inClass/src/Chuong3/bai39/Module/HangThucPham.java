package Chuong3.bai39.Module;
import java.util.Date;

public class HangThucPham extends HangHoa {
    private final double vat = 0.05;
    private DMY nsx;
    private DMY hsd;
    private String ncc;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, int soLuongTonKho, double donGia, DMY nsx, DMY hsd, String ncc) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.nsx = nsx;
        this.hsd = hsd;
        this.ncc = ncc;
    }

    public double getVat() {
        return vat;
    }

    public DMY getNsx() {
        return nsx;
    }

    public void setNsx(DMY nsx) {
        this.nsx = nsx;
    }

    public DMY getHsd() {
        return hsd;
    }

    public void setHsd(DMY hsd) {
        this.hsd = hsd;
    }

    public String getNcc() {
        return ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    @Override
    public String danhGia(){
        Date date = new Date();
        if (getSoLuongTonKho()>0 && getHsd().toString().compareTo(date.getDay()+"/ "+date.getMonth()+"/ "+date.getYear())>0){
            return "Kho ban";
        } else {
            return " ";
        }
    }
}
