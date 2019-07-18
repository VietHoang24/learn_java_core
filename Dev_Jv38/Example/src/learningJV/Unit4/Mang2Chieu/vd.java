package learningJV.Unit4.Mang2Chieu;

public class vd {
    public static int [][] a = new int[][]{
            {3, 4, 6, 1},
            {2, 6, 1, 7},
            {1, 1, 2, 1}
    };

    public static void xuat(){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++)
                System.out.printf("%6d", a[i][j]);
            System.out.println();
        }
    }

    public static int tongDong(int[] d){
        int t = 0;
        for(int i=0; i<d.length; i++)
            t+=d[i];
        return t;
    }

    public static void maxDong(){
        int max = tongDong(a[0]);
        int index = 0;
        for(int i=1;i<a.length; i++){
            if(max<tongDong(a[i])){
                max = tongDong(a[i]);
                index = i;
            }
        }
        System.out.println("\nDong thu " + (index+1) + " co tong lon nhat.");
        System.out.println("Tong cac gia tri trong dong do la: " + max);
    }

    public static int tongCot(int j){
        int tc = 0;
        for(int i=0; i<a.length; i++)
            tc += a[i][j];
        return tc;
    }

    public static void minCot(){
        int min = tongCot(0);
        int index = 0;
        for(int j=1; j<a[0].length; j++){
            if(min>tongCot(j)){
                min = tongCot(j);
                index = j;
            }
        }
        System.out.println("\nCot thu " + (index+1) + " co tong nho nhat.");
        System.out.println("Tong cac gia tri trong dong do la: " + min);
    }

    public static void main(String[] args) {
        System.out.println("Ma tran khoi tao:");
        xuat();
        maxDong();
        minCot();
    }
}
