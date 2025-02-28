import java.util.Scanner;

public class BT08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=points[i];
        }
        double avg = sum/n;
        System.out.println("Diem trung binh = "+avg);
    }
}
