package tuan04.bai08;

import java.util.Scanner;

public class ListCD {
    //khai báo thuộc tính
    private CD[] cdr;   //khởi tạo mảng đối tượng cd
    private int count;  //biến dùng để đếm số lượng phần tử thực thể đang được chứa
    //tạo hàm khởi tạo
    public ListCD(int n) {
        this.cdr = new CD[n];
        this.count = 0;
    }
    //tạo hàm tăng kích thước mảng khi mảng đầy
    private void expandCapacity(){
        if (count >= cdr.length){
            CD[] tam = new CD[cdr.length * 2];
            System.arraycopy(cdr, 0, tam, 0, count);
            cdr = tam;
        }
    }
//=======thêm cd===========
    public boolean addCD(CD crom){
        //kiểm tra xem có trùng mã CD hay không
        for (int i = 0; i < count; i++) {
            if (cdr[i].getId().equalsIgnoreCase(crom.getId())){
                return false;
            }
        }
        //bảo đảm hàm còn chỗ
        expandCapacity();
        //gán vào cuối mảng
        cdr[count] = crom;
        count++;
        return true;
    }
    //============xoá cd========
    public boolean remove(String removeID){
        for (int i = 0; i < count; i++) {
            if (cdr[i].getId().equalsIgnoreCase(removeID)){
                //dồn các phần tử phía sau lên phía trước
                for (int j = i; j < count - 1; j++){
                    cdr[j] = cdr[j + 1];
                }
                cdr[count - 1] = null; //xoá tham chiếu ô mới
                count--;
                return true;
            }
        }
        return false;
    }
    //===cập nhật giá=====
    public boolean updatePrice(String id, float price) throws Exception{
        for (int i = 0; i < count; i++) {
            if (cdr[i].getId().equalsIgnoreCase(id)){
                cdr[i].setPrice(price); //phải qua setter vì giá là private
                return true;
            }
        }
        return false;
    }
    //---in danh sách---
    public void printList(){
        CD.printHeader(); //in tiêu đề bảng
        for (int i = 0; i < count; i++) {
            System.out.println(cdr[i]); //tự gọi toString
        }
    }
    //tổng thành tiền
    public float calculateTotalCost(){
        float sum = 0;
        for (int i = 0; i < count; i++) {
            sum += cdr[i].getPrice() * cdr[i].getTrackCount();
        }
        return sum;
    }
    //nhập cd từ bàn phím
    public void inputCD (Scanner sc){
        try {
            System.out.println("Enter CD ID: ");
            String id = sc.nextLine();

            System.out.println("Enter CD title: ");
            String title = sc.nextLine();

            System.out.println("Enter artist name: ");
            String artist = sc.nextLine();

            System.out.println("Enter track count: ");
            int trackCount = Integer.parseInt(sc.nextLine());

            System.out.println("Enter price: ");
            float price = Float.parseFloat(sc.nextLine());

            CD cd = new CD(id, title, artist, trackCount, price);
            if (addCD(cd)){
                System.out.println("=> CD added successfully!");
            } else {
                System.out.println("=> CD ID already exists, addition failed!");
            }
        } catch (Exception e) {
            System.out.println("=> Error" + e.getMessage());
        }
    }
//xoá cd từ bàn phím
    public void removeCD(Scanner scanner){
        try {
            System.out.println("Enter CD ID to remove: ");
            String id = scanner.nextLine();
            boolean isRemoved = remove(id);

            if (isRemoved) {
                System.out.println("=> Successfully removed CD with ID: " + id);
            } else {
                System.out.println("=> Failed to remove: CD ID not found!");
            }
        } catch (Exception e) {
            System.out.println("=> Error: " + e.getMessage());
        }
    }
//cập nhật giá từ bàn phím
    public void updatePriceCD (Scanner sc) throws Exception {
        try {
            System.out.println("Enter CD ID to update: ");
            String id = sc.nextLine();

            System.out.println("Enter new price: ");
            float newPrice = Float.parseFloat(sc.nextLine());

            boolean isUpdated = updatePrice(id, newPrice);

            if (isUpdated) {
                System.out.println("=> Successfully updated price for CD ID: " + id);
            } else {
                System.out.println("=> Failed to update: CD ID not found!");
            }
        } catch (Exception e) {
            System.out.println("=> Error: " + e.getMessage());
        }
    }
}
