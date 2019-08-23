package learningJV.Unit10.ex1;

public class GotoSchool extends Thread {
    private int amount;

    public GotoSchool(int amount) {
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            for (int i=1; i<=amount; i++) { System.out.println("HV thu " + i + " lop " + getName() + " den."); }
            Thread.sleep(50);
        } catch(InterruptedException e) {
            System.out.println("Thread " + getName() + " is interrupted.");
        }
    }
}
