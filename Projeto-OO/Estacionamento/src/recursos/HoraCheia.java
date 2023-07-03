package recursos;

public class HoraCheia extends Acesso{
    
    //metodo
    public float calcularHoraCheia(){
        float valorAcesso = 0;
       // System.out.println("Fração "+ getHoraEntrada()); 
        int horaTotal = getHoraSaida()-getHoraEntrada();

        if(getMinutoEntrada() == 0 && getMinutoSaida() == 0){
        valorAcesso = ((Estacionamento.getValorFracao()*4*horaTotal) - ((Estacionamento.getPorcentagemHoraCheia()*4*Estacionamento.getValorFracao()*horaTotal)/100)) ;}
        else {
            System.out.println("valor invalido");
        }
        return valorAcesso;
}
    
    
    public void status(){
        System.out.println("O valor a ser pago: R$"+ calcularHoraCheia()); 
    }

}
