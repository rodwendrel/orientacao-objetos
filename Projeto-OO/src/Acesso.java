import lombok.*;
@Getter @Setter
public class Acesso {


    //Atributos
    private String placa;
    private boolean acessoHoraCheia, acessoDiariaDiurna, acessoMensalista, acessoEvento, valorAcesso;
    private Tempo horarioEntrada, horarioSaida;
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

    public double calcularPreco(double acessoFracao, double acessoHoraCheia,
                                double acessoHoraDiurna, double acessoHoraNoturna,
                                double acessoMensalista, double acessoEvento){

        return calcularPreco(acessoFracao, acessoHoraCheia,
                acessoHoraDiurna, acessoHoraNoturna,
                acessoMensalista, acessoEvento);
    };
}
