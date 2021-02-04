package Ex14;
import java.util.Scanner;


public class VerificaPrimo {

	public VerificaPrimo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new  Scanner(System.in); 
		 System.out.println("Digite um número: ");
		 int num = scan.nextInt(); 
		 boolean primo = true;
		 
		 if (num==0 || num==1) {
		 primo = false;
		 }
		 else {
		 for (int i = 2; i < num; i++) {
		 if ((num % i) == 0){ 
		 primo = false; 
		 break; 
		 }
		 }
		 }
		 
		 if (primo) { 
		 System.out.println("O número " + num + " é primo");
		 } else {  
		 System.out.println("O número " + num  + " não é primo");
		 }
		
	}

}
