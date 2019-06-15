import mypack.XuLyPhuongTrinh;

public class PTB2 {
    public static void main(String[] args) {
        XuLyPhuongTrinh a = new XuLyPhuongTrinh();
        System.out.println("- Nhap cac he so phuong trinh");
        a.nhap();
        System.out.println("- Giai va bien luan phuong trinh");
        a.xuLy();
    }
}