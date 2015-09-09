import java.util.Scanner;

public class MultaVeiculo{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Tipo de veiculo (passeio ou caminhao): ");
		String tipoVeiculo = entrada.nextLine();

		System.out.print("Velocidade maxima da via: ");
		int velocidadeMaxima = entrada.nextInt();

		System.out.print("Velocidade do veiculo: ");
		int velocidadeVeiculo = entrada.nextInt();

		if (tipoVeiculo.equals("p") && velocidadeVeiculo > velocidadeMaxima * 1.1) {
			System.out.println("Veiculo multado.");						
		} else if (tipoVeiculo.equals("c") && velocidadeVeiculo > velocidadeMaxima * 1.05) {
			System.out.println("Veiculo multado.");							
		} else{
			System.out.println("Nao houve infracao.");	
		}
		System.out.println("Velocidade maxima da via: " + velocidadeMaxima);	
		System.out.println("Velocidade de veiculo: " + velocidadeVeiculo);	

	}
}