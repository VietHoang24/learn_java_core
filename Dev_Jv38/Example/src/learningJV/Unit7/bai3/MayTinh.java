package learningJV.Unit7.bai3;

public class MayTinh extends HangDienTu {
    private int dungLuongHDD;
    private int dungLuongRAM;
    private double tocDoCPU;

    public MayTinh() {
    }

    public MayTinh(String maHang, String tenHang, int soLuong, double giaTien, String hangSanXuat, double congSuat, int dungLuongHDD, int dungLuongRAM, double tocDoCPU) {
        super(maHang, tenHang, soLuong, giaTien, hangSanXuat, congSuat);
        this.dungLuongHDD = dungLuongHDD;
        this.dungLuongRAM = dungLuongRAM;
        this.tocDoCPU = tocDoCPU;
    }

    @Override
    public String toString() {
        return "MayTinh{" +
                "dungLuongHDD=" + dungLuongHDD +
                ", dungLuongRAM=" + dungLuongRAM +
                ", tocDoCPU=" + tocDoCPU +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", congSuat=" + congSuat +
                ", maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soLuong=" + soLuong +
                ", giaTien=" + giaTien +
                '}';
    }
}
