public class Acesso {


    //Atributos
   // private Estacionamento acessoFracao, valorDescontoHc, valorEstacionamento;
    private String placa;
    private int tipoDoAcesso; // Passando os acessos para int
    private double valorAcesso;
    private int horaEntrada, minutoEntrada, horaSaida, minutoSaida, horatotal, precototal; 
    //private  TipoAcesso acessoEspecifico;
    //private Estacionamento acessoEspecificoEstacionamento;

    //Métodos Get e Set

    public String getPlaca() {
        return placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getMinutoEntrada() {
        return minutoEntrada;
    }

    public void setMinutoEntrada(int minutoEntrada) {
        this.minutoEntrada = minutoEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public int getMinutoSaida() {
        return minutoSaida;
    }

    public void setMinutoSaida(int minutoSaida) {
        this.minutoSaida = minutoSaida;
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
                this.setPrecototal((this.getHoraEntrada()- this.getHoraSaida())*4);
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
