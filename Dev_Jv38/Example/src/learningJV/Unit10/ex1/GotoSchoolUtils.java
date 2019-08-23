package learningJV.Unit10.ex1;

public class GotoSchoolUtils {
    public static void main(String[] args) {
        GotoSchool jv = new GotoSchool(5);
        GotoSchool php = new GotoSchool(4);
        GotoSchool tes = new GotoSchool(7);

        jv.setName("Java");
        php.setName("PHP");
        tes.setName("Tester");
        jv.start();
        php.start();
        tes.start();

        try {
            while (php.isAlive() || jv.isAlive() || tes.isAlive()){
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ket thuc chuong trinh.");
    }
}
