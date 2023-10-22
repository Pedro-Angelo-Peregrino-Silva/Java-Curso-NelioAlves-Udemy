import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = -1;
		
		while(x < 0 || x > 1000) {
			System.out.printf("Digite um número inteiro: %n");
			x = sc.nextInt();
		}
		
		System.out.printf("Os números primos de 1 até %d, são:%n", x);
		
		for(int i = 1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.printf("%d%n", i);
			}
		}
		
		sc.close();

	}

}
