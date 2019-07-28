package learningJV.Unit8.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class TuDien {
    private static HashMap<String, String> hm = new HashMap<String, String>();
    static Scanner in = new Scanner(System.in);

    public static void display(){
        for (String key: hm.keySet()){
            System.out.println(key + ": " + hm.get(key));
        }
    }

    public static void traCuu(){
        String word;
        System.out.print("Enter word find: ");
        word = in.nextLine();

        System.out.println(word + " nghia la: " + hm.get(word));
    }

    public static void set(){
        System.out.println("Enter key: ");
        String key = in.nextLine();
        if (hm.containsKey(key)){
            System.out.print("Enter value edit: ");
            String value = in.nextLine();
            hm.put(key, value);
        } else {
            System.out.print("Key not find.");
        }
    }

    public static void remove(){
        System.out.print("Enter the key remove: ");
        String keyRemove = in.nextLine();
        if (hm.containsKey(keyRemove)){
            hm.remove(keyRemove);
        } else {
            System.out.println("Key not find.");
        }
    }

    public static void main(String[] args) {
        hm.put("hello", "Xinh Chao");
        hm.put("hi", "Chao ban");
        hm.put("computer", "May tinh");
        display();
        traCuu();

        hm.put("computer", "PC");
        System.out.println("\tAfter edit.");
        display();

        System.out.println("\nEdit any key...");
        set();
        display();

        System.out.println("Remove key.");
        remove();
        display();
    }
}
