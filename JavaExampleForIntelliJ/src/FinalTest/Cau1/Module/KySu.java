package FinalTest.Cau1.Module;

public class KySu extends NguoiLaoDong {
    private long luongCoBan = 1500000;
    private String xepLoai;
    private float heSoLuong;

    public KySu() {
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double getLuong() {
        if (getXepLoai().equalsIgnoreCase("a")) return getHeSoLuong()*luongCoBan+1000000;
        else if (getXepLoai().equalsIgnoreCase("b")) return getHeSoLuong()*luongCoBan+750000;
        else if (getXepLoai().equalsIgnoreCase("c")) return getHeSoLuong()*luongCoBan+500000;
        else return getHeSoLuong()*luongCoBan;
    }
}
