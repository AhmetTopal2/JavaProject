import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uygulamaya hosgeldiniz!");
        Scanner scanner = new Scanner(System.in);
        boolean controller = true;
        
        do {
            System.out.println("Matematik notunuzu giriniz: ");
            double mat = scanner.nextDouble();
            if (mat < 0 || mat > 100) {
                System.out.println("Matematik notunuz 0 ile 100 arasinda olmalidir!");
                break;
            }
            System.out.println("Fizik notunuzu giriniz: ");
            double fiz = scanner.nextDouble();
            if (fiz < 0 || fiz > 100) {
                System.out.println("Fizik notunuz 0 ile 100 arasinda olmalidir!");
                break;
            }
            System.out.println("Kimya notunuzu giriniz: ");
            double kim = scanner.nextDouble();
            if (kim < 0 || kim > 100) {
                System.out.println("Kimya notunuz 0 ile 100 arasinda olmalidir!");
                break;
            }
            System.out.println("Türkçe notunuzu giriniz: ");
            double tur = scanner.nextDouble();
            if (tur < 0 || tur > 100) {
                System.out.println("Türkçe notunuz 0 ile 100 arasinda olmalidir!");
                break;
            }
            System.out.println("Tarih notunuzu giriniz: ");
            double tar = scanner.nextDouble();
            if (tar < 0 || tar > 100) {
                System.out.println("Tarih notunuz 0 ile 100 arasinda olmalidir!");
                break;
            }
            System.out.println("Müzik notunuzu giriniz: ");
            double muz = scanner.nextDouble();
            if (muz < 0 || muz > 100) {
                System.out.println("Müzik notunuz 0 ile 100 arasinda olmalidir!");
                break;
            }
            double ort = (mat + fiz + kim + tur + tar + muz) / 6;
            System.out.println("Ortalamanız: " + ort);
            String result = ort >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
            System.out.println(result);
            System.out.println("Programdan çıkmak için 'q' ya basınız, Tekrar denemek için herhangi bir tuşa basınız.");
            String control = scanner.next();
            if (control.equals("q")) {
                System.out.println("Programdan cıkılıyor...");
                controller = false;
            }
        } while (controller);
        
        
        scanner.close();

    }
}
