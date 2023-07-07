package recursos;

public class Mensalista extends Acesso{
	
    public float calcularPrecoMensal() {

        float ValorMensal = Estacionamento.getValorMensalista();
        Estacionamento.caixaEstacionamento(ValorMensal);

        return ValorMensal;
    }
    
    public void status(){
    	System.out.println("Resumo do Acesso Mensalista");
    	System.out.println("Placa do carro " + Cadastro.getPlaca());
    	System.out.println("Horário de entrada: "+ getHoraEntrada()+":"+getMinutoEntrada());
        System.out.println("Horário de saída:  "+ getHoraSaida()+":" + getMinutoSaida());
        System.out.println("O valor a ser pago mensalmente é: R$" + calcularPrecoMensal() +"\n");
    }

}
