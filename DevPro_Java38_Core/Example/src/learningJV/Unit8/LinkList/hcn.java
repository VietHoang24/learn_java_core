package learningJV.Unit8.LinkList;

public class hcn {
    private double cd, cr;

    public hcn() {
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public double getChuVi(){
        return getCd()+getCr();
    }

    public double getDienTich(){
        return getCd()*getCr();
    }
}
