package learningJV.Unit10.ex2;

public class SendOrRecevie implements Runnable {
    private String action;
    private int times;

    public SendOrRecevie(String action, int times) {
        this.action = action;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i=1; i<=times; i++) {
            System.out.println("U are " + action + "ing an email.");
        }
    }
}
