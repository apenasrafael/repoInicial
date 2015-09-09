import java.util.Scanner;

public class ClassificaProduto{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int codProduto = 0;

		do {
			System.out.print("cod do produto: ");
			codProduto = entrada.nextInt();
		} while (codProduto == 0);
		
		String corredor = (codProduto % 2 == 0) ? "direita" : "esquerda";

		System.out.println("COD: " + codProduto);
		System.out.println("Corredor: " + corredor);
		for (int i = 8; i >= 1; i--) {
			if (codProduto % i == 0) {
				System.out.println("Gaveta: " + i);
				break;
			}
		}
	}
}