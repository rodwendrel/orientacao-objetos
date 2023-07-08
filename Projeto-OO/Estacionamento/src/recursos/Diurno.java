package recursos;

public class Diurno extends Acesso{
 
 public float calcularDiariaDiurna(){
    float valorAcesso = 0;
    int horaTotal = getHoraSaida()-getHoraEntrada();

    if(horaTotal >= 9){
        valorAcesso = Estacionamento.getValorDiaria();}
    else {
            System.out.println("O total de horas nao foi o suficiente para ser cobrado como diaria diurna ");}

    Estacionamento.caixaEstacionamento(valorAcesso);

        return valorAcesso;
}
    // Imprimindo dos status
    public void status(){
    	System.out.println("Resumo do Acesso Diurno");
    	System.out.println("Placa do carro " + getPlaca());
    	System.out.println("Horário de entrada: "+ getHoraEntrada()+":"+getMinutoEntrada());
        System.out.println("Horário de saída:  "+ getHoraSaida()+":" + getMinutoSaida());
        System.out.println("O valor a ser pago: R$"+ calcularDiariaDiurna() +"\n"); 
    }

}
