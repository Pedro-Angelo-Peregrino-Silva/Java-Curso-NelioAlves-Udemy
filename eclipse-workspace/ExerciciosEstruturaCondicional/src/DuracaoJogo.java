import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Variáves
		int horaInicio, horaFim, tempoDeJogo;
		
		//Entrada das  horas
		System.out.println("Digite a hora de início da partida:");
		horaInicio = sc.nextInt();
		System.out.println("Digite a hora de término da partida");
		horaFim = sc.nextInt();
		
		//Calculos e condicoes
				
		if (horaInicio > horaFim) {
			tempoDeJogo = (24 - horaInicio) + horaFim;
			System.out.printf("O jogo teve duração de %d horas.", tempoDeJogo);
		} else if (horaFim > horaInicio) {
			tempoDeJogo = horaFim - horaInicio;
			System.out.printf("O jogo teve duração de %d horas.", tempoDeJogo);
		} else {
			System.out.println("O jogo teve duração de 24 horas.");
		}
		
		sc.close();
		
	}

}
