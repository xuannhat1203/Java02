import java.util.Scanner;

public class BT07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giờ, phút, giây ban đầu: ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        if (hour < 0 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            System.out.println("Lỗi: Thời gian nhập vào không hợp lệ!");
            return;
        }

        System.out.print("Nhập số giờ, phút, giây cần cộng thêm: ");
        int addHour = sc.nextInt();
        int addMinute = sc.nextInt();
        int addSecond = sc.nextInt();

        int newSecond = second + addSecond;
        int newMinute = minute + addMinute;
        int newHour = hour + addHour;
        if (newSecond >= 60) {
            newMinute += newSecond / 60;
            newSecond %= 60;
        }
        if (newMinute >= 60) {
            newHour += newMinute / 60;
            newMinute %= 60;
        }
        System.out.printf("Thời gian sau khi cộng: %02d:%02d:%02d\n", newHour, newMinute, newSecond);
    }
}
