package Ex5;

public class Agenda {
	    
	    private String nome;
	    private Contato[] contatos;

	    public Agenda() {
	    }

	    public Agenda(String nome) {
	        this.nome = nome;
	    }
	    
	    

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Contato[] getContatos() {
	        return contatos;
	    }

	    public void setContatos(Contato[] contatos) {
	        this.contatos = contatos;
	    }
	    
	    public String imprimirInfo(){
	        String info = "Nome da agenda: " + nome + "\n";
	        System.out.println("");
	        for (Contato c : contatos){
	        	info += c.infoContatos() + "\n";
	            }
	        return info;
	    }
	}


	