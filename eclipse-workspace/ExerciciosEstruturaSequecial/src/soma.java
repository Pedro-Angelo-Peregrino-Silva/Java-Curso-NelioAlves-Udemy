import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.printf("Digite um número:\n");
		num1 = sc.nextInt();
		System.out.printf("Digite outro número:\n");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("A soma dos números %d e %d é igual a %d.", num1, num2, soma);
		
		sc.close();

	}

}
