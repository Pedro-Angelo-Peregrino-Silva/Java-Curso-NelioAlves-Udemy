import java.util.Scanner;

public class DentroDosIntervalos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número qualquer:");
		numero = sc.nextDouble();
		
		if (numero <= 25 && numero >= 0) {
			System.out.println("O número se encontra dentro do intervalo de 0 - 25");
		} else if (numero > 25 && numero <= 50) {
			System.out.println("O número se encontra dentro do intervalo de 25,01 - 50");
		} else if (numero > 50 && numero <= 75) {
			System.out.println("O número se encontra dentro do intervalo de 50,01 - 75");
		}  else if (numero > 75 && numero <= 100) {
			System.out.println("O número se encontra dentro do intervalo de 75,01 - 100");
		} else {
			System.out.println("O número se encontra FORA DE INTERVALO.");
		}
		
		sc.close();

	}

}
