package learningJV.Unit10.ex2;

public class SendOrReceiveUtils {
    public static void main(String[] args) {
        Thread send = new Thread(new SendOrRecevie("send", 5));
        Thread receive = new Thread(new SendOrRecevie("receive", 6));
        send.start();
        receive.start();
    }
}
