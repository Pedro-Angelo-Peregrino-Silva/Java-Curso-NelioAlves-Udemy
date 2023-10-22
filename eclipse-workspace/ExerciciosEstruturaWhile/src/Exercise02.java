import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		x = 1;
		y = 1;

		while(x != 0 && y != 0) {
			
			System.out.printf("Digite X: %n");
			x = sc.nextInt();
			System.out.printf("Digite Y: %n");
			y = sc.nextInt();

			if(x > 0 && y > 0) {
				System.out.println("Quadrante 1");
				System.out.printf("%n");
			} else if(x > 0 && y < 0) {
				System.out.println("Quadrante 4");
				System.out.printf("%n");
			} else if(x < 0 && y > 0) {
				System.out.println("Quadrante 2");
				System.out.printf("%n");
			} else if(x < 0 && y < 0) {
				System.out.println("Quadrante 3");
				System.out.printf("%n");
			}
		}
	}
}
