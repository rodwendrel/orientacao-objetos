package recursos;

public class Fracao extends Acesso {

  public float calcularFracao(){
	  float valorAcesso = 0;
	  float fracaoTotal = (((getHoraSaida()-getHoraEntrada())*60) + Math.abs(getMinutoSaida()-getMinutoEntrada()))/15;
	
	  if(getMinutoEntrada() != 0 || getMinutoSaida() != 0){
	        valorAcesso = Estacionamento.getValorFracao()*fracaoTotal;}
	  else {
	        System.out.println("Minutos invalido");}
         Estacionamento.caixaEstacionamento(valorAcesso);
	
  return valorAcesso;}

  public void status(){
    System.out.println("Resumo do Acesso");
    System.out.println("Placa do carro " + getPlaca());
    System.out.println("Horário de entrada: "+ getHoraEntrada()+":"+getMinutoEntrada());
    System.out.println("Horário de saída:  "+ getHoraSaida()+":" + getMinutoSaida());
    System.out.println("O valor a ser pago do carro: R$ "+ calcularFracao() +"\n");}
}
