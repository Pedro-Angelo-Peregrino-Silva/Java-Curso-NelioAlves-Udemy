import java.util.Scanner;

public class DiferencaProdutos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, produtoAB, produtoCD, diferencaProdutos;
		
		System.out.printf("Digite o valor de A: ");
		a = sc.nextInt();
		System.out.printf("Digite o valor de B: ");
		b = sc.nextInt();
		System.out.printf("Digite o valor de C: ");
		c = sc.nextInt();
		System.out.printf("Digite o valor de D: ");
		d = sc.nextInt();
		
		produtoAB = a * b;
		produtoCD = c * d;
		diferencaProdutos = produtoAB - produtoCD;
		
		System.out.printf("A diferença entre os produtos de: \n%d x %d e %d x %d \nÉ de %d", a, b, c, d, diferencaProdutos);
		
		sc.close();
		
	}

}
