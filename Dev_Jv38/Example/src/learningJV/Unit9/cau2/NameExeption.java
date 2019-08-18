package learningJV.Unit9.cau2;

public class NameExeption extends Exception {
    private String message;

    public NameExeption(String message) {
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
