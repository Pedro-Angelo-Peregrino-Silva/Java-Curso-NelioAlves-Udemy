import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O número %d é PAR.", numero);
		} else {
			System.out.printf("O número %d é IMPAR.", numero);
		}

		sc.close();
		
	}

}
