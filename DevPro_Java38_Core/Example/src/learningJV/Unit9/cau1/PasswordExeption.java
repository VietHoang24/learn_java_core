package learningJV.Unit9.cau1;

public class PasswordExeption extends Exception {
    private String message;

    public PasswordExeption(String message) {
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
