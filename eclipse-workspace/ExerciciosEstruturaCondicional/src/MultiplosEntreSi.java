import java.util.Scanner;
public class MultiplosEntreSi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		 
		if (a % b == 0 || b % a == 0) {
			System.out.println("Os números são múltiplos entre si.");
		} else {
			System.out.println("Os números NÃO são múltiplos entre si.");
		}

		sc.close();
		
	}

}
