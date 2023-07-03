package recursos;

public abstract class Acesso extends Tempo{

    //Atributos
 
    protected String placa;
    protected  int precototal; // Passando os acessos para int
    protected  double valorAcesso;
	protected  int horatotal;
    //protected static int horaEntrada, minutoEntrada, horaSaida, minutoSaida;
    //private TipoAcesso acessoEspecifico;
    //private Estacionamento acessoEspecificoEstacionamento;

    //Métodos Get e Set

    public String getPlaca() {
        return placa;
    }

    public int getHoratotal() {
        return horatotal;
    }

    public int getPrecototal() {
        return precototal;
    }

    public void setPrecototal() {
        
    }

    public double getValorAcesso() {
        return valorAcesso;
    }

    public void setValorAcesso() {

    }
    
   // Metodos 
    
    public void validarCampos(){

    };

    public void descricaoEmBrancoException(){
        
    };

    public void valorAcessoInvalido(){

    };
    
    void status(){
		System.out.println("Placa: " + getPlaca());
		
    };
}