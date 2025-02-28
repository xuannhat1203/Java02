import java.util.Scanner;

public class BT06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String name = sc.nextLine();
        System.out.println("Nhap so mon hoc: ");
        int n = sc.nextInt();
        int[] points = new int[n];
        for (int i=0;i<n;i++){
            points[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += points[i];
        }
        double avg = sum/n;
        if (avg<5){
            System.out.println(name + avg +"Yeu");
        }else if (avg >= 5 && avg < 6.5){
            System.out.println(name + avg + "Trung binh");
        }else if (avg >= 6.5 && avg < 8){
            System.out.println(name + avg + "Kha");
        }else if (avg >= 8 && avg <=10) {
            System.out.printf(name + avg + "Gioi");
        }
    }
}
