import java.util.Scanner;

public class OperadorTernario{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Sua idade: ");
		int idade = entrada.nextInt();

		//               expressao booleana  (valor se true)  (valor se falso)
		String indicacao = (idade >= 18) ? "adulto" : "crianca/adolescente";

		System.out.println("Resultado: " + indicacao);

	}
}