package VuVanHung_Day4.ArrayString.Process;

public class TienDien {
    public static long tienDien(int soKwh){
        long t = 0;
        if(soKwh<=50)
            t = soKwh*1678;
        else if(50<soKwh && soKwh<=100)
            t = 50*1678l + (soKwh-50)*1734l;
        else if(100<soKwh && soKwh<=200)
            t = 50*1678l + 50*1734l + (soKwh-100)*2014l;
        else if(200<soKwh && soKwh<=300)
            t = 50*1678l + 50*1734l + 100*2014l + (soKwh-200)*2536l;
        else if(300<soKwh && soKwh<=400)
            t = 50*1678l + 50*1734l + 100*2014l + 100*2536l + (soKwh-300)*2834l;
        else
            t = 50*1678l + 50*1734l + 100*2014l + 100*2536l + 100*2834l + (soKwh-400)*2927l;
        return t;
    }
}
