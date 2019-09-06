package learningJV.Unit7.bai1;

public class Diem {
    private float x;
    private float y;

    public double distance(Diem B){
        return Math.sqrt(Math.pow(B.x-this.x, 2) + Math.pow(B.y-this.y, 2));
    }

    public Diem() {
    }

    public Diem(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
