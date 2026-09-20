package tuan04.bai08;

public class CD {
    //attribute
    private String id;  //mã cd duy nhất
    private String title; //tựa đề cd
    private String artist;  //ca sĩ
    private int trackCount; //số bài hát
    private float price;    //giá thành

    //getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) throws Exception {
        if (trackCount > 0) {
            this.trackCount = trackCount;
        } else {
            throw new Exception("Error: Track count must be greater than 0!");
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws Exception {
        if (price > 0) {
            this.price = price;
        } else {
            throw new Exception("Error: Price must be greater than 0!");
        }
    }

    //constructor đầy đủ
    public CD(String id, String title, String artist, int trackCount, float price) throws Exception {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.setTrackCount(trackCount);
        this.setPrice(price);
    }
    //IN TIÊU ĐỀ BẢNG
    public static void printHeader(){
        //in ra đường kẻ ngang
        for (int i = 0; i < 92; i++) {
            System.out.print("=");
        }
        System.out.println();
        //in tiêu đề
        String s = String.format(
                "|%-10s|%-10s|%-25s|%10s|%15s|%15s|%n",
                "ID", "Title", "Artist", "Track", "Price", "Total"
        );
        System.out.print(s);
        //in ra đường kẻ ngang
        System.out.println();
        for (int i = 0; i < 92; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    //ghi đè phương thức toString
    @Override
    public String toString() {
        return String.format("|%-10s|%-10s|%-25s|%10d|%15.2f|%15.2f|",
                id,
                title,
                artist,
                trackCount,
                price,
                price * trackCount);
    }
}
