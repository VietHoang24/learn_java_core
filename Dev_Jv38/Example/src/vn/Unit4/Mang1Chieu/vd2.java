package vn.Unit4.Mang1Chieu;

public class vd2 {
    private static int n;

    public static void insert(int[] a, int bit){
        for (int i=n-1; i>=0; i--){
            a[i+1] = a[i];
        }
        a[0] = bit;
        n++;
    }

    public static void xuat(int[] a){
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void chuyen(int[] a, long k){
        while(k>0){
            insert(a, (int)k%2);
            k/=2;
        }
    }

    public static void main(String[] args) {
        long k = 324323;
        int[] a = new int[64];
        chuyen(a, k);
        System.out.print(k + " = ");
        xuat(a);
    }
}
