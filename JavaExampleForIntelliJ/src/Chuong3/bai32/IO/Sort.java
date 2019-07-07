package Chuong3.bai32.IO;

import Chuong3.bai32.Module.*;

import java.util.Collections;
import java.util.Comparator;

public class Sort extends input{
    public static void sapXep(){
        Collections.sort(list, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa hangHoa1, HangHoa hangHoa2) {
                if(hangHoa1.getTenHang().compareTo(hangHoa2.getTenHang())>0)
                    return 1;
                else if(hangHoa1.getTenHang().compareTo(hangHoa2.getTenHang())==0){
                    if(hangHoa1.getThanhTien()>hangHoa2.getThanhTien())
                        return 1;
                    else
                        return -1;
                } else
                    return -1;
            }
        });
    }
}
