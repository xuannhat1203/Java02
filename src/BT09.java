import java.util.Scanner;

public class BT09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày, tháng, năm: ");
        int ngay = sc.nextInt();
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        sc.close();
        boolean namNhuan = (nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0);
        int ngayTrongThang;
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            ngayTrongThang = 31;
        } else if (thang == 2) {
            ngayTrongThang = namNhuan ? 29 : 28;
        } else {
            ngayTrongThang = 30;
        }
        if (ngay == ngayTrongThang) {
            ngay = 1;
            thang++;
        } else {
            ngay++;
        }
        if (thang > 12) {
            thang = 1;
            nam++;
        }
        System.out.println("Ngày tiếp theo là: " + ngay + " - " + thang + " - " + nam);
    }
}
