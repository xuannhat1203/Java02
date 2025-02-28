import java.util.Scanner;

public class BT05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieudai = sc.nextInt();
        int chieurong = sc.nextInt();
        System.out.println("Chu vi hinh chu nhat la: "+(chieudai+chieurong)*2);
        System.out.println("Dien tich hinh chu nhat la: "+(chieudai*chieurong));
    }
}
