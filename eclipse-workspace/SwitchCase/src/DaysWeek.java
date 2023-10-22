import java.util.Locale;
import java.util.Scanner;

public class DaysWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int resposta;
		String dia;

		System.out.printf(
				"Escolha o dia da semana:%n1 - Domingo%n2 - Segunda%n3 - Terça%n4 - Quarta%n5 - Quinta%n6 - Sexta%n7 - Sábado%nQual a sua Escolha?[1-7]%n");
		resposta = sc.nextInt();

		switch (resposta) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Opção inválida";

		}
		
		System.out.println("O dia da semana:" + dia);

		sc.close();
	}

}
