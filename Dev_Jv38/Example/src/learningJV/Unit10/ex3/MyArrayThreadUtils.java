package learningJV.Unit10.ex3;

public class MyArrayThreadUtils {
    public static void main(String[] args) {
        MyArrayThread t1 = new MyArrayThread(0);
        MyArrayThread t2 = new MyArrayThread(1);
        t1.start();
        t2.start();

        try {
            while (t1.isAlive() || t2.isAlive()){
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("a: ");
        MyArrayThread.display();
    }
}
