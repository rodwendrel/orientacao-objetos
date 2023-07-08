package recursos;

public abstract class Acesso{

  //Atributos
 
  protected String placa;
  protected  int precototal; // Passando os acessos para int
  protected  double valorAcesso;
  protected  int horatotal;
  protected String Placa;
  //relação entre classes
  protected Tempo t = new Tempo(); 
 // protected Cadastro carro = new Cadastro();

  //Métodos Get e Set


  public int getHoratotal() {
      return horatotal;
  }

  public int getPrecototal() {
      return precototal;
  }

  public void setPrecototal() {
      
  }

  public double getValorAcesso() {
      return valorAcesso;
  }

  public void setValorAcesso() {

  }
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		this.Placa = placa;
	}

  //Tempo

  public void setHoraEntradaEstacionamento(int hE){
    t.horaEntrada = hE;
  }

  public void setHoraSaidaEstacionamento(int hS) {
    t.horaSaida = hS;
  }
  
  public void setMinutoEntradaEstacionamento(int mE) {
    t.minutoEntrada = mE;
  }
  
  public void setMinutoSaidaEstacionamento(int mS) {
    t.minutoSaida = mS;
  }
    
    public int getHoraSaida() {
		return t.horaSaida;
	}

    public int getHoraEntrada() {
		return t.horaEntrada;
	}


	public int getMinutoEntrada() {
		return t.minutoEntrada;
	}

	public int getMinutoSaida() {
		return t.minutoSaida;
	}
	
  public void setMinutosTotaisEstacionamento(int mT) {
    
    mT = ((t.minutoSaida - t.minutoEntrada)/13);
    
    t.MinutosTotais = mT;
  }
  
  public void setHorasTotaisEstacionamento(int hT) {
    
    hT = t.horaSaida - t.horaEntrada;
    
    t.HorasTotais = hT;
  }
  
  public int getHorasTotaisEstacionamento() {
    return t.HorasTotais;
  }

    public int getMinutosTotaisEstacionamento() {
    return t.MinutosTotais;
  }

  
  
  void status(){
  System.out.println("Placa: " + getPlaca());
  
  };
}