package recursos;

public class Evento extends Acesso {

    float valorfixo;
    float acessosTotais;

    public float calcularEvento(){
        return(valorfixo * acessosTotais);

    }
}
