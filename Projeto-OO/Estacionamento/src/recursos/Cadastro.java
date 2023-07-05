package recursos;

public class Cadastro {
	protected static String Placa;
	protected static int Estacionamento;
	
	public static String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Cadastro.Placa = placa;
	}
	public static int  getEstacionamento() {
		return Estacionamento;
	}
	public void setEstacionamento(int estacionamento) {
		Cadastro.Estacionamento = estacionamento;
	}
	
	public void status() {
		System.out.println("Resumo do Cadastro");
	    System.out.println("Placa do carro " + getPlaca());
	    System.out.println("Estacionamento cadastrado: "+ getEstacionamento()+"\n");
	}
	
}
