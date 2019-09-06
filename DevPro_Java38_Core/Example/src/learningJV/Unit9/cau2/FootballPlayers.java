package learningJV.Unit9.cau2;

public class FootballPlayers {
    private int ma;
    private String hoDem;
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String viTri;
    private double luong;

    public FootballPlayers() {
    }

    public FootballPlayers(int ma, String hoDem, String ten, int tuoi, String gioiTinh, String viTri, double luong) {
        this.ma = ma;
        this.hoDem = hoDem;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
