package recursos;

public class Cadastro {
	protected static String Placa;
	protected int Estacionamento;
	
	public static String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Cadastro.Placa = placa;
	}
	public int getEstacionamento() {
		return Estacionamento;
	}
	public void setEstacionamento(int estacionamento) {
		Estacionamento = estacionamento;
	}
	
}
