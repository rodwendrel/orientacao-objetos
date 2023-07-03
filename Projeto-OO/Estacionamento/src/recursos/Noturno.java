package recursos;

public class Noturno extends Acesso{

    private int minimoEntrada;	
    private int maximoSaida;

    public float calcularAcessoNoturno(){
        float resultado = 0;
        int value = verificar();
        if(value == 1){
            resultado= ((Estacionamento.getPorcentagemNoturno()*Estacionamento.getValorDiaria())/100);
        }
        return resultado;
    }
    
    public int getMaximoSaida() {
		return maximoSaida;
	}

	public void setMaximoSaida(int maximoSaida) {
		this.maximoSaida = maximoSaida;
	}

    public int getMinimoEntrada() {
		return minimoEntrada;
	}

	public void setMinimoEntrada(int minimoEntrada) {
		this.minimoEntrada = minimoEntrada;
	}

    public int verificar(){
        int validacao = 0;
        if(getHoraEntrada()>= getMinimoEntrada() && getHoraSaida() <= getMaximoSaida()){
            validacao = 1;
            
        }
        return validacao;
    }
    public void status(){
        System.out.println("O valor a ser pago: R$"+ calcularAcessoNoturno());


        
    }

}
