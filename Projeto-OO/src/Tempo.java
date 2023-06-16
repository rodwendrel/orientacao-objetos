public class Tempo {

    private int horaEntrada, horaSaida, minutoEntrada, minutoSaida, HorasTotais, MinutosTotais;

    public void setHoraEntradaEstacionamento(int hE){
    	
    	hE = Acesso.getHoraEntrada();
    	
    	this.horaEntrada = hE;
    };
    
    public void setHoraSaidaEstacionamento(int hS) {
    	
    	hS = Acesso.getHoraSaida();
    	
    	this.horaSaida = hS;
    }
    
    public void setMinutoEntradaEstacionamento(int mE) {
    	
    	mE = Acesso.getMinutoEntrada();
    	
    	this.minutoSaida = mE;
    }
    
    public void setMinutoSaidaEstacionamento(int mS) {
    	
    	mS = Acesso.getMinutoSaida();
    	
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
    
    public String getHorasPassadasEstacionamento() {
    	
		return null;
    }
}
