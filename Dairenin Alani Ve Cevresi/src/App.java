import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dairenin Yaricapini Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double pi = Math.PI;
        System.out.println("Alan: " + pi * r * r);
        System.out.println("Cevre: " + 2 * pi * r);
        System.out.println("Merkez acisini giriniz: ");
        double a = scanner.nextDouble();
        System.out.println("Daire Diliminin Alanı: " + pi * r * r * a / 360);
        scanner.close();
    }
}
