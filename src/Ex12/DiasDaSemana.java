package Ex12;
import java.util.Scanner;


public class DiasDaSemana {

	public DiasDaSemana() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe um n�mero inteiro entre 1 e 7: ");
		int num = in.nextInt();
		
		if (num == 1) {
			String diaDaSemana = "Domingo";
			System.out.println("O dia da semana escolhido foi: " + diaDaSemana);
		}
		
		if (num == 2) {
			String diaDaSemana = "Segunda";
			System.out.println("O dia da semana escolhido foi: " + diaDaSemana);
		}
		if (num == 3) {
			String	diaDaSemana = "Ter�a";
			System.out.println("O dia da semana escolhido foi: " + diaDaSemana);
		}
		if (num == 4) {
			String	diaDaSemana = "Quarta";
			System.out.println("O dia da semana escolhido foi: " + diaDaSemana);
		}
		if (num == 5) {
			String	diaDaSemana = "Quinta";
			System.out.println("O dia da semana escolhido foi: " + diaDaSemana);
		}
		if (num == 6) {
			String diaDaSemana = "Sexta";
			System.out.println("O dia da semana escolhido foi: " + diaDaSemana);
		}
		if (num == 7) {
			String	diaDaSemana = "S�bado";
			System.out.println("O dia da semana escolhido foi: " + diaDaSemana);
		}
		
		if (num > 7) {
			System.out.println("Valor incorreto. Digite um n�mero de 1 a 7!");
		}
		if (num < 1) {
			System.out.println("Valor incorreto. Digite um n�mero entre 1 e 7!");
		}

	}

}
