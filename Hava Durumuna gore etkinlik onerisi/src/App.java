
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık Degeri Giriniz: ");
        int sicaklik = scanner.nextInt();
        String etkinlik = (sicaklik < 5) ? "Kayak yapmayı öner."
                : (sicaklik < 15) ? "Sinema etkinliğini öner."
                        : (sicaklik < 25) ? "Piknik etkinliğini öner."
                                : "Yüzme etkinliğini öner.";

        System.out.println(etkinlik);
    }
}
