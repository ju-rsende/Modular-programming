
public class Hora {

	private int hora;
	private int minutos;
	private int segundos;

	public Hora(int hora, int minutos, int segundos) {
		setHora(hora);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	public void incrementarHora(int quantidade) {
		setHora(this.hora + quantidade);
	}

	public void incrementarMinutos(int quantidade) {
		int quantidadeTotal = this.minutos + quantidade;
		if (quantidadeTotal > 59) {
			int quantidadeHoras = quantidadeTotal / 60;
			incrementarHora(quantidadeHoras);
			setMinutos(quantidadeTotal - (60 * quantidadeHoras));
		} else {
			setMinutos(quantidadeTotal);
		}

	}

	public void incrementarSegundos(int quantidade) {
		int quantidadeTotal = this.minutos + quantidade;
		if (quantidadeTotal > 59) {
			int quantidadeMinutos = quantidadeTotal / 60;
			incrementarMinutos(quantidadeMinutos);
			setSegundos(quantidadeTotal - (60 * quantidadeMinutos));
		} else {
			setSegundos(quantidadeTotal);
		}
	}

	public boolean estaDepois(Hora outraHora) {
		var saoHorasIguais = this.hora == outraHora.getHora();
		var saoMinutosIguais = this.minutos == outraHora.getMinutos();
		
		var estaDepois = this.hora > outraHora.hora;
		
		if(!estaDepois && saoHorasIguais) {
			if (this.minutos > outraHora.minutos) {
				estaDepois = true;
			} else if (saoMinutosIguais) {
				estaDepois = this.segundos > outraHora.segundos;
			}
		}
		
		return estaDepois;
	}

	public int getHora() {
		return this.hora;
	}

	public void setHora(int hora) {
		if (hora > 0 && hora <= 24) {
			this.hora = hora;
		}
	}

	public int getMinutos() {
		return this.minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos >= 0 && minutos <= 60) {
			this.minutos = minutos;
		}
	}

	public int getSegundos() {
		return this.segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos <= 60) {
			this.segundos = segundos;
		}
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}

}
