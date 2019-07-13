package VuVanHung_Day4.ArrayString.Process;

import VuVanHung_Day4.ArrayString.Module.HoGiaDinh;

import java.util.Collections;
import java.util.Comparator;

public class SapTen extends input {
    public static void sapXep(){
        Collections.sort(listHoGD, new Comparator<HoGiaDinh>() {
            @Override
            public int compare(HoGiaDinh hoGD1, HoGiaDinh hoGD2) {
                if(hoGD1.getTen().compareTo(hoGD2.getTen())>0)
                    return 1;
                else
                    return -1;
            }
        });
    }
}
