package recursos;

public class HoraCheia extends Acesso{
    
    //metodo
    public float calcularHoraCheia(){
        float valorAcesso = 0;
       // System.out.println("Fração "+ getHoraEntrada()); 
        int horaTotal = getHoraSaida()-getHoraEntrada();
        int minuto = getMinutoSaida() - getMinutoEntrada();

        if(minuto == 0){
        valorAcesso = ((Estacionamento.getValorFracao()*4*horaTotal) - ((Estacionamento.getPorcentagemHoraCheia()*4*Estacionamento.getValorFracao()*horaTotal)/100)) ;}
        else {
            System.out.println("valor invalido");
        }
        Estacionamento.caixaEstacionamento(valorAcesso);
        return valorAcesso;
}
    
    
    public void status(){
    	System.out.println("Resumo do Acesso Hora Cheia");
    	System.out.println("Placa do carro " + Cadastro.getPlaca());
    	System.out.println("Horário de entrada: "+ getHoraEntrada()+":"+getMinutoEntrada());
        System.out.println("Horário de saída:  "+ getHoraSaida()+":" + getMinutoSaida());
        System.out.println("O valor a ser pago: R$"+ calcularHoraCheia()+"\n"); 
    }

}
