public class BT03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        boolean bangNhau = (x == y);
        boolean khacNhau = (x != y);
        boolean lonHon = (x > y);
        boolean nhoHon = (x < y);
        boolean lonHonHoacBang = (x >= y);
        boolean nhoHonHoacBang = (x <= y);
        System.out.println("x == y: " + bangNhau);
        System.out.println("x != y: " + khacNhau);
        System.out.println("x > y: " + lonHon);
        System.out.println("x < y: " + nhoHon);
        System.out.println("x >= y: " + lonHonHoacBang);
        System.out.println("x <= y: " + nhoHonHoacBang);
        if (lonHon) {
            System.out.println("x lớn hơn y");
        } else if (nhoHon) {
            System.out.println("x nhỏ hơn y");
        } else {
            System.out.println("x bằng y");
        }
        double n = 9.99;
        String s = "hello";
    }
}
