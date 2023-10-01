import java.util.Scanner;

public class IRPFLisarb {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//entrada de dados
		
		double salario, valorPagar;
		
		System.out.println("Digite o seu salário:");
		salario = sc.nextDouble();
		
		if ( salario > 0 && salario <= 2000.00) {
			System.out.println("Isento de Imposto de renda.");
		} else if (salario > 2000.00 && salario <= 3000.00) {
			valorPagar = salario * 0.08;
			System.out.printf("O valor á pagar será de %.2f, considerando 8%% do valor de salário.", valorPagar);
		} else if (salario > 3000.00 && salario <= 4500.00) {
			valorPagar = (salario + 18) / 100;
			System.out.printf("O valor á pagar será de %.2f, considerando 18%% do valor de salário.", valorPagar);
		} else {
			valorPagar = (salario + 28) / 100;
			System.out.printf("O valor á pagar será de %.2f, considerando 28%% do valor de salário.", valorPagar);
		}
		
		sc.close();
		

	}

}
