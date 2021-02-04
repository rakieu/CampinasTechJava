package Ex3;

public class TesteUnivPessoa {

	public TesteUnivPessoa() {
	}

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();


		
		pessoa.setNomePessoa("Vitória");
		pessoa.setNomeUniv("USP");
		pessoa.setAnoEntrada(1993);
		
		pessoa.mostrarDadosPessoa();
		
		System.out.println("");
		
		pessoa1.setNomePessoa("João");
		pessoa1.setNomeUniv("UNESP");
		pessoa1.setAnoEntrada(2005);
		
		pessoa1.mostrarDadosPessoa();
		
		System.out.println("");

		
		pessoa2.setNomePessoa("Patrícia");
		pessoa2.setNomeUniv("UFABC");
		pessoa2.setAnoEntrada(2020);
		
		pessoa2.mostrarDadosPessoa();

		

	}

}
