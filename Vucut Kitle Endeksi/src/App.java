import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz");
		double height = scanner.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz");
		double weight = scanner.nextDouble();
		double result = weight / (Math.pow(height, 2));
		System.out.println("Vücut Kitle İndeksiniz : " + result);
		
		if (result<18.5) {
			System.out.println("Zayıf");
		}else if(result<24.9){
			System.out.println("Ideal");
		}else if (result< 29.9) {
			System.out.println("Sisman");
		}else if(result<34.9) {
			System.out.println("Obez");
		}else {
			System.out.println("Asiri Obez");
		}
		scanner.close();
    }
}
