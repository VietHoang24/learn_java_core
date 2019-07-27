package VuVanHung_Day7.Module;

public class outputList extends inputList {
    public static void tieuDeCB(){
        NhanSu.tieuDe();
        CanBo.tieuDe();
    }

    public static void tieuDeCN(){
        NhanSu.tieuDe();
        CongNhan.tieuDe();
    }

    public static void outputNhanSu(){
        tieuDeCB();
        for (int i=0; i<listCB.length; i++){
            listCB[i].outputCB();
        }
        tieuDeCN();
        for (int i=0; i<listCN.length; i++){
            listCN[i].outputCN();
        }
    }

    public static void outputCongNhanNam(){
        tieuDeCN();
        for (int i=0; i<listCN.length; i++){
            if (listCN[i].getGioiTinh().compareTo("Nam")==0){
                listCN[i].outputCN();
            }
        }
    }

    public static void outputCanBoNu(){
        tieuDeCB();
        for (int i=0; i<listCB.length; i++){
            if (listCB[i].getGioiTinh().compareTo("Nu")==0){
                listCB[i].outputCB();
            }
        }
    }

    public static void ouputCanBoLuongMax(){
        double max = listCB[0].getLuong();
        for (int i=0; i<listCB.length; i++){
            if (listCB[i].getLuong()>max){
                max = listCB[i].getLuong();
            }
        }
        tieuDeCB();
        for (int i=0; i<listCB.length; i++){
            if (listCB[i].getLuong()==max){
                listCB[i].outputCB();
            }
        }
    }

    public static void ouputCongNhanLuongMin(){
        double min = listCN[0].getLuong();
        for (int i=0; i<listCN.length; i++){
            if (listCN[i].getLuong()<min){
                min = listCN[i].getLuong();
            }
        }
        tieuDeCN();
        for (int i=0; i<listCN.length; i++){
            if (listCN[i].getLuong()==min){
                listCN[i].outputCN();
            }
        }
    }

    public static void tongLuongCanBo(){
        double tong = 0;
        for (int i=0; i<listCB.length; i++){
            tong+=listCB[i].getLuong();
        }
        System.out.println("=> Tong luong tat ca can bo: " + tong);
    }

    public static void tongLuongCongNhan(){
        double tong = 0;
        for (int i=0; i<listCN.length; i++){
            tong+=listCN[i].getLuong();
        }
        System.out.println("=> Tong luong tat ca cong nhan: " + tong);
    }

    public static void sapXepTen(){
        for (int i=0; i<listCB.length; i++){
            for (int j=i+1; j<listCB.length; j++){
                if (listCB[i].getTen().compareTo(listCB[j].getTen())>0){
                    CanBo tg = listCB[i];
                    listCB[i] = listCB[j];
                    listCB[j] = tg;
                }
            }
        }

        for (int i=0; i<listCN.length; i++){
            for (int j=i+1; j<listCN.length; j++){
                if (listCN[i].getTen().compareTo(listCN[j].getTen())>0){
                    CongNhan tg = listCN[i];
                    listCN[i] = listCN[j];
                    listCN[j] = tg;
                }
            }
        }
    }
}
