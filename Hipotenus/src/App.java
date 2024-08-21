import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dik ucgenin hipotenus uzunlugunu bulan programa hosgeldiniz.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin 1.kenar uzunlugunu giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Ucgenin 2.kenar uzunlugunu giriniz: ");
        int b = scanner.nextInt();
        
        double c =Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) ;
        System.out.println("Hipotenus uzunlugu :  " +  c);
        System.out.println("Ucgenin cevresi : " + (a+b+c));
        double u=(a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin alani : " +  alan);
        scanner.close();

    }
}
