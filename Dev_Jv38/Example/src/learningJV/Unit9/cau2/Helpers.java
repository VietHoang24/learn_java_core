package learningJV.Unit9.cau2;

import java.util.Scanner;

public class Helpers {
    public static Scanner in = new Scanner(System.in);

    public static boolean isLower(char let){
        return let>='a' && let<='z';
    }

    public static boolean isUpper(char let){
        return let>='A' && let<='Z';
    }

    public static boolean isDigit(char let){
        return let>='0' && let<='9';
    }

    public static boolean isSpecial(char let){
        String s = "~!@#$%^&*()_+";
        return s.indexOf(let)!=-1;
    }

    public static boolean isIntergerNumber(String s){
        for (int i=0; i<s.length(); i++){
            if (!isDigit(s.charAt(i)))  return false;
        }
        return true;
    }

    public static boolean isAlpha(char let) {
        return (let>='A' && let<='Z') || (let>='a' && let<='z');
    }

    public static boolean isName(String name) {
        if (!isAlpha(name.charAt(0))) return false;
        for (int i=1; i<name.length(); i++){
            if (!isAlpha(name.charAt(i)) && name.charAt(i)!=' ') return false;
        }
        return true;
    }

    public static boolean isValidAge(int age) {
        return age>=16 && age<=40;
    }
}