package learningJV.Unit9.cau1;

public class UsernameExeption extends Exception {
    private String message;

    public UsernameExeption(String message) {
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
