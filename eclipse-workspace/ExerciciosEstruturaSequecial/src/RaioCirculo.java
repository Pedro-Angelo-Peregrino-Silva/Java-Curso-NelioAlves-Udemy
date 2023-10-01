import java.util.Scanner;

public class RaioCirculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, areaCirculo;
		
		System.out.printf("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		areaCirculo = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("O valor da área do circulo com raio igual a %.2f é de %.4f.", raio, areaCirculo);
		
		sc.close();

	}

}
