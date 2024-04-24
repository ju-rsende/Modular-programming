
public class SalaDeEstudos {

	public static final int CAPACIDADE_MAXIMA = 4;
	
	public static final Hora HORA_ABERTURA = new Hora(9, 0, 0);

	public static final Hora HORA_FECHAMENTO = new Hora(22, 0, 0);

	
	
	public static int getCapacidadeMaxima() {
		return CAPACIDADE_MAXIMA;
	}

	public static Hora getHoraAbertura() {
		return HORA_ABERTURA;
	}

	public static Hora getHoraFechamento() {
		return HORA_FECHAMENTO;
	}
	
	
}
