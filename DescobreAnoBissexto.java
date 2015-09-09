import java.util.Scanner;
public class DescobreAnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ano: ");
		int ano = entrada.nextInt();

		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Ano bissexto.");
		} else {
			System.out.println("Ano nao bissexto.");
		}
	}
}