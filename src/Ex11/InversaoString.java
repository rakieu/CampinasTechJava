package Ex11;
import java.util.Scanner;


/*Escreva um algoritmo que inverta o conte�do de uma String utilizando uma estrutura de repeti��o. O usu�rio ir� entrar com o valor de uma string, por exemplo "ASDFG", e o programa dever� devolver o seguinte resultado "GFDSA"
*/
public class InversaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira a string para inverter: ");
		String inversao = in.nextLine();
		
		String invertido = "";
		
		for (int i = inversao.length()-1; i >= 0; i--) {
			
			invertido = invertido + inversao.charAt(i); 
			char c='S';  
			String s=String.valueOf(c);
		}
		System.out.println(invertido);
		
		in.close();

	}

}
