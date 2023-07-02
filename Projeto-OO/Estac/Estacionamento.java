
public class Estacionamento {

    private int capacidade;
    private float  valorFracao;
    private int pocentagemHoraCheia;
    private float valorDiaria;
    private int porcentagemNoturno;
    

    //private float horaCheia;

    private float valorMesalista;

    private float valorEvento;

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade, int i) {
        if(i == 1){
            this.capacidade = capacidade;
        }
    }
    public float getValorFracao() {
        return valorFracao;
    }
    public void setValorFracao(float valorFracao, int i) {
        if(i == 1) {
            this.valorFracao = valorFracao;
        }
    }
    public int getPocentagemHoraCheia() {
        return pocentagemHoraCheia;
    }
    public void setPocentagemHoraCheia(int pocentagemHoraCheia, int i) {
        if(i == 1) {
            this.pocentagemHoraCheia = pocentagemHoraCheia;
        }
    }
    public float getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(float valorDiaria, int i) {
        if(i == 1) {
            this.valorDiaria = valorDiaria;
        }

    }
    public int getPorcentagemNoturno() {
        return porcentagemNoturno;
    }
    public void setPorcentagemNoturno(int porcentagemNoturno, int i) {
        if(i == 1) {
            this.porcentagemNoturno = porcentagemNoturno;
        }
    }
    public float getValorMesalista() {
        return valorMesalista;
    }

    public void setValorMesalista(float valorMesalista, int i) {
        if(i == 1){
            this.valorMesalista = valorMesalista;
        }

    }

    public float getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(float valorEvento, int i) {
        if(i == 1){
            this.valorEvento = valorEvento;
        }
    }

    // funções
    public int validarInt(int numero){
        int i;
        if(numero < 0 || numero == 00 ){
            System.out.println("O campo está em branco ou é inválido");
            i = 0;
        }else{
            i = 1;
        }
        return i;
    }
    public int validarFloat(float numero){
        int i;
        if(numero < 0 || numero == 00 ){
            System.out.println("O campo está em branco ou é inválido");
            i = 0;
        }else{
            i = 1;
        }
        return i;
    }

    public float calcularHoraCheia(){
        float x = 4*this.valorFracao - ((this.pocentagemHoraCheia*4*this.valorFracao)/100);
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
        System.out.println("Valor do acesso mesalista: R$ "+ getValorMesalista());
        System.out.println("Valor do acesso evento: R$ "+ getValorEvento());
    }
}
