package vn.edu.javaoop.tuan01.bai01;

public class HinhTronDemo {
    public static void main(String[] args) {
        HinhTron h1 = new HinhTron(new ToaDo("O", 4, 10), 7);
        System.out.println("Thong tin hinh tron:");
        System.out.println("Hinh tron: " + h1.getTam().getTen());
        System.out.println("Hinh tron co ban kinh: " + h1.getBanKinh());
    }
}
