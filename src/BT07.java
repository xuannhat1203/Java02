import java.util.Scanner;

public class BT07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gio = sc.nextInt();
        int phut = sc.nextInt();
        int giay = sc.nextInt();
        if (gio < 0 || phut < 0 || phut >= 60 || giay < 0 || giay >= 60) {
            System.out.println("Lỗi: Thời gian nhập vào không hợp lệ!");
            return;
        }
        int themgio = sc.nextInt();
        int themphut = sc.nextInt();
        int themgiay = sc.nextInt();
        int tongsogiay = gio*3600 + phut*60 + giay;
        int tongsogiaythem = themgio*3600 + themphut*60 + themgiay;
        int tongthoigian = tongsogiay + tongsogiaythem;
        int gio2 = tongthoigian / 3600;
        int phut2 = (tongthoigian % 3600) / 60;
        int giay2 = tongthoigian % 60;
        System.out.println("thoi gian sau khi cong them la: "+gio2+" : "+phut2+" : "+giay2);
    }
}
