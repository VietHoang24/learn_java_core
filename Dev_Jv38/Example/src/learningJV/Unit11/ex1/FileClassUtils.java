package learningJV.Unit11.ex1;

import java.io.File;
import java.io.FileOutputStream;

public class FileClassUtils {
    public static void test1(){
        File path = new File("", "abc.txt");
        if (path.mkdir()) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    public static void test2(){
        File path = new File("~/Desktop/JavaProgram", "abc.txt");
        if (path.isFile()) {
            System.out.println("OK");
        }
        System.out.println("Name: " + path.getName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Path: " + path.getPath());
    }

    public static void main(String[] args) {
        test1();
        test2();
    }
}
