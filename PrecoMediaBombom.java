public class PrecoMediaBombom{
	public static void main(String[] args){
		//preco das três últimas vendas realizadas
		int preco1 = 5, preco2 = 8, preco3 = 12;
		int media = (preco1 + preco2 + preco3) / 3;

		System.out.println("\"Sistema de Calculo de Media\"");
		System.out.println("Preco 1: " + preco1);
		System.out.println("Preco 2: " + preco2);
		System.out.println("Preco 3: " + preco3);
		System.out.println("Media: " + media);
	}
}