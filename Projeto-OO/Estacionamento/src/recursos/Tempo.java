package recursos;

public abstract class Tempo {

    protected int HorasTotais, MinutosTotais, horaEntrada, horaSaida, minutoEntrada, minutoSaida;

    public int getHoraSaida() {
		return horaSaida;
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
    
    public void setMinutosTotaisEstacionamento(int mT) {
    	
    	mT = ((this.minutoSaida - this.minutoEntrada)/13);
    	
    	this.MinutosTotais = mT;
    }
    
    public void setHorasTotaisEstacionamento(int hT) {
    	
    	hT = this.horaSaida - this.horaEntrada;
    	
    	this.HorasTotais = hT;
    }
    
    public int getHorasTotaisEstacionamento() {
      return HorasTotais;
    }

     public int getMinutosTotaisEstacionamento() {
      return this.MinutosTotais;
    }
}