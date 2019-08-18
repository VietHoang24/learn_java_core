package learningJV.Unit9.cau1;

public class DateExeption extends Exception {
    private String message;

    public DateExeption(String message) {
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
