package Ex13;
import java.util.Scanner;

public class DiasRestantes {

	public DiasRestantes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Insira o número do mês para saber a quantidade de dias restantes: ");
		int mes = scanner.nextInt();
		System.out.println("A qual ano o mês escolhido pertence? ");
		int ano = scanner.nextInt();
		
		if (ano % 4 == 0 && mes == 2) {
			System.out.println("O mês escolhido possui 29 dias");
		} else {
			System.out.println("O mês escolhido possui 28 dias restantes");
		}
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("O mês escolhido possui 31 dias restantes");
		}
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("O mês escolhido possui 30 dias restantes");
		}


	}

}
