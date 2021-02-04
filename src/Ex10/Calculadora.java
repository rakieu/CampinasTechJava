package Ex10;

public class Calculadora {
	private double a;
	private double b;
	private double resultado;

	public Calculadora(double a, double b) {
		this.a = a;
		this.b = b;
		}
	
	
	public void soma() {
		resultado = this.a + this.b;
	}
	public void multiplicar() {
		resultado = this.a * this.b;
	}
	public void dividir () {
		resultado = this.a/this.b;

	}
	public void subtrair() {
		resultado = this.a - this.b;
	}
	public void elevarPotencia() {
		resultado = Math.pow(this.a, this.b);
	}
	public double getResultado() {
		return resultado;
		
	}

}
