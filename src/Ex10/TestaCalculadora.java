package Ex10;
import java.util.Scanner;

public class TestaCalculadora {

	public TestaCalculadora() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Oi! Sou uma calculadora que faz opera��o apenas entre dois valores. :)");
		System.out.println("");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o primeiro valor: ");
		double a = entrada.nextInt();
		System.out.println("Insira o segundo valor: ");
		double b = entrada.nextInt();
		Calculadora calc = new Calculadora(a, b);
		
		calc.soma();
		System.out.println("Soma: " + calc.getResultado());
		
		calc.subtrair();
		System.out.println("Subtra��o: " +calc.getResultado());
		
		calc.multiplicar();
		System.out.println("Multiplica��o: " +calc.getResultado());
		
		calc.dividir();
		System.out.println("Divis�o:  " +calc.getResultado());
		
		calc.elevarPotencia();
		System.out.println("Exponencia��o: " +calc.getResultado());
		
		

	}

}
