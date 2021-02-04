package Ex5;
import java.util.Scanner;

public class TestaAgenda {	    
	    public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Insira o nome da agenda: ");
	        String nome = scan.nextLine();
	        System.out.println("");

	        
	        Agenda agenda = new Agenda(nome);

	        Contato[] contatos = new Contato[2];
	        for (int i=0; i<2; i++){
	            System.out.println("Hora de colocar as infos dos contatos ");
	            Contato contato = new Contato();
	            
	            System.out.println("Insira o nome do novo contato: ");
	            nome = scan.nextLine();
	            contato.setNome(nome);
	            
	            System.out.println("Insira o telefone do novo contato: ");
	            String telefone = scan.nextLine();
	            contato.setTelefone(telefone);
	            
	            System.out.println("Insira o e-mail do novo contato: ");
	            String email = scan.nextLine();
	            contato.setEmail(email);
	            
	            contatos[i] = contato;
	        }
	        
	        	agenda.setContatos(contatos);
	        
	        	System.out.println(agenda.getNome());
	            System.out.println(agenda.imprimirInfo());	        
	        
	    }
	}