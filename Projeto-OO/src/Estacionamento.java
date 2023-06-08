import lombok.*;
@Getter @Setter
public class Estacionamento {

    // Atributos
    private double valorPorcentagemContratante, valorDescontoHc, valorEstacionamento;
    private int capacidadeEstacionamento, acessoFracao;
    private Tempo horarioAbertura, horarioEncerramento;
    private TipoAcesso valoresAcessos;
    private Acesso acessoEspecificoEstacionamento;


    //Métodos
    public boolean validarValoresAcessos(){
        return validarValoresAcessos();
    };

    public boolean descricaoEmBrancoException(){
        return descricaoEmBrancoException();
    };

    public double calcularValorContratante( double valorEstacionamento,double valorPorcentagemContratante){
        this.valorEstacionamento = valorEstacionamento;
        this.valorPorcentagemContratante = valorPorcentagemContratante;

        return (valorPorcentagemContratante / 100) * valorEstacionamento;
    };
}
