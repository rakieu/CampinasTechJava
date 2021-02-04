package Ex4;

/*O controle remoto pode controlar o volume e trocar canais.
O controle do volume permite:
- aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
aumentar e diminuir o número do canal em uma unidade;
trocar para um canal indicado;
informar o valor do volume de som e o canal selecionado;
um ControleRemoto TEM uma televisão.*/

public class ControleRemoto {

	private int volume;
	private int canal;
	
	public int aumentarVolume() {
		this.volume = this.volume + 1;
		return this.volume;
	}
	
	public int diminuirVolume() {
		this.volume = this.volume - 1;
		return this.volume;
	}
	
	public int aumentarCanal() {
		this.canal = this.canal + 1;
		return this.canal;
	}
	
	public int diminuirCanal() {
		this.canal = this.canal - 1;
		return this.canal;
	}
	
	public int mudarCanal(int canalEscolhido) {
		this.canal = canalEscolhido;
		return this.canal;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	
	
}