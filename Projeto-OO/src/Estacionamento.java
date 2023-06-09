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

    //setando
    public void setAcessoFracao(int acessofracao){
        this.acessoFracao = acessofracao;
    }
    public int getAcessoFracao(){
        return acessoFracao;
    }
    public boolean descricaoEmBrancoException(){
        return descricaoEmBrancoException();
    };

    public double calcularValorContratante( double valorEstacionamento,double valorPorcentagemContratante){
        this.valorEstacionamento = valorEstacionamento;
        this.valorPorcentagemContratante = valorPorcentagemContratante;

        return (valorPorcentagemContratante / 100) * valorEstacionamento;
    };
}
