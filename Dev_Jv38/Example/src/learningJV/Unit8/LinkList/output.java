package learningJV.Unit8.LinkList;

public class output extends input {
    public static void xuat(){
        System.out.println("Cac hinh chu nhat...");
        System.out.printf("%20s%20s%20s%20s%n", "Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
        for (int i=0; i<list.size(); i++){
            System.out.printf("%20f%20f%20f%20f%n", list.get(i).getCd(), list.get(i).getCr(), list.get(i).getChuVi(), list.get(i).getDienTich());
        }
    }
}
