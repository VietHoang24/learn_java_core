package learningJV.Unit9.cau2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class AllUtils {
    static ArrayList<FootballPlayers> list = new ArrayList<>();
    public static final String TV = "Tien ve";
    public static final String TD = "Tien dao";
    public static final String HV = "Hau ve";
    public static final String TM = "Thu mon";
    public static int autoCode = 1;

    public static void main(String[] args) {
        list.add(new FootballPlayers());

        int choose;
        System.out.println("--------Chuong trinh quan ly cau thu--------");
        System.out.println("Chon 1 trong cac chuc nang quan ly cau thu:");
        System.out.println("1. Them 1 cau thu moi.");
        System.out.println("2. Hien thi danh sach cau thu.");
        System.out.println("3. Chen cau thu vao danh sach.");
        System.out.println("4. Sap xep danh sach cau thu theo ten.");
        System.out.println("5. Hien thi danh sach cau thu theo vi tri.");
        System.out.println("6. Hien thi thong tin cau thu theo ma.");
        System.out.println("0. Thoat chuong trinh.");
        do {
            System.out.print("Chon 1 chuc nang quan ly cau thu: ");
            choose = Helpers.in.nextInt();
            Helpers.in.nextLine();
            switch (choose) {
                case 1:
                    try {
                        addNewPlayer();
                    } catch (NameExeption e) {
                        System.out.println(e.getMessage());
                    } break;
                case 2:
                    hienThi(); break;
                case 3:
                    try {
                        chen();
                    } catch (NameExeption e) {
                        System.out.println(e.getMessage());
                    }
                case 4:
                    sapXep(); break;
                case 5:
                    hienThiViTri(); break;
                case 6:
                    htTheoMa(); break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public static void addNewPlayer() throws NameExeption{
        System.out.println("------Them cau thu moi vao danh sach------");

        int ma = autoCode;

        System.out.print("Ho dem: ");
        String hoDem = Helpers.in.nextLine();
        if (hoDem.isEmpty() || !Helpers.isName(hoDem)){
            throw new NameExeption("Ho dem khong hop le, hoac de trong.");
        }
        System.out.print("Ten: ");
        String ten = Helpers.in.nextLine();
        if (ten.isEmpty() || !Helpers.isName(ten)){
            throw new NameExeption("Ten khong hop le, hoac de trong.");
        }

        System.out.print("Tuoi: ");
        String strNum = Helpers.in.nextLine();
        if (!Helpers.isIntergerNumber(strNum)){
            System.out.println("Tuoi phai la so nguyen.");
            return;
        }
        int tuoi = Integer.parseInt(strNum);
        if(!Helpers.isValidAge(tuoi)){
            System.out.println("Tuoi phai tu 16 den 40.");
            return;
        }

        String gioiTinh = "Nam";
        System.out.println("Gioi tinh: " + gioiTinh);

        System.out.println("Chon vi tri thi dau: ");
        System.out.println("1. Tien dao.");
        System.out.println("2. Tien ve.");
        System.out.println("3. Hau ve.");
        System.out.println("4. Thu mon.");
        System.out.print("Nhap vi tri cau thu: ");
        int viTri = Helpers.in.nextInt();
        Helpers.in.nextLine();
        if (viTri!=1&&viTri!=2&&viTri!=3&&viTri!=4){
            System.out.println("Vi tri khong hop le.");
            return;
        }
        String viTriCauThu = "";
        switch (viTri){
            case 1: viTriCauThu = TD; break;
            case 2: viTriCauThu = TV; break;
            case 3: viTriCauThu = HV; break;
            case 4: viTriCauThu = TM; break;
        }

        System.out.print("Luong: ");
        String luong = Helpers.in.nextLine();
        if (!Helpers.isIntergerNumber(luong)){
            System.out.println("Luong phai la so nguyen.");
            return;
        }
        double luongCT = Double.parseDouble(luong);

        FootballPlayers player = new FootballPlayers(ma, hoDem, ten, tuoi, gioiTinh, viTriCauThu, luongCT);
        list.add(player);
        autoCode++;
    }

    public static void hienThi() {
        Locale local = new Locale("vi", "VN");
        NumberFormat nbF = NumberFormat.getInstance(local);
        System.out.println("\n=========Danh sach cau thu============");
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%n", "MaCT", "HoDem", "Ten", "Tuoi", "GioiTinh", "ViTri", "Luong");
        for (FootballPlayers player : list) {
            String totalMoney = nbF.format(player.getLuong());
            System.out.printf("%20d%20s%20s%20d%20s%20s%20s%n",
                    player.getMa(),
                    player.getHoDem(),
                    player.getTen(),
                    player.getTuoi(),
                    player.getGioiTinh(),
                    player.getViTri(),
                    totalMoney);
        }
    }

    public static void chen() throws NameExeption{
        System.out.println("Chen them cau thu vao vi tri...");
        System.out.print("Nhap vi tri can chen: ");
        int k = Helpers.in.nextInt();
        Helpers.in.nextLine();
        if (k>list.size() || k<0){
            System.out.println("Vi tri khong hop le.");
            return;
        }

        System.out.println("Nhap thong tin cau thu moi.");
        int ma = autoCode;

        System.out.print("Ho dem: ");
        String hoDem = Helpers.in.nextLine();
        if (hoDem.isEmpty() || !Helpers.isName(hoDem)){
            throw new NameExeption("Ho dem khong hop le, hoac de trong.");
        }
        System.out.print("Ten: ");
        String ten = Helpers.in.nextLine();
        if (ten.isEmpty() || !Helpers.isName(ten)){
            throw new NameExeption("Ten khong hop le, hoac de trong.");
        }

        System.out.print("Tuoi: ");
        String strNum = Helpers.in.nextLine();
        if (!Helpers.isIntergerNumber(strNum)){
            System.out.println("Tuoi phai la so nguyen.");
            return;
        }
        int tuoi = Integer.parseInt(strNum);
        if(!Helpers.isValidAge(tuoi)){
            System.out.println("Tuoi phai tu 16 den 40.");
            return;
        }

        String gioiTinh = "Nam";
        System.out.println("Gioi tinh: " + gioiTinh);

        System.out.println("Chon vi tri thi dau: ");
        System.out.println("1. Tien dao.");
        System.out.println("2. Tien ve.");
        System.out.println("3. Hau ve.");
        System.out.println("4. Thu mon.");
        System.out.print("Nhap vi tri cau thu: ");
        int viTri = Helpers.in.nextInt();
        Helpers.in.nextLine();
        if (viTri!=1&&viTri!=2&&viTri!=3&&viTri!=4){
            System.out.println("Vi tri khong hop le.");
            return;
        }
        String viTriCauThu = "";
        switch (viTri){
            case 1: viTriCauThu = TD; break;
            case 2: viTriCauThu = TV; break;
            case 3: viTriCauThu = HV; break;
            case 4: viTriCauThu = TM; break;
        }

        System.out.print("Luong: ");
        String luong = Helpers.in.nextLine();
        if (!Helpers.isIntergerNumber(luong)){
            System.out.println("Luong phai la so nguyen.");
            return;
        }
        double luongCT = Double.parseDouble(luong);

        FootballPlayers player = new FootballPlayers(ma, hoDem, ten, tuoi, gioiTinh, viTriCauThu, luongCT);
        list.add(k, player);
        autoCode++;
    }

    public static void sapXepViTri() {
        Collections.sort(list, new Comparator<FootballPlayers>() {
            @Override
            public int compare(FootballPlayers o1, FootballPlayers o2) {
                return o1.getViTri().compareToIgnoreCase(o2.getViTri());
            }
        });
    }

    public static void sapXepTen() {
        Collections.sort(list, new Comparator<FootballPlayers>() {
            @Override
            public int compare(FootballPlayers o1, FootballPlayers o2) {
                return o1.getTen().compareToIgnoreCase(o2.getTen());
            }
        });
    }

    public static void sapXep() {
        System.out.println("Sap xep danh sach cau thu.");
        System.out.println("Chon cach sap xep ban muon xem");
        System.out.println("1. Sap xep theo ten cau thu.");
        System.out.println("2. Sap xep theo vi tri cau thu.");
        System.out.println("0. Quay lai.");
        do {
            System.out.print("Hay chon cach sap xep: ");
            int choose = Helpers.in.nextInt();
            Helpers.in.nextLine();
            switch (choose) {
                case 1:
                    sapXepTen();
                    System.out.println("Sap xep thanh cong.");
                    break;
                case 2:
                    sapXepViTri();
                    System.out.println("Sap xep thanh cong.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Khong hop le, chon lai...");
            }
        } while (true);
    }

    public static void hienThiViTri(){
        System.out.println("Chon vi tri can xem.");
        System.out.println("1. Tien dao");
        System.out.println("2. Tien ve");
        System.out.println("3. Hau ve");
        System.out.println("4. Thu mon");
        System.out.print("Vi tri cau thu can xem: ");
        int vt = Helpers.in.nextInt();
        Helpers.in.nextLine();
        if (vt!=1&&vt!=2&&vt!=3&&vt!=4){
            System.out.println("Vi tri khong hop le.");
            return;
        }
        String vtThiDau = "";
        switch (vt) {
            case 1: vtThiDau = TD; break;
            case 2: vtThiDau = TV; break;
            case 3: vtThiDau = HV; break;
            case 4: vtThiDau = TM; break;
        }

        Locale local = new Locale("vi", "VN");
        NumberFormat nbF = NumberFormat.getInstance(local);
        System.out.println("\n=========Danh sach cau thu============");
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%n", "MaCT", "HoDem", "Ten", "Tuoi", "GioiTinh", "ViTri", "Luong");
        int dem = 0;
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).getViTri().compareToIgnoreCase(vtThiDau)==0){
                dem++;
                String totalMoney = nbF.format(list.get(i).getLuong());
                System.out.printf("%20d%20s%20s%20d%20s%20s%20s%n",
                        list.get(i).getMa(),
                        list.get(i).getHoDem(),
                        list.get(i).getTen(),
                        list.get(i).getTuoi(),
                        list.get(i).getGioiTinh(),
                        list.get(i).getViTri(),
                        totalMoney);
            }
        }

        if (dem==0)
            System.out.println("Khong co cau thu nao o vi tri nay.");
    }

    public static int indexOfMa(int ma) {
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getMa()==ma)
                return i;
        }
        return -1;
    }

    public static void htTheoMa(){
        System.out.print("Nhap ma cau thu: ");
        int ma = Helpers.in.nextInt();
        if (indexOfMa(ma)==-1) {
            System.out.println("Ma cau thu khong ton tai.");
            return;
        }

        Locale local = new Locale("vi", "VN");
        NumberFormat nbF = NumberFormat.getInstance(local);
        System.out.println("\n=========Danh sach cau thu============");
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%n", "MaCT", "HoDem", "Ten", "Tuoi", "GioiTinh", "ViTri", "Luong");
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).getMa()==ma){
                String totalMoney = nbF.format(list.get(i).getLuong());
                System.out.printf("%20d%20s%20s%20d%20s%20s%20s%n",
                        list.get(i).getMa(),
                        list.get(i).getHoDem(),
                        list.get(i).getTen(),
                        list.get(i).getTuoi(),
                        list.get(i).getGioiTinh(),
                        list.get(i).getViTri(),
                        totalMoney);
            }
        }
    }
}
