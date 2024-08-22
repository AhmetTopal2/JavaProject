
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hosgeldiniz Giris yapmak icin 1'e, kayit yapmak icin 2'e basiniz.");
        int secim = scanner.nextInt();
        String testName = "testname";
        String testPassword = "testpassword";
        if (secim == 1) {
            System.out.println("Kullanici adinizi giriniz:");
            String name = scanner.next();
            System.out.println("Sifrenizi giriniz:");
            String password = scanner.next();

            if (name.equals(testName) && password.equals(testPassword)) {
                System.out.println("Hosgeldiniz " + name);
            } else {
                System.out.println("Kullanici adiniz veya sifreniz hatali");
                System.out.println("Sıfrenızı degıstirmek ister misiniz? (E/H)");
                char answer = scanner.next().charAt(0);
                if (answer == 'E') {
                    System.out.println("Yeni sifrenizi giriniz:");
                    String newPassword  = scanner.next();
                    if (newPassword.equals(testPassword)) {
                        System.out.println("Sifreniz eski sifreniz ile aynı olamaz");
                        
                    }else{
                        System.out.println("Sifreniz degistirildi");
                    }

                }else{
                    System.out.println("Sifreniz degistirilmedi");
                    System.out.println("Uygulamadan cikiliyor");
                }
            }
        } else {
            System.out.println("Kullanici adinizi giriniz:");
            testName = scanner.next();
            System.out.println(testName);
            System.out.println("Sifrenizi giriniz:");
            testPassword = scanner.next();
            System.out.println(testPassword);
            System.out.println("Kayit isleminiz gerceklesti. Lutfen giris yapin.");
        }
        scanner.close();
    }
}
