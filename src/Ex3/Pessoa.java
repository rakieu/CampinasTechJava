package Ex3;

public class Pessoa extends Universidade {
	
	public String nomePessoa;
	public int anoEntrada;

	//Uma classe Pessoa, que terá como atributo seu nome, em que universidade * trabalha 
	//e em quando entrou na universidade 
	//um método que dirá seu nome e * em que universidade trabalha.
				
		public Pessoa() {
					
				}
				
		public String getNomePessoa(String string) {
					return nomePessoa;
				}
		public String getUnivTrabalho() {
					return nomeUniv;
				}
				
		public void setNomePessoa(String nomePessoa) {
					this.nomePessoa = nomePessoa;
				}
				
		public void setUnivTrabalho(String nomeUniv) {
					this.nomeUniv = nomeUniv;
				}
		public void setAnoEntrada(int anoEntrada) {
					this.anoEntrada = anoEntrada;
				}
				
		public void mostrarDadosPessoa() {
					System.out.println("Nome da pessoa: " + this.nomePessoa);
					System.out.println("Universidade de trabalho: " + this.nomeUniv);
					System.out.println("Ano de entrada: " + this.anoEntrada);
			}
		

	}


