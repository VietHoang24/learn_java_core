import java.util.Scanner;

public class TachSo {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //cach 1
        int a;
        System.out.print("Nhap vao so bat ky: ");
        a = input.nextInt();
        System.out.print("In nguoc lai so vua nhap:");
        while (a > 0) {
            System.out.print(a % 10);
            a /= 10;
        }
        System.out.println();

        //cach2
        int n;
        int[] x = new int[10];
        System.out.print("Nhap so: ");
        n = input.nextInt();
        int i=0;
        while(n>0){
            x[i] = n%10;
            n/=10;
            i++;
        }
        System.out.print("In nguoc so vua nhap: ");
        int dem = i;
        int tong = 0;
        for(int j=0; j<dem; j++){
            System.out.print(""+x[j]);
            tong+=x[j];
        }
        System.out.println("\nTong cac chu so la: "+tong);
    }
}
