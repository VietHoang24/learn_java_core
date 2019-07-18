package Chuong3.bai35;

import java.util.Random;

public class Rectangle extends Shape {
    static Random rd = new Random();
    private int a, b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void nhap(){

    }

    @Override
    public void draw() {

    }
}
