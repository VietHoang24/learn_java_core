package Chuong3.bai35;

public class RightTriangle extends Shape {
    private int chieuCao;

    public RightTriangle() {
    }

    public RightTriangle(int chieuCao) {
        if(0<chieuCao || chieuCao<21){
            this.chieuCao = chieuCao;
        } else {
            this.chieuCao = 0;
        }
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        if(0<chieuCao || chieuCao<21){
            this.chieuCao = chieuCao;
        } else {
            this.chieuCao = 0;
        }
    }

    @Override
    public void draw() {
        super.draw();
        System.err.println("RightTriangle");
        for(int i=0; i<chieuCao; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
