import java.util.Scanner;

public class FuncionarioSalario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		//Entrada de dados Funcionário
		System.out.printf("Digite o ID do funcionário: ");
		numeroFuncionario = sc.nextInt();
		System.out.printf("Forneça o número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.printf("Forneça o valor da hora: $");
		valorHora = sc.nextDouble();
		
		//Calculos
		salario = horasTrabalhadas * valorHora;
		
		//Saida de dados
		System.out.printf("ID = %d \nSALARY = $ %.2f", numeroFuncionario, salario);
		
		sc.close();

	}

}
