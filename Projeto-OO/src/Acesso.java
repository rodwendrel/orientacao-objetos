public class Acesso {


    //Atributos
   // private Estacionamento acessoFracao, valorDescontoHc, valorEstacionamento;
    private String placa;
    private int tipoDoAcesso; // Passando os acessos para int
    private double valorAcesso;
    private static int horaEntrada, minutoEntrada, horaSaida, minutoSaida; 
    //private  TipoAcesso acessoEspecifico;
    //private Estacionamento acessoEspecificoEstacionamento;
	private int precototal;

    //Métodos Get e Set

    public String getPlaca() {
        return placa;
    }

    public static int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        Acesso.horaEntrada = horaEntrada;
    }

    public static int getMinutoEntrada() {
        return minutoEntrada;
    }

    public void setMinutoEntrada(int minutoEntrada) {
        Acesso.minutoEntrada = minutoEntrada;
    }

    public static int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        Acesso.horaSaida = horaSaida;
    }

    public static int getMinutoSaida() {
        return minutoSaida;
    }

    public void setMinutoSaida(int minutoSaida) {
        Acesso.minutoSaida = minutoSaida;
    }

    public int getHoratotal() {
        return horatotal;
    }

    public void setHoratotal(int horatotal) {
        this.horatotal = horatotal;
    }

    public int getPrecototal() {
        return precototal;
    }

    public void setPrecototal(int precototal) {
        this.precototal = precototal;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTipoDoAcesso() {
        return tipoDoAcesso;
    }

    public void setTipoDoAcesso(int tipoDoAcesso) {
        this.tipoDoAcesso = tipoDoAcesso;
    }

    public double getValorAcesso() {
        return valorAcesso;
    }

    public void setValorAcesso(double valorAcesso) {
        this.valorAcesso = valorAcesso;
    }
    
   // Metodos 
    public void validarCampos(){

    };

    public void descricaoEmBrancoException(){
        
    };

    public void valorAcessoInvalido(){

    };

    public void calcularPreco(){
    switch(tipoDoAcesso){
            
            case 1 -> {
                // Acesso por hora cheia
                this.setPrecototal((Acesso.getHoraEntrada()- Acesso.getHoraSaida())*4);
                }
            case 2 -> {
                //Acesso por Diaria Diurna

                }
            case 3 -> {
                // Acesso por Diaria Noturna 
                }
            case 4 -> {
                // Acesso Mensalista
            }
            
            case 5 -> {
                // Acesso Evento
            }
        
    };
    }}
