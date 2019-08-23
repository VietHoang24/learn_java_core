package learningJV.Unit11.ex2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("input.txt");
            for (char c = 'a'; c<='z'; c++){
                fout.write(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fout.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
