
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ARMUT_FIYAT = 2.14;
        double ELMA_FIYAT = 3.67;
        double DOMATES_FIYAT = 1.11;
        double MUZ_FIYAT = 0.95;
        double PATLICAN_FIYAT = 5.00;

        System.out.print("Armut (kg): ");
        double armutKg = scanner.nextDouble();

        System.out.print("Elma (kg): ");
        double elmaKg = scanner.nextDouble();

        System.out.print("Domates (kg): ");
        double domatesKg = scanner.nextDouble();

        System.out.print("Muz (kg): ");
        double muzKg = scanner.nextDouble();

        System.out.print("Patlıcan (kg): ");
        double patlicanKg = scanner.nextDouble();

        double toplamTutar = (armutKg * ARMUT_FIYAT)
                + (elmaKg * ELMA_FIYAT)
                + (domatesKg * DOMATES_FIYAT)
                + (muzKg * MUZ_FIYAT)
                + (patlicanKg * PATLICAN_FIYAT);

        System.out.printf("Toplam Tutar: %.2f TL\n", toplamTutar);

        scanner.close();
    }
}
