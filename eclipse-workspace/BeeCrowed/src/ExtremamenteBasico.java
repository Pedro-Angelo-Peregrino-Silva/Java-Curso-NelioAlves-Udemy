import java.util.Scanner;

public class ExtremamenteBasico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,x;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		x = a + b;
		
		System.out.printf("A soma de %d + %d = %d", a, b, x);
		
		sc.close();
		
	}

}
