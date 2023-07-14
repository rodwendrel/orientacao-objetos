package recursos;

public class ValorAcessoInvalidoException extends Exception{

    ValorAcessoInvalidoException(){
        super("A descrição não pode um valor negativo");
    }
}
