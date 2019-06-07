import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void customFormat(String mau, double giaTri) {
        DecimalFormat df = new DecimalFormat(mau);
        String output = df.format(giaTri);
        System.out.println("Gia tri " + giaTri + " theo mau " + mau + " la: " + output);
    }

    public static void main(String[] args) {
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.00", 123.78);
        customFormat("$###,###.###", 12345.67);
        customFormat("###,##0.0#", 000.07);
    }
}