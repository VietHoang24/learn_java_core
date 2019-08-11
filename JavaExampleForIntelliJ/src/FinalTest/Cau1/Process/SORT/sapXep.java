package FinalTest.Cau1.Process.SORT;

import FinalTest.Cau1.Module.NguoiLaoDong;
import FinalTest.Cau1.Process.INPUT.iNguoiLaoDong;

import java.util.Collections;
import java.util.Comparator;

public class sapXep extends iNguoiLaoDong {
    public static void sort(){
        Collections.sort(nguoiLaoDongs, new Comparator<NguoiLaoDong>() {
            @Override
            public int compare(NguoiLaoDong person1, NguoiLaoDong person2) {
                if (person1.getHoTen().compareToIgnoreCase(person2.getHoTen())>0){
                    return 1;
                } else {
                    if (person1.getHoTen().compareToIgnoreCase(person2.getHoTen())==0){
                        if (person1.getLuong()>person2.getLuong())  return 1;
                        else return -1;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
}
