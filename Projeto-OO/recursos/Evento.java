package recursos;

public class Evento extends Acesso {
private String nomeEvento;

    public float calcularEvento(){
      float valorAcesso = Estacionamento.getValorEvento();
      Estacionamento.caixaEstacionamento(valorAcesso);
       return valorAcesso;

    } 
    public String getNomeEvento() {
    	return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
    	this.nomeEvento = nomeEvento;
    }
    public void status(){
    	System.out.println("Resumo do Acesso Evento");
    	System.out.println("Nome do evento: "+ getNomeEvento());
    	System.out.println("Placa do carro " + Cadastro.getPlaca());
    	System.out.println("Horário de entrada: "+ getHoraEntrada()+":"+getMinutoEntrada());
        System.out.println("Horário de saída:  "+ getHoraSaida()+":" + getMinutoSaida());
        System.out.println("O valor a ser pago: R$"+ calcularEvento());
        
    }
}
