import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Taksimetre Hesaplama Programı");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilometre Giriniz: ");
        double km = scanner.nextDouble();
        double result =km*2.2;
        if (result <20) {
            result = 20;
        }
        System.out.println("Toplam Taksimetre Tutarı: "+result + " TL");
        scanner.close();
    }
}
