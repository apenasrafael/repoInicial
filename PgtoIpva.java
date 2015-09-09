import java.util.Scanner;

public class PgtoIpva{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o final da placa: ");
		int finalPlaca = entrada.nextInt();

		switch (finalPlaca){
			default:
				System.out.println("Vencimento sem data, desculpe");
				break;
			case 1:
				System.out.println("Vencimento dia 11 de Janeiro");
				break;
			case 2:
				System.out.println("Vencimento dia 12 de Janeiro");
				break;
			
		}
	}
}