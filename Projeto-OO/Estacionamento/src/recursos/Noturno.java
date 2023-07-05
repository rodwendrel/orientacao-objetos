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
        Estacionamento.caixaEstacionamento(resultado);
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
    	System.out.println("Resumo do Acesso Noturno");
    	System.out.println("Placa do carro " + getPlaca());
    	System.out.println("Horário de entrada: "+ getHoraEntrada()+":"+getMinutoEntrada());
        System.out.println("Horário de saída:  "+ getHoraSaida()+":" + getMinutoSaida());
        System.out.println("O valor a ser pago do carro: R$ "+ calcularAcessoNoturno()+ "\n");


        
    }

}
