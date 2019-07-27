package VuVanHung_Day7.Module;

public class CongNhan extends NhanSu {
    private XuongSX xuongSX;
    private String congViec;
    private int soNgayCong;
    private double luong;

    public CongNhan() {
    }

    public CongNhan(XuongSX xuongSX, String congViec, int soNgayCong, double luong) {
        this.xuongSX = xuongSX;
        this.congViec = congViec;
        this.soNgayCong = soNgayCong;
        this.luong = luong;
    }

    public XuongSX getXuongSX() {
        return xuongSX;
    }

    public void setXuongSX(XuongSX xuongSX) {
        this.xuongSX = xuongSX;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public double getLuong() {
        return tinhLuong();
    }

    public void inputCN(){
        super.input();

        xuongSX = new XuongSX();
        System.out.print("Ten xuong: ");
        String tenXuong = input.nextLine();
        xuongSX.setTenXuong(tenXuong);

        System.out.print("Quan doc: ");
        String quanDoc = input.nextLine();
        xuongSX.setQuanDoc(quanDoc);

        System.out.print("So cong nhan: ");
        int soCN = input.nextInt();
        input.nextLine();
        xuongSX.setSoCongNhan(soCN);

        System.out.print("Cong viec: ");
        congViec = input.nextLine();

        System.out.print("So ngay cong: ");
        soNgayCong = input.nextInt();
        input.nextLine();
    }

    public double tinhLuong(){
        if (soNgayCong>=23){
            luong = soNgayCong*25000 + 500000;
        } else {
            if (soNgayCong>=20){
                luong = soNgayCong*250000 + 300000;
            } else {
                if (soNgayCong>=18){
                    luong = soNgayCong*250000;
                } else {
                    luong = soNgayCong*250000 - 200000;
                }
            }
        }
        return luong;
    }

    public static void tieuDe(){
        System.out.printf("%15s%15s%15s%15s%15s%15s%n", "Ten Xuong",
                "Quan Doc", "So Cong Nhan", "Cong Viec", "So Ngay Cong", "Luong");
    }

    public void outputCN(){
        super.output();
        System.out.printf("%15s%15s%15d%15s%15d%15.2f%n", xuongSX.getTenXuong(),
                xuongSX.getQuanDoc(), xuongSX.getSoCongNhan(), congViec, soNgayCong, tinhLuong());
    }
}
