package recursos;


public class Estacionamento {

    private int capacidade;
    private float  valorFracao;
    private int porcentagemHoraCheia;
    private float valorDiaria;
    private int porcentagemNoturno; 
    private float valorMensalista;
    private float valorEvento;
    private int porcentagemRetorno;
  //  private int valorNoturno;
  //  private int valorHoraCheia;
    

	//private float horaCheia;
    public Estacionamento(int capacidade, float valorFracao, int porcentagemHoraCheia, int valorDiaria, int porcentagemNoturno , float valorMensalista, float valorEvento, int porcentagemRetorno) {
        if(validarInt(capacidade) == 1){
            this.capacidade = capacidade;
        }
        if(validarFloat(valorFracao) == 1) {
            this.valorFracao = valorFracao;
        }
        if(validarInt(porcentagemHoraCheia) == 1) {
            this.porcentagemHoraCheia = porcentagemHoraCheia;
        }
        if(validarFloat(valorDiaria) == 1) {
            this.valorDiaria = valorDiaria;
        }
        if(validarInt(porcentagemNoturno) == 1) {
            this.porcentagemNoturno = porcentagemNoturno;
        }
        if(validarFloat(valorMensalista) == 1){
            this.valorMensalista = valorMensalista;
        }
        if(validarFloat(valorEvento) == 1){
            this.valorEvento = valorEvento;
        }
        if(validarInt(porcentagemRetorno)==1) {
        	this.porcentagemRetorno = porcentagemRetorno;
        }

    }
	public float getPorcentagemRetorno() {
			return porcentagemRetorno;
		}
	
		public void setPorcentagemRetorno(int porcentagemRetorno) {
			this.porcentagemRetorno = porcentagemRetorno;
		}
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        if(validarInt(capacidade) == 1){
            this.capacidade = capacidade;
        }
    }
    public float getValorFracao() {
        return valorFracao;
    }
    public void setValorFracao(float valorFracao) {
    		public int getValorNoturno() {
		return valorNoturno;
	}
	public void setValorNoturno(int valorNoturno) {
		this.valorNoturno = valorNoturno;
	}
        if(validarFloat(valorFracao) == 1) {
            this.valorFracao = valorFracao;
        }
    }
    public int getPorcentagemHoraCheia() {
        return porcentagemHoraCheia;
    }
    public void setPorcentagemHoraCheia(int porcentagemHoraCheia) {
        if(validarInt(porcentagemHoraCheia) == 1) {
            this.porcentagemHoraCheia = porcentagemHoraCheia;
        }
    }
    public float getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(float valorDiaria) {
        if(validarFloat(valorDiaria) == 1) {
            this.valorDiaria = valorDiaria;
        }

    }
    public int getPorcentagemNoturno() {
        return porcentagemNoturno;
    }
    public void setPorcentagemNoturno(int porcentagemNoturno) {
        if(validarInt(porcentagemNoturno) == 1) {
            this.porcentagemNoturno = porcentagemNoturno;
        }
    }
    public float getValorMensalista() {
        return valorMensalista;
    }

    public void setValorMensalista(float valorMesalista) {
        if(validarFloat(valorMesalista) == 1){
            this.valorMensalista = valorMesalista;
        }

    }

    public float getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(float valorEvento) {
        if(validarFloat(valorEvento) == 1){
            this.valorEvento = valorEvento;
        }
    }

    public int getValorNoturno() {
		return valorNoturno;
	}
	public void setValorNoturno(int valorNoturno) {
		this.valorNoturno = valorNoturno;
	}


    // funções
    public int validarInt(int numero){
        int i;
        if(numero < 0 ){
            System.out.println("O campo está em branco ou é inválido");
            i = 0;
        }else{
            i = 1;
        }
        return i;
    }
    public int validarFloat(float numero){
        int i;
        if(numero < 0  ){
            System.out.println("O campo está em branco ou é inválido");
            i = 0;
        }else{
            i = 1;
        }
        return i;
    }

    public float calcularHoraCheia(){
        float x = 4*this.valorFracao - ((this.porcentagemHoraCheia*4*this.valorFracao)/100);
        return x;
    }

    public float calcularDiariaNoturna(){
        float x = ((this.porcentagemNoturno*this.valorDiaria)/100);
        return x;
    }

    void status(){
        System.out.println("Status do estacionamento ");
        System.out.println("Capacidade máxima: "+ getCapacidade());
        System.out.println("Valor fração: R$ "+ getValorFracao());
        System.out.println("Valor hora cheia: R$ "+ calcularHoraCheia());
        System.out.println("Valor diária diurna: R$ "+ getValorDiaria());
        System.out.println("Valor diária noturna: R$ "+ calcularDiariaNoturna());
        System.out.println("Valor do acesso mesalista: R$ "+ getValorMensalista());
        System.out.println("Valor do acesso evento: R$ "+ getValorEvento()+"\n");
    }
}