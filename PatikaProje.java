import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Basamak Sayısı : ");
		int num = input.nextInt();
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
