
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hesap Makinasi Giris");
        boolean controller = true;
        Scanner scanner = new Scanner(System.in);
        while (controller) {
            System.out.println("Yapmak istediginiz islemi seciniz");
            System.out.println("1. Toplama\n2. Cikarma\n3. Bolme \n4. Carpma \n5. Cikis");
            int select = scanner.nextInt();
            if (select == 5) {
                break;
            }
            System.out.println("1. Sayiyi Giriniz");
            double a = scanner.nextDouble();
            System.out.println("2. Sayiyi Giriniz");
            double b = scanner.nextDouble();
            System.out.println("-------------------");

            switch (select) {
                case 1:
                    System.out.println("Sonuc :" + a + b);
                    break;
                case 2:
                    System.out.println("Sonuc :" + (a - b));
                    break;
                case 3:
                    System.out.println("Sonuc :" + a / b);
                    break;
                case 4:
                    System.out.println("Sonuc :" + a * b);
                    break;
                case 5:
                    controller = false;
                    break;
                default:
                    System.out.println("Hatali Giris");
                    break;
            }

        }
        scanner.close();
    }
}
