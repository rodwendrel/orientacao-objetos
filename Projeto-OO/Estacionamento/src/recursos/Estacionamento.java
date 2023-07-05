package recursos;


public class Estacionamento {

    private int capacidade;
	private static float valorFracao, valorDiaria, valorMensalista, valorEvento, valorTotal = 0, valorContratante = 0;
    private static int porcentagemHoraCheia, porcentagemNoturno;
    private static int porcentagemRetorno;
    protected Tempo funcionamento = new Tempo();
    

	//private float horaCheia;
    public Estacionamento(int capacidade, float valorFracao, int porcentagemHoraCheia, int valorDiaria, int porcentagemNoturno , float valorMensalista, float valorEvento, int porcentagemRetorno, int horaInicio, int horaFinal) {
        if(validarInt(capacidade) == 1){
            this.capacidade = capacidade;
        }
        if(validarFloat(valorFracao) == 1) {
            Estacionamento.valorFracao = valorFracao;
        }
        if(validarInt(porcentagemHoraCheia) == 1) {
            Estacionamento.porcentagemHoraCheia = porcentagemHoraCheia;
        }
        if(validarFloat(valorDiaria) == 1) {
            Estacionamento.valorDiaria = valorDiaria;
        }
        if(validarInt(porcentagemNoturno) == 1) {
            Estacionamento.porcentagemNoturno = porcentagemNoturno;
        }
        if(validarFloat(valorMensalista) == 1){
            Estacionamento.valorMensalista = valorMensalista;
        }
        if(validarFloat(valorEvento) == 1){
            Estacionamento.valorEvento = valorEvento;
        }
        if(validarInt(porcentagemRetorno)==1) {
        	this.porcentagemRetorno = porcentagemRetorno;
        }
        if(validarInt(horaInicio)==1) {
        	setHoraEntradaEstacionamento(horaInicio) ;
        }
        if(validarInt(horaFinal)==1) {
        	setHoraSaidaEstacionamento(horaFinal);
        }
    }

	public static float getPorcentagemRetorno() {
			return porcentagemRetorno;
		}
	
	public void setPorcentagemRetorno(int porcentagemRetorno) {
		Estacionamento.porcentagemRetorno = porcentagemRetorno;
	}

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if(validarInt(capacidade) == 1){
            this.capacidade = capacidade;
        }
    }

    public static float getValorFracao() {
        return Estacionamento.valorFracao;
    }

    public void setValorFracao(float valorFracao) {
        Estacionamento.valorFracao = valorFracao;
    }

    public static int getPorcentagemHoraCheia() {
        return Estacionamento.porcentagemHoraCheia;
    }

    public void setPorcentagemHoraCheia(int porcentagemHoraCheia) {
        if(validarInt(porcentagemHoraCheia) == 1) {
            Estacionamento.porcentagemHoraCheia = porcentagemHoraCheia;
        }
    }

    public static float getValorDiaria() {
        return Estacionamento.valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        if(validarFloat(valorDiaria) == 1) {
            Estacionamento.valorDiaria = valorDiaria;
        }
    }

    public static int getPorcentagemNoturno() {
        return Estacionamento.porcentagemNoturno;
    }

    public void setPorcentagemNoturno(int porcentagemNoturno) {
        if(validarInt(porcentagemNoturno) == 1) {
            Estacionamento.porcentagemNoturno = porcentagemNoturno;
        }
    }

    public static float getValorMensalista() {
        return Estacionamento.valorMensalista;
    }

    public static float getValorEvento() {
        return Estacionamento.valorEvento;
    }

    public void setValorEvento(float valorEvento) {
        if(validarFloat(valorEvento) == 1){
            Estacionamento.valorEvento = valorEvento;
        }
    }
    public static float getValorTotal() {
		return valorTotal;
	}

	public static void setValorTotal(float valorTotal) {
		Estacionamento.valorTotal = valorTotal;
	}

	public static float getValorContratante() {
		return valorContratante;
	}

	public static void setValorContratante(float valorContratante) {
		Estacionamento.valorContratante = valorContratante;
	}


    // funções
	public static float caixaEstacionamento(float ganho) {
		Estacionamento.valorTotal += ganho;
		return Estacionamento.valorTotal;
	}
	
	public static float retornoEstacionamento(float ganho) {
		Estacionamento.valorContratante = ganho*(getPorcentagemRetorno()/100);
		return Estacionamento.valorContratante;
	}
	
	
    public static int validarInt(int numero){
        int i;
        if(numero < 0 ){
            System.out.println("O campo está em branco ou é inválido");
            i = 0;
        }else{
            i = 1;
        }
        return i;
    }

    public static int validarFloat(float numero){
        int i;
        if(numero < 0  ){
            System.out.println("O campo está em branco ou é inválido");
            i = 0;
        }else{
            i = 1;
        }
        return i;
    }

  //Tempo
    
    public void setHoraEntradaEstacionamento(int hE){
    	funcionamento.horaEntrada = hE;
    }

    public void setHoraSaidaEstacionamento(int hS) {
    	funcionamento.horaSaida = hS;
    }
    
    public void setMinutoEntradaEstacionamento(int mE) {
    	funcionamento.minutoEntrada = mE;
    }
    
    public void setMinutoSaidaEstacionamento(int mS) {
    	funcionamento.minutoSaida = mS;
    }
    
    public int getHoraSaida() {
		return funcionamento.horaSaida;
	}

    public int getHoraEntrada() {
		return funcionamento.horaEntrada;
	}


	public int getMinutoEntrada() {
		return funcionamento.minutoEntrada;
	}

	public int getMinutoSaida() {
		return funcionamento.minutoSaida;
	}
	
	
    
	public void statusCaixa(){
	        System.out.println("Status do caixa do estacionamento "+ Cadastro.getEstacionamento());
	        System.out.println("Valor do caixa: R$"+ Estacionamento.caixaEstacionamento(0));
	        System.out.println("Valor do contratante: R$"+ Estacionamento.retornoEstacionamento(Estacionamento.caixaEstacionamento(0))+"\n");
	
	    }
    
   public void status(){
        System.out.println("Status do estacionamento "+Cadastro.getEstacionamento());
        System.out.println("Capacidade máxima: "+ getCapacidade());
        System.out.println("Valor fração: R$ "+ getValorFracao());
        System.out.println("Valor diária diurna: R$ "+ getValorDiaria());
        System.out.println("Valor do acesso mesalista: R$ "+ getValorMensalista());
        System.out.println("Valor do acesso evento: R$ "+ getValorEvento());
        System.out.println("Valor do caixa: R$"+ Estacionamento.caixaEstacionamento(0));
        System.out.println("Horário do inicio do funcionamento: "+ getHoraEntrada()+"h");
        System.out.println("Horário do fim do funcionamento: "+ getHoraSaida()+"h \n");

    }
}