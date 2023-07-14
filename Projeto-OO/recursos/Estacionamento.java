package recursos;


public class Estacionamento {

    private int capacidade, numEstacionamento;
	private static float valorFracao, valorDiaria, valorMensalista, valorEvento, valorTotal = 0, valorContratante = 0;
    private static int porcentagemHoraCheia, porcentagemNoturno;
    private static int porcentagemRetorno;
    protected Tempo funcionamento = new Tempo();

	//private float horaCheia;
    public Estacionamento(String numEstacionamento,String capacidade, String valorFracao, String porcentagemHoraCheia, String valorDiaria, String porcentagemNoturno , String valorMensalista, String valorEvento, String porcentagemRetorno, String horaInicio, String horaFinal) throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
        
        //Verificação da parte da numeração do Estacionamento
        if(numEstacionamento.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(numEstacionamento) < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            this.numEstacionamento = Integer.valueOf(numEstacionamento);
        }
        
        //Verificação da parte da capacidade
        if(capacidade.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(capacidade) < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            this.capacidade = Integer.valueOf(capacidade);
        }
        
        //Verificação da parte de valorFracao
        if(valorFracao.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(valorFracao).floatValue() < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            Estacionamento.valorFracao = Integer.valueOf(valorFracao).floatValue();
        }

        //Verificação da parte da PorcentagemHoraCheia
        if(porcentagemHoraCheia.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(porcentagemHoraCheia) < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            Estacionamento.porcentagemHoraCheia = Integer.valueOf(porcentagemHoraCheia);
        }
                
        //Verificação da parte de porcentagem hora cheia
        if(valorFracao.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(porcentagemHoraCheia).floatValue() < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            Estacionamento.valorDiaria = Integer.valueOf(valorDiaria).floatValue();  
        }
        
         //Verificação da parte da Porcentagem Noturno
        if(porcentagemNoturno.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(porcentagemNoturno) < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            Estacionamento.porcentagemNoturno = Integer.valueOf(porcentagemNoturno);
        }
        //Verificação da parte do valor Mensalista
        if(valorMensalista.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(valorMensalista).floatValue() < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            Estacionamento.valorMensalista = Integer.valueOf(valorMensalista).floatValue();
        }

        //Verificação da parte da valor Evento
        if(valorEvento.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(valorEvento).floatValue() < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            Estacionamento.valorEvento = Integer.valueOf(valorDiaria).floatValue();
        }
        
        //Verificação da parte da PorcentagemRetorno
        if(porcentagemRetorno.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(porcentagemRetorno) < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            Estacionamento.porcentagemRetorno = Integer.valueOf(porcentagemRetorno);
        }

        //Verificação da parte da HoraInicio
        if(horaInicio.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(horaInicio) < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            setHoraEntradaEstacionamento(Integer.valueOf(horaInicio));
        }

        //Verificação da parte da HoraFinal
        if(horaFinal.isEmpty()){
            throw new DescricaoEmBrancoException();
        } else if(Integer.valueOf(horaFinal) < 0){
            throw new ValorAcessoInvalidoException();
        }
            else {
            setHoraSaidaEstacionamento(Integer.valueOf(horaFinal));
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
        this.capacidade = capacidade;
        
    }
    public void setNumEstacionamento(int numero){
        numEstacionamento = numero;
    }
    public int getNumEstacionamento(){
        return numEstacionamento;
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
            Estacionamento.porcentagemHoraCheia = porcentagemHoraCheia;
        
    }

    public static float getValorDiaria(){
        return Estacionamento.valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
            Estacionamento.valorDiaria = valorDiaria;
        
    }

    public static int getPorcentagemNoturno() {
        return Estacionamento.porcentagemNoturno;
    }

    public void setPorcentagemNoturno(int porcentagemNoturno) {
            Estacionamento.porcentagemNoturno = porcentagemNoturno;
        
    }

    public static float getValorMensalista() {
        return Estacionamento.valorMensalista;
    }

    public static float getValorEvento() {
        return Estacionamento.valorEvento;
    }

    public void setValorEvento(float valorEvento) {
            Estacionamento.valorEvento = valorEvento;
        
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
	        System.out.println("Status do caixa do estacionamento ");
	        System.out.println("Valor do caixa: R$"+ Estacionamento.caixaEstacionamento(0));
	        System.out.println("Valor do contratante: R$"+ Estacionamento.retornoEstacionamento(Estacionamento.caixaEstacionamento(0))+"\n");
	
	    }

   public void status(){
        System.out.println("Status do estacionamento "+ getNumEstacionamento());
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