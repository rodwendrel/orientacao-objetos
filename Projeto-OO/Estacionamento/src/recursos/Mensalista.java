package recursos;

public class Mensalista extends Acesso{

    private float valorFixo;

    public void setValorMensalista(float valorMensalista) {
        if(Estacionamento.validarFloat(valorMensalista) == 1){
           // Estacionamento.getValorMensalista() = valorMensalista;
        }
    }
    
}
