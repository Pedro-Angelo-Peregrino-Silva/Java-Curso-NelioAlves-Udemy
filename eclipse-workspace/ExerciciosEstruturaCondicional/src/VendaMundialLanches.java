import java.util.Scanner;

public class VendaMundialLanches {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//Tabela de Mercadorias
		System.out.println("1 - Cachorro Quente  R$ 4,00");
		System.out.println("2 - X-Salada         R$ 4,50");
		System.out.println("3 - X-Bacon          R$ 5,00");
		System.out.println("4 - Torrada simples  R$ 2,00");
		System.out.println("5 - Refrigerante     R$ 1,50");
		
		int respostaProduto, quantidade;
		double valorPagar;
		
		System.out.println();
		System.out.println("Qual o produto que você irá querer?");
		respostaProduto = sc.nextInt();
		System.out.println("Qual a quantidade desse Produto?");
		quantidade = sc.nextInt();
		
		//condição e calculos
		if (respostaProduto == 1) {
			valorPagar = 4.00 * quantidade;
		} else if (respostaProduto == 2) {
			valorPagar = 4.50 * quantidade;
		} else if (respostaProduto == 3) {
			valorPagar = 5.00 * quantidade;
		} else if (respostaProduto == 4) {
			valorPagar = 2.00 * quantidade;
		} else {
			valorPagar = 1.50 * quantidade;
		}
		
		System.out.printf("O valor total á pagar será de R$ %.2f", valorPagar);
		
		sc.close();
		
	}

}
