package Ex9;

public class TestaConversao {
	public static void main(String[] args) {
		
		System.out.println("Minutos para segundos: " + ConversaoDeUnidadeDeTempo.converteMinutosSegundos(10));
		System.out.println("Anos para dias: " + ConversaoDeUnidadeDeTempo.converteAnosDias(15));
		System.out.println("Dias para horas: " + ConversaoDeUnidadeDeTempo.converteDiasHoras(16));
		System.out.println("Hora para minutos: " + ConversaoDeUnidadeDeTempo.converteHorasMinutos(20));
		System.out.println("Mês para dias: " +ConversaoDeUnidadeDeTempo.converteMesDias(15));
		System.out.println("Semana para dias: " + ConversaoDeUnidadeDeTempo.converteAnosDias(11));
	}
}
