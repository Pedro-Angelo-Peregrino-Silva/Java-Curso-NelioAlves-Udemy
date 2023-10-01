import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("O numero digitado é POSITIVO!");
		} else {
			System.out.println("O número digitado é NEGATIVO!");
		}
		
		sc.close();		

	}

}
