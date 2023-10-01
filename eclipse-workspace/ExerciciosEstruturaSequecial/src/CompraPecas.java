import java.util.Scanner;

public class CompraPecas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idPeca1, idPeca2, numeroPeca1, numeroPeca2;
		double valorUnitPeca1, valorUnitPeca2, valorPagar;
		
		//Entrada de dados Peça 01
		System.out.println("ID peça 01 = ");
		idPeca1 = sc.nextInt();
		
		System.out.println("Quantas peças foram compradas? ");
		numeroPeca1 = sc.nextInt();
				
		System.out.println("Valor unitário da Peça: R$ ");
		valorUnitPeca1 = sc.nextDouble();
		
		//Entrada de dados peca 02
		System.out.println("ID peça 02 = ");
		idPeca2 = sc.nextInt();
		
		System.out.println("Quantas peças foram compradas? ");
		numeroPeca2 = sc.nextInt();
		
		System.out.println("Valor unitário da Peça: R$ ");
		valorUnitPeca2 = sc.nextDouble();
		
		//Calculos
		valorPagar = (numeroPeca1 * valorUnitPeca1) + (numeroPeca2 * valorUnitPeca2);
		
		//Saida de dados
		System.out.printf("Valor Total a Pagar: R$ %.2f", valorPagar);
		
		sc.close();

	}

}
