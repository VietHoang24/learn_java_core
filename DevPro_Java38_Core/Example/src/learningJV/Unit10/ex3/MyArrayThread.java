package learningJV.Unit10.ex3;

import java.util.ArrayList;

public class MyArrayThread extends Thread {
    public static int[] a = new int[50];
    int start;

    public MyArrayThread(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        int k = (this.start==0) ? 7 : 4;
        int inc = k;
        for (int i=start; i<a.length; i+=2) {
            a[i] = k;
            k+=inc;
        }
    }

    public int getLength(){
        return a.length;
    }

    public int getElement(int i){
        return a[i];
    }

    public static void display() {
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
