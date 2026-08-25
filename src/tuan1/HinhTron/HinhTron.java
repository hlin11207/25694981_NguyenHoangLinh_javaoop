package tuan1.HinhTron;

public class HinhTron {
    private double banKinh;
    private ToaDo tam;
    private final double PI=3.1416;
    //dong goi
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }
    //ham tao
    public HinhTron(ToaDo tam, double banKinh) {
        this.banKinh = banKinh;
        this.tam = tam;
    }

    public static void main(String[] args) {
        HinhTron h1 = new HinhTron(new ToaDo("O", 4, 10), 7);
        System.out.println("Thong tin hinh tron:");
        System.out.println("Hinh tron: "+h1.getTam().getTen());
        System.out.println("Hinh tron co ban kinh: "+h1.banKinh);
    }
}
