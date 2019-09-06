package learningJV.Unit9.cau1;

import java.util.ArrayList;
import java.util.Scanner;

public class AllUtils {
    private static ArrayList<Users> list = new ArrayList<>();
    private static int autoCode = 1;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            addUser();
            addPassword();
            checkDate();
            addNumberPhone();
        } catch (UsernameExeption eU){
            System.out.println(eU.getMessage());
        } catch (PasswordExeption eP){
            System.out.println(eP.getMessage());
        } catch (DateExeption eD) {
            System.out.println(eD.getMessage());
        } catch (NumberPhoneExeption eN){
            System.out.println(eN.getMessage());
        }
    }

    public static void addUser() throws UsernameExeption{
        String username = " ";
        System.out.print("Username: ");
        username = in.nextLine();
        if (username.length()<8) throw new UsernameExeption("Ten khong duoc duoi 8 ky tu.");
        else {
            for (int i=0; i<username.length(); i++){
                char let = username.charAt(i);
                if (!isLower(let) && !isUpper(let) && !isDigit(let))
                    throw new UsernameExeption("Ten dang nhap khong hop le.");
            }
        }
    }

    public static void addPassword() throws PasswordExeption{
        String password = " ";
        System.out.print("Password: ");
        password = in.nextLine();
        if (password.length()<6) throw new PasswordExeption("Mat khau khong duoi 6 ky tu.");
        else {
            int checkL=0;
            for (int i=0; i<password.length(); i++){
                char let = password.charAt(i);
                if (isLower(let)) checkL=1; break;
            }
            if (checkL==0) throw new PasswordExeption("Mat khau phai co chu cai thuong.");

            int checkU=0;
            for (int i=0; i<password.length(); i++){
                char let = password.charAt(i);
                if (isUpper(let)) checkU=1; break;
            }
            if (checkU==0) throw new PasswordExeption("Mat khau phai co chu cai hoa.");

            int checkD=0;
            for (int i=0; i<password.length(); i++){
                char let = password.charAt(i);
                if (isDigit(let)) checkD=1; break;
            }
            if (checkD==0) throw new PasswordExeption("Mat khau phai co ky tu so.");

            int checkS=0;
            for (int i=0; i<password.length(); i++){
                char let = password.charAt(i);
                if (isSpecial(let)) checkS=1; break;
            }
            if (checkS==0) throw new PasswordExeption("Mat khau phai co ky tu dac biet.");
        }
    }

    public static void checkDate() throws DateExeption {
        System.out.print("Nam sinh: ");
        String strYear = in.nextLine();
        if (!isIntergerNumber(strYear)) {
            System.out.println("Nam phai phai so nguyen.");
            return;
        }
        int year = Integer.parseInt(strYear);
        if(year%100==0) throw new DateExeption("Nam khong duoc la nam the ky.");

        System.out.print("Thang sinh: ");
        String strMonth = in.nextLine();
        if(!isIntergerNumber(strMonth)) {
            System.out.println("Thang phai la so nguyen.");
            return;
        }
        int month = Integer.parseInt(strMonth);
        if(month<1 || month>12) throw new DateExeption("Thang khong duoc nho hon 1 hoac lon hon 12.");

        System.out.print("Ngay sinh: ");
        String strDay = in.nextLine();
        if(!isIntergerNumber(strDay)) {
            System.out.println("Thang phai la so nguyen.");
            return;
        }
        int day = Integer.parseInt(strDay);
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(day<1 || day>31) throw new DateExeption("Ngay trong thang " + month + " khong duoc vuot qua 31 ngay.");
            case 4: case 6: case 9: case 11:
                if (day<1 || day>30) throw new DateExeption("Ngay trong thang " + month +" khong duoc vuot qua 30 ngay.");
            case 2:
                if(year%4==0) {
                    if (day<1 || day>29) throw new DateExeption("Nam nhuan nen ngay trong thang 2 khong duoc vuot qua 29 ngay.");
                } else {
                    if (day<1 || day>28) throw new DateExeption("Nam nhuan nen ngay trong thang 2 khong duoc vuot qua 28 ngay.");
                }


        }
    }

    public static void addNumberPhone() throws NumberPhoneExeption {
        System.out.print("So dien thoai: ");
        String strNum = in.nextLine();
        if(strNum.length()<0 || strNum.length()>10) throw new NumberPhoneExeption("So dien thoai khong duoc qua 10 chu so.");
    }

    public static boolean isIntergerNumber(String s){
        for (int i=0; i<s.length(); i++){
            if (!isDigit(s.charAt(i)))  return false;
        }
        return true;
    }

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
}
