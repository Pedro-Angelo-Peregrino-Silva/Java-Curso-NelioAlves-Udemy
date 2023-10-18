import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int password;
		
		System.out.println("Password: ");
		password = sc.nextInt();
		
		while (password != 2002) {
			System.out.println("Senha inválida, digite a senha novamente.");
			password = sc.nextInt();
		}
		
		System.out.println("Senha correta");
		
		sc.close();
	}

}
