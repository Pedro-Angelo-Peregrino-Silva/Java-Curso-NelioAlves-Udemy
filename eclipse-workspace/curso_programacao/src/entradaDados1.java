import java.util.Scanner;

public class entradaDados1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome, sobreNome;
		
		nome = sc.next();
		sobreNome = sc.next();
		
		System.out.printf("Olá %s. %nSoube agora que somos parentes, temos o sobrenome %s em comum.%n", nome, sobreNome);
		
		sc.close();
	}

}
