package Ex9;

public class ConversaoDeUnidadeDeTempo {
	public static double converteMinutosSegundos(double minuto) {
		double segundos = minuto * 60;
		return segundos;
	}
	
	public static double converteHorasMinutos(double hora) {
		double minutos = hora * 60;
		return minutos;
	}

	public static double converteDiasHoras(double dias) {
		double horas = dias * 24;
		return horas;
	}
	
	public static double converteSemanasDias(double semanas) {
		double dias = semanas * 7;
		return dias;
	}
	
	public static double converteMesDias(double mes) {
		double dias = mes * 30;
		return dias;
	}
	
	public static double converteAnosDias(double ano) {
		double dias = ano * 365;
		return dias;
	}
}
