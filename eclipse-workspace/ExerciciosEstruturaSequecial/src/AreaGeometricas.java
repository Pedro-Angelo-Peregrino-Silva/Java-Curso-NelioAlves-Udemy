import java.util.Scanner;

public class AreaGeometricas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		//Entrada de dados
		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		
		//Area triangulo Retangulo
		areaTrianguloRetangulo = (a * c)/2;
		
		//Area do circulo
		areaCirculo = 3.14159 * Math.pow(c, 2);
		
		//Area do trapézio
		areaTrapezio = (a + b) * c /2;
		
		//Area quadrado
		areaQuadrado = b * b;
		
		//Area do Retangulo
		areaRetangulo = a * b;
		
		//Saida de dados
		System.out.printf("TRIÂNGULO: %.3f\n", areaTrianguloRetangulo);
		System.out.printf("CÍRCULO: %.3f\n", areaCirculo);
		System.out.printf("TRAPÉZIO: %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		System.out.printf("RETÂNGULO: %.3f\n", areaRetangulo);
		
		sc.close();

	}

}
