package recursos;


public class TipoAcesso {

    private String descricao;
	private int preco;

	public String getDescricao() {
		return descricao;
	}

	public int valorAcesso(){
		return preco;
	}

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
	
	void status(){
		System.out.println("Tipo de Acesso:  "+ getDescricao());
    };
	
}

