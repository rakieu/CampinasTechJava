package Ex3;

//Uma classe chamada Universidade que ter� como atributo um nome 
//e ter� um m�todo para informar o seu nome.


public class Universidade {
	
	public String nomeUniv;
		
		public void nomeUniversidade(String nomeUniv) {
			this.nomeUniv = nomeUniv;
		} 
		
		public void imprimeDados() {
			System.out.println("Nome da Universidade: " + nomeUniv);
		}
		
		public String getNomeUniv() {
			return nomeUniv;
		}
		
		public void setNomeUniv(String nomeUniv) {
			this.nomeUniv = nomeUniv;
		}
		
	}
