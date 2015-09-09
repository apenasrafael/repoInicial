public class TesteDeEquals{
	public static void main(String[] args) {
		String s1 = "Algaworks";
		String s2 = new String("Algaworks");

		System.out.println("String s1 = \"Algaworks\";");
		System.out.println("String s2 = new String(\"Algaworks\");");

		System.out.println("s1 == s2   " + (s1 == s2));
		System.out.println("s1.equals(s2)   " + s1.equals(s2));
	}
}