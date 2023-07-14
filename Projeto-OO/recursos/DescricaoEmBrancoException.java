package recursos;

public class DescricaoEmBrancoException extends Exception {

public String mensagem;

DescricaoEmBrancoException(){
        this.mensagem = "A Descrição está em branco.";
}


}
