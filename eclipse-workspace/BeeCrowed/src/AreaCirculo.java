import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		double raio, area;
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A área de um triângulo com raio de %.2f é igual a %.4f.", raio, area);
				
		sc.close();
	}

}
