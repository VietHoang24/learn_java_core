package Chuong3.bai35;

public class Rectangle extends Shape {
    private int chieuDai, chieuRong;

    public Rectangle() {
    }

    public Rectangle(int chieuDai, int chieuRong) {
        if((0<chieuDai && chieuDai<16) && (0<chieuRong && chieuRong<16)){
            if(chieuRong > chieuDai){
                this.chieuRong = chieuDai;
                this.chieuDai = chieuRong;
            } else {
                this.chieuDai = chieuDai;
                this.chieuRong = chieuRong;
            }
        } else {
            this.chieuDai = 0;
            this.chieuRong = 0;
        }
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        if(0<chieuDai && chieuDai<16){
            this.chieuDai = chieuDai;
        } else {
            this.chieuDai = 0;
        }
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        if(0<chieuRong && chieuRong<16){
            this.chieuRong = chieuRong;
        } else {
            this.chieuRong = 0;
        }
    }

    @Override
    public void draw() {
        super.draw();
        System.err.println("Rectangle");
        for(int i=0; i<chieuRong; i++){
            for(int j=0; j<chieuDai; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

//        //HCN rong
//        for(int i=0; i<chieuDai; i++){
//            if(i==chieuDai-1 || i==0){
//                for(int j=0; j<chieuRong; j++){
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            } else {
//                for(int k=0; k<chieuRong; k++){
//                    if(k==0 || k==chieuRong-1){
//                        System.out.print(" * ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        }
    }
}
