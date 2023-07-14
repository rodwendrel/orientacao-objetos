package recursos;

public class Cadastro {
	protected  String Placa;
	protected int Estacionamento;
	
	public Cadastro(String placa, int estacionamento) {
		this.Placa = placa;
		this.Estacionamento = estacionamento;
	}
	
	public  String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
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

    /**
     * @param frase
     * @throws DescricaoEmBrancoException
     */
    public static void validarDescricao(String frase) throws DescricaoEmBrancoException{
		try{
		 if(frase.isEmpty()){
			 throw new DescricaoEmBrancoException();
			 //System.out.println("O campo está em branco ou é inválido");   
		 }
		}catch(){

		 }
	 }
 
	
}
