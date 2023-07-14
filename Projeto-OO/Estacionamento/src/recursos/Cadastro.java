package recursos;

public class Cadastro {
	protected  String Placa;
	protected int Estacionamento;
	
	public Cadastro(String placa, String estacionamento) throws DescricaoEmBrancoException {
		if(placa.isEmpty() || estacionamento.isEmpty()){
			 throw new DescricaoEmBrancoException();
		 }else{
			this.Estacionamento = Integer.valueOf(estacionamento);
			this.Placa = placa;
		 }
	}
	
	public  String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa)  {
			this.Placa = placa;
		 
	}
	public  int  getEstacionamento() {
		return Estacionamento;
	}
	public void setEstacionamento(int estacionamento) {
		this.Estacionamento = estacionamento;
	}
	
	public void status() {
		System.out.println("Resumo do Cadastro");
	    System.out.println("Placa do carro " + getPlaca());
	    System.out.println("Estacionamento cadastrado: "+ getEstacionamento()+"\n");
	}

 
	
}
