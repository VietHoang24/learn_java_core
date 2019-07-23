package Chuong3.bai35;

public class ArtistDemo {
    public static void main(String[] args) {
        Shape shape;
        Artist art = new Artist();

        shape = new Rectangle(8, 4);
        art.drawShape(shape);

        shape = new RightTriangle(20);
        art.drawShape(shape);
    }
}
