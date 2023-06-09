import lombok.*;
@Getter @Setter
public class Acesso {


    //Atributos
    private Estacionamento acessoFracao, valorDescontoHc, valorEstacionamento;
    private String placa;
    private boolean acessoHoraCheia, acessoDiurno, acessoNoturno, acessoMensalista, acessoEvento, valorAcesso;
    private Tempo horarioEntrada, horarioSaida,  hora, minuto;
    private  TipoAcesso acessoEspecifico;
    private Estacionamento acessoEspecificoEstacionamento;

    //Métodos

    public boolean validarCampos(){

        return validarCampos();
    };

    public boolean descricaoEmBrancoException(){

        return descricaoEmBrancoException();
    };

    public boolean valorAcessoInvalido(){

        return valorAcessoInvalido();
    };

    public double calcularPreco(int acessoFracao, double valorDescontoHc, boolean  acessoHoraCheia,
                                boolean  acessoDiurno, boolean  acessoNoturno,
                                boolean acessoMensalista, double acessoEvento){
        double preco;
        if(acessoDiurno == True ){
            if(hora >= 9){
                preco = valorEstacionamento;
            }else {
                preco = (minuto / 15) * acessoFracao + hora * ((valorDescontoHc / 100) * acessoFracao);
            }

        }
        else if(acessoNoturno == True){
            //preco = ;
        }

        return preco;
    };
}
