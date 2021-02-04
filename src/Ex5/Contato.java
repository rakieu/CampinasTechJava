package Ex5;

public class Contato {
	    
	    private String nome;
	    private String telefone;
	    private String email;


	    public String getNome() {
	        return nome;
	    }


	    public void setNome(String nome) {
	        this.nome = nome;
	    }


	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String infoContatos(){
	        return "Nome do contato: " + this.nome + "\n" +
	                "Telefone do contato " + this.nome + ": " +this.telefone + "\n" +
	                "E-mail do contato " + this.nome + ": " + this.email;
	    }
	}
