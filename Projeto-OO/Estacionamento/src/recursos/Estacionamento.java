package recursos;


public class Estacionamento {

    private int capacidade;
    private static float valorFracao, valorDiaria, valorMensalista;
    private static int porcentagemHoraCheia, porcentagemNoturno;
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

    public float getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(float valorEvento) {
        if(validarFloat(valorEvento) == 1){
            this.valorEvento = valorEvento;
        }
    }

    // funções
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

    void status(){
        System.out.println("Status do estacionamento ");
        System.out.println("Capacidade máxima: "+ getCapacidade());
        System.out.println("Valor fração: R$ "+ getValorFracao());
        System.out.println("Valor diária diurna: R$ "+ getValorDiaria());
        System.out.println("Valor do acesso mesalista: R$ "+ getValorMensalista());
        System.out.println("Valor do acesso evento: R$ "+ getValorEvento()+"\n");
    }
}