import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen mesafeyi giriniz (km cinsinden): ");
        int mesafe = scanner.nextInt();
        
        if (mesafe <= 0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }
        
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        if (yas <= 0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }
        
        System.out.println("Yolculuk tipini seçiniz: 1. Tek Yön 2. Gidiş-Dönüş");
        int yolculukTipi = scanner.nextInt();
        
        if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }
        
        double tutar = mesafe * 0.10;  
        
        
        if (yas < 12) {
            tutar *= 0.5;
        } else if (yas >= 12 && yas <= 24) {
            tutar *= 0.9;
        } else if (yas > 65) {
            tutar *= 0.7;
        }
        
        
        if (yolculukTipi == 2) {
            tutar *= 2;  
            tutar *= 0.8;  
        }
        
        System.out.println("Toplam Tutar: " + tutar + " TL");
    }
}
