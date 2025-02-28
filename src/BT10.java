import java.math.BigInteger;
import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        System.out.println("Tong cua a + b = " + a.add(b));
        System.out.println("Hieu cua a - b = " + a.subtract(b));
        System.out.println("Tich cua a x b = " + a.multiply(b));
        System.out.println("Thuong cua a : b = " + a.divide(b));
        System.out.println("Luy thua cua a va b = " + a.mod(b));
        System.out.println("Modulo cua a va b = " + a.mod(b));
    }
}
