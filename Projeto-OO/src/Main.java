import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	public void registrarEstacionamento() {
		
			Estacionamento e1 = new Estacionamento();
		 	Scanner ler = new Scanner(System.in);
		 	int i;
		 	
		
		 	System.out.println("Digite a quantidade máxima do estacionamento: ");
	        int valorCapacidade = ler.nextInt();
	        i = e1.validarInt(valorCapacidade);
	        e1.setCapacidade(valorCapacidade, i);

	        System.out.println("Digite o valor do acesso fração do estacionamento: ");
	        float valorFracao = ler.nextFloat();
	        i = e1.validarFloat(valorFracao);
	        e1.setValorFracao(valorFracao, i);

	        System.out.println("Digite o valor da porcentagem da hora cheia do estacionamento: ");
	        int valorHoraCheia= ler.nextInt();
	        i = e1.validarInt(valorHoraCheia);
	        e1.setPocentagemHoraCheia(valorHoraCheia, i);

	        System.out.println("Digite o valor da porcentagem da diária noturna do estacionamento: ");
	        int valorNoturno= ler.nextInt();
	        i = e1.validarInt(valorNoturno);
	        e1.setPorcentagemNoturno(valorNoturno, i);

	        System.out.println("Digite o valor da diária diurna do estacionamento: ");
	        float valorDiaria = ler.nextFloat();
	        i = e1.validarFloat(valorDiaria);
	        e1.setValorDiaria(valorDiaria, i);

	        System.out.println("Digite o valor da acesso evento do estacionamento: ");
	        float valorEvento = ler.nextFloat();
	        i = e1.validarFloat(valorEvento);
	        e1.setValorEvento(valorEvento, i);

	        System.out.println("Digite o valor da acesso mensalista do estacionamento: ");
	        float valorMensalista= ler.nextFloat();
	        i = e1.validarFloat(valorMensalista);
	        e1.setValorEvento(valorMensalista, i);
	        
	        e1.status();
	        ler.close();
	}	
	
	public static void registrarAcesso() {
		
		Acesso a1 = new Acesso();
		Scanner ler = new Scanner(System.in);
	 	int i;
		
		System.out.println("Vamos comecar com seu registro.");
        
        System.out.println("Digite sua placa:");
        String placa = ler.nextLine();
        a1.setPlaca(placa);
        
        System.out.println("Digita um número aí pfv!");
        int a = ler.nextInt();
        
        a1.status();
        ler.close();
	}
	
	public static void tiposAcessos() {
		
		TipoAcesso tp1 = new TipoAcesso();
		Scanner ler = new Scanner(System.in);
	 	int i;
		
		System.out.println("Digite o tipo de acesso: \n" + "1 - Acesso hora cheia \n" + "2 - Acesso diária diurna \n" + "3 - Acesso diária noturna \n" + "4 - Acesso Mensalista \n" + "5 - Acesso Evento \n");
        int Acesso = ler.nextInt();
        tp1.setDescricao(Acesso);
        
        tp1.status();
        ler.close();
	}
	
    public static void main(String[] args) {
  
//        Scanner ler = new Scanner(System.in);
       
//        tiposAcessos();
        registrarAcesso();
        
//        try 
//        {
//       
//        } 
//        catch(NoSuchElementException e)
//        {
//
//        }
        
             
    }
}