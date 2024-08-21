import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bu Uygulama Girdiğiniz Para Miktarına Göre KDV Hesaplamaktadır.");
        boolean controller = true;
        Scanner scanner = new Scanner(System.in);

        while (controller) {
            System.out.println("Para Miktarını Giriniz: ");
            double price = scanner.nextDouble();
            double result = price > 1000 ? price * 0.08 : price * 0.18;
            System.out.println("KDV Oranı: % " + (price > 1000 ? 8 : 18));
            System.out.println("KDV Tutarı: " + result + "\nKDV'li Toplam Tutar: " + (price + result));
            System.out.println("Devam Etmek İçin 1, Çıkmak İçin 0 Tuşlayınız: ");
            int control = scanner.nextInt();
            if (control == 0) {
                System.out.println("Cikis Yapiliyor...");
                controller = false;
            }
        }
        
        scanner.close();
    }
}
