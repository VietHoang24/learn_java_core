package VuVanHung_Day4.Mang2Chieu;

public class ViDu {
    public static int[][] a = new int[][]{
            {1, 3, 4, 6},
            {2, 4, 5, 7},
            {4, 6, 7, 9},
            //{5, 3, 6, 2}
    };

    public static void xuat(int[][] x){
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                System.out.printf("%6d", x[i][j]);
            }
            System.out.println();
        }
    }

    public static void chuyenVi(int[][] b){
        for(int i=0; i<a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
    }

    public static void tichMT(int[][] b){
        int[][] kq = new int[3][3];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                for(int x=0; x<a[i].length; x++)
                    kq[i][j]+=a[i][x]*b[x][j];
            }
        }
        xuat(kq);
    }

    public static void main(String[] args) {
        int[][] b = new int[4][3];
        chuyenVi(b);
        System.out.println("Ma tran chuyen vi cua ma tran a la:");
        xuat(b);

        System.out.println("\nTich cua ma tran a va ma tran chuyen vi la:");
        tichMT(b);
    }
}
