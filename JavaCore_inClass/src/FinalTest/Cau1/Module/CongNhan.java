package FinalTest.Cau1.Module;

public class CongNhan extends NguoiLaoDong {
    private int soNgayCong;
    private double donGia;

    public CongNhan() {
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public double getLuong() {
        if (getSoNgayCong()>20) return getSoNgayCong()*getDonGia()+1000000;
        else if (getSoNgayCong()>15) return getSoNgayCong()*getDonGia()+500000;
        else if (getSoNgayCong()>10) return getSoNgayCong()*getDonGia()+200000;
        else return getSoNgayCong()*getDonGia();
    }
}
