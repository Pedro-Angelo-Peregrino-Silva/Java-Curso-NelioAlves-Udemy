import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String nome = "Arthur de Andrade";
		int idade = 11;
		double media = 9.898546;
		
		System.out.printf("O aluno %s que tem idade de %d anos tirou média de %.2f nas notas.%n ", nome, idade, media);

	}

}
