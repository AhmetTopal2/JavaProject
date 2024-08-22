import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıralamak istediğiniz 3 sayıyı giriniz:");
        System.out.println("1. Sayı:");
        int num1 = scanner.nextInt();
        System.out.println("2. Sayı:");
        int num2 = scanner.nextInt();
        System.out.println("3. Sayı:");
        int num3 = scanner.nextInt();

        int first = 0, second = 0, third = 0;


        if(num1 >= num2 && num1 >= num3) {
            first = num1;
            if (num2 >= num3) {
                second = num2;
                third = num3;
            } else {
                second = num3;
                third = num2;
            }
        } else if(num2 >= num1 && num2 >= num3) {
            first = num2;
            if (num1 >= num3) {
                second = num1;
                third = num3;
            } else {
                second = num3;
                third = num1;
            }
        } else {
            first = num3;
            if (num1 >= num2) {
                second = num1;
                third = num2;
            } else {
                second = num2;
                third = num1;
            }
        }

        System.out.println("En Büyük Sayı: " + first);
        System.out.println("İkinci Sayı: " + second);
        System.out.println("En Küçük Sayı: " + third);
    }
}
