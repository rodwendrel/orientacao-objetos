package recursos;

public class Tempo {

    protected int HorasTotais, MinutosTotais, horaEntrada, horaSaida, minutoEntrada, minutoSaida;

    public int getHoraSaida() {
		return this.horaSaida;
	}

  public int getHoraEntrada() {
		return horaEntrada;
	}

	public int getMinutoEntrada() {
		return minutoEntrada;
	}

	public int getMinutoSaida() {
		return minutoSaida;
	}

    public void setHoraEntradaEstacionamento(int hE){
    	this.horaEntrada = hE;
    }

    public void setHoraSaidaEstacionamento(int hS) {
    	this.horaSaida = hS;
    }
    
    public void setMinutoEntradaEstacionamento(int mE) {
    	this.minutoEntrada = mE;
    }
    
    public void setMinutoSaidaEstacionamento(int mS) {
    	this.minutoSaida = mS;
    }
    
    public void setMinutosTotaisEstacionamento(int minutoSaida, int minutoEntrada) {
    	
    	int mT = ((minutoSaida - minutoEntrada)/13);
    	
    	this.MinutosTotais = mT;
    }
    
    public void setHorasTotaisEstacionamento(int horaSaida, int horaEntrada) {
    	
    	int hT = horaSaida - horaEntrada;
    	
    	this.HorasTotais = hT;
    }
    
    public int getHorasTotaisEstacionamento() {
      return HorasTotais;
    }

     public int getMinutosTotaisEstacionamento() {
      return this.MinutosTotais;
    }
}