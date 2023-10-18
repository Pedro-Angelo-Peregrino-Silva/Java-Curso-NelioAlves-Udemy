import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int in, out, x;
		in = 0;
		out = 0;
		int N = sc.nextInt();
		
		System.out.printf("Digite a quantidade de valores inteiros: %n");
		System.out.printf("Em seguida digite os valores:%n");
		
		for(int i = 0; i < N; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in += 1;
				
			} else {
				out += 1;
			}
				
		}
		
		System.out.printf("%d IN%n", in);
		System.out.printf("%d OUT%n", out);
		
		sc.close();
		
	}

}
