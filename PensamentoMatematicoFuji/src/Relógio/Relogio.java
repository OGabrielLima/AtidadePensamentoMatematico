package Relógio;

public class Relogio {
	private int hora;
	private int minutos;
	
	public String proximoMinuto() {
		//Thread.sleep(60000);
		
		minutos += 1;
		if(minutos == 60) {
			hora += 1;
			minutos = 0;
		}
		if (hora == 24) {
			hora = 0;
		}
		
		return imprimir();
		
	}

	public String imprimir() {
		return "Hora: "+hora + ":"+minutos;
		
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	

}
