package recursos;

public class TipoAcesso {

    private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(int opcao, int i) {
		
		if(i == 1) {
			switch(opcao){
				    
				case 1 -> {
				        // Acesso por hora cheia
					this.descricao = "Hora cheia";
					
				}
			    case 2 -> {
			        //Acesso por Diaria Diurna
			    	this.descricao = "Diaria diurna";
			
			        }
			    case 3 -> {
			        // Acesso por Diaria Noturna 
			    	this.descricao = "Diaria Noturna";
			        }
			    case 4 -> {
			        // Acesso Mensalista
			    	this.descricao = "Mensalisalista";
			    }
			    
			    case 5 -> {
			        // Acesso Evento
			    	this.descricao = "Evento";
			    }
			}
		}
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

