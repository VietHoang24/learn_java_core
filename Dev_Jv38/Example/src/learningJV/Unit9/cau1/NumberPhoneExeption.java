package learningJV.Unit9.cau1;

public class NumberPhoneExeption extends Exception {
    private String message;

    public NumberPhoneExeption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
