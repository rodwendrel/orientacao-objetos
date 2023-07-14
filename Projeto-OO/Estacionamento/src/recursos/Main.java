package recursos;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Estacionamento> estacionamento = new ArrayList<>();
	static ArrayList<Cadastro> cadastro = new ArrayList<>();
	
	public static void main(String[] args){
		
		
		//Testes dos estacionamentos
		try{
			Estacionamento1();
			Estacionamento2();
			Estacionamento3();
		} catch(DescricaoEmBrancoException e){
			System.out.println("Erro: " + e.getMessage());
		} catch(ValorAcessoInvalidoException e){
			System.out.println("Erro: " + e.getMessage());
		}
	
		 System.out.println("=== Cadastros dos Carros ===");
		 int quant = cadastro.size();
	     for (int i=0; i<quant; i++) {
	    	 cadastro.get(i).status();
	         System.out.println();
	        }
	     try { 	
		   cadastro.remove(1);
	      } catch (IndexOutOfBoundsException e) {
	          System.out.printf("\nErro: posição inválida (%s).",
	           e.getMessage());
	     }
	     System.out.println("Após remover: \n");
	    	int u1 = cadastro.size();
	    	for (int i=0; i<u1; i++) {
	    		cadastro.get(i).status();
	    }
	 // =====================================================
	   
		System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
	    int n = estacionamento.size();

		//System.out.println(n);
	    for (int i=0; i<n; i++) {
	    	estacionamento.get(i).status();
	    }
	    try {
	    	
	    	estacionamento.remove(0);
	      } catch (IndexOutOfBoundsException e) {
	          System.out.printf("\nErro: posição inválida (%s).",
	            e.getMessage());
	      }
	   int n1 = estacionamento.size();

	   System.out.println("Após remover: \n");
	    for (int i=0; i<n1; i++) {
	    	estacionamento.get(i).status();
	    }
	}
	
	static void Estacionamento1() throws DescricaoEmBrancoException, ValorAcessoInvalidoException{
		
		//Inicializando o estacionamento 1
		try{

			//Cadastrando
			Cadastro c1 = new Cadastro("POOP-2023", "1");
			cadastro.add(c1);
			
			Cadastro c2 = new Cadastro("JAVA-2021", "1");
			cadastro.add(c2);
			
			Cadastro c3 = new Cadastro("JJUU-3698", "1");
			cadastro.add(c3);
			//Exemplo do GitHub
			Cadastro c4 = new Cadastro("AC50M", "1");
			cadastro.add(c4);
			
			Cadastro c5 = new Cadastro("RM3A9", "1");
			cadastro.add(c5);
		
			System.out.print("===================================================\n \n \n");
		
			Estacionamento e1 = new Estacionamento("1", "23","30", "15" , "120" , "45", "600", "50", "50", "06", "22");
			e1.status();
			estacionamento.add(e1);

			System.out.print("===================================================\n \n \n");

			Noturno a1 = new Noturno();
			a1.setPlaca("RM3A9");
			a1.setHoraEntradaEstacionamento(20);
			a1.setHoraSaidaEstacionamento(07);
			a1.setMinimoEntrada(19);
			a1.setMaximoSaida(8);
			a1.status();
			
			Fracao a2 = new Fracao();
			a2.setPlaca("JJUU-3698");
			a2.setHoraEntradaEstacionamento(14);
			a2.setMinutoEntradaEstacionamento(12);
			a2.setHoraSaidaEstacionamento(16);
			a2.setMinutoSaidaEstacionamento(45);
			a2.status();
			
			Diurno a3 = new Diurno();
			a3.setPlaca("AC50M");
			a3.setHoraEntradaEstacionamento(8);
			a3.setMinutoEntradaEstacionamento(0);
			a3.setHoraSaidaEstacionamento(18);
			a3.setMinutoSaidaEstacionamento(0);
			a3.status();
			
			Mensalista a4 = new Mensalista();
			a4.setPlaca("JAVA-2021");
			a4.setHoraEntradaEstacionamento(14);
			a4.setMinutoEntradaEstacionamento(11);
			a4.setHoraSaidaEstacionamento(16);
			a4.setMinutoSaidaEstacionamento(14);
			a4.status();
			
			Evento a5 = new Evento();
			a5.setPlaca("JJUU-3698");
			a5.setNomeEvento("Aniversário Bibia");
			a5.setHoraEntradaEstacionamento(14);
			a5.setMinutoEntradaEstacionamento(0);
			a5.setHoraSaidaEstacionamento(16);
			a5.setMinutoSaidaEstacionamento(0);
			a5.status();
			
			HoraCheia a6 = new HoraCheia();
			a6.setPlaca("JJUU-3698");
			a6.setHoraEntradaEstacionamento(14);
			a6.setMinutoEntradaEstacionamento(0);
			a6.setHoraSaidaEstacionamento(16);
			a6.setMinutoSaidaEstacionamento(0);
			a6.status();
			System.out.print("===================================================\n \n \n");

			//Verificando o caixa
			e1.statusCaixa();
			System.out.print("===================================================\n \n \n");
		} catch(DescricaoEmBrancoException e){
			System.out.println("Erro: " + e.getMessage());
		}

	}
	
static void Estacionamento2() throws DescricaoEmBrancoException, ValorAcessoInvalidoException{
	
	//Incicioanliznado o estacionamento 2
	try{

		//Cadastrando
		Cadastro c1 = new Cadastro("POOP-2023", "2");

		cadastro.add(c1);
		
		Cadastro c2 = new Cadastro("JAVA-2021", "2");
		cadastro.add(c2);
		
		Cadastro c3 = new Cadastro("JJUU-3698", "2");
		cadastro.add(c3);
		
		//Exemplo do GitHub
		Cadastro c4 = new Cadastro("HI139", "2");
		cadastro.add(c4);
		
		Cadastro c5 = new Cadastro("AC50M", "2");
		cadastro.add(c5);
	
		System.out.print("===================================================\n \n \n");

		Estacionamento e2 = new Estacionamento("2", "120", "20", "10" , "70" , "30", "455", "60", "60", "0", "24");
		e2.status();
		estacionamento.add(e2);

		System.out.print("===================================================\n \n \n");
	
		Noturno a1 = new Noturno();
		a1.setPlaca("POOP-2023");
		a1.setHoraEntradaEstacionamento(23);
		a1.setHoraSaidaEstacionamento(05);
		a1.setMinimoEntrada(22);
		a1.setMaximoSaida(7);
		a1.status();
		
		Fracao a2 = new Fracao();
		a2.setPlaca("JJUU-3699");
		a2.setHoraEntradaEstacionamento(14);
		a2.setMinutoEntradaEstacionamento(12);
		a2.setHoraSaidaEstacionamento(16);
		a2.setMinutoSaidaEstacionamento(45);
		a2.status();
		
		Diurno a3 = new Diurno();
		a3.setPlaca("AC50M");
		a3.setHoraEntradaEstacionamento(8);
		a3.setMinutoEntradaEstacionamento(0);
		a3.setHoraSaidaEstacionamento(18);
		a3.setMinutoSaidaEstacionamento(0);
		a3.status();

		Mensalista a4 = new Mensalista();
		a4.setPlaca("JAVA-2021");
		a4.setHoraEntradaEstacionamento(14);
		a4.setMinutoEntradaEstacionamento(11);
		a4.setHoraSaidaEstacionamento(16);
		a4.setMinutoSaidaEstacionamento(14);
		a4.status();
		
		Evento a5 = new Evento();
		a5.setPlaca("JJUU-3699");
		a5.setNomeEvento("Amigo da Onça");
		a5.setHoraEntradaEstacionamento(14);
		a5.setMinutoEntradaEstacionamento(0);
		a5.setHoraSaidaEstacionamento(16);
		a5.setMinutoSaidaEstacionamento(0);
		a5.status();
		
		HoraCheia a6 = new HoraCheia();
		a6.setPlaca("HI139");
		a6.setHoraEntradaEstacionamento(8);
		a6.setMinutoEntradaEstacionamento(30);
		a6.setHoraSaidaEstacionamento(9);
		a6.setMinutoSaidaEstacionamento(30);
		a6.status();

		System.out.print("===================================================\n \n \n");
		
		//Verificando o caixa
		e2.statusCaixa();
		System.out.print("===================================================\n \n \n");
		} catch(DescricaoEmBrancoException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	static void Estacionamento3() throws DescricaoEmBrancoException, ValorAcessoInvalidoException{
		
		//Incicioanlizando o estacionamento 3
		try{

			//Cadastrando
			Cadastro c1 = new Cadastro("POOP-2023", "3");
			cadastro.add(c1);
		
			Cadastro c2 = new Cadastro("JAVA-2021", "3");
			cadastro.add(c2);
			
			Cadastro c3 = new Cadastro("JJUU-3698", "3");
			cadastro.add(c3);
		
			System.out.print("===================================================\n \n \n");
			
			Estacionamento e3 = new Estacionamento("3", "600", "10", "0" , "50" , "40", "350", "40", "70", "06", "22");
			e3.status();
			estacionamento.add(e3);

			System.out.print("===================================================\n \n \n");

			Noturno a1 = new Noturno();
			a1.setPlaca("POOP-2023");
			a1.setHoraEntradaEstacionamento(20);
			a1.setHoraSaidaEstacionamento(05);
			a1.setMinimoEntrada(20);
			a1.setMaximoSaida(8);
			a1.status();
			
			Fracao a2 = new Fracao();
			a2.setPlaca("JJUU-3699");
			a2.setHoraEntradaEstacionamento(14);
			a2.setMinutoEntradaEstacionamento(12);
			a2.setHoraSaidaEstacionamento(16);
			a2.setMinutoSaidaEstacionamento(45);
			a2.status();
			
			Diurno a3 = new Diurno();
			a3.setPlaca("POOP-2023");
			a3.setHoraEntradaEstacionamento(9);
			a3.setMinutoEntradaEstacionamento(9);
			a3.setHoraSaidaEstacionamento(18);
			a3.setMinutoSaidaEstacionamento(17);
			a3.status();
			
			Mensalista a4 = new Mensalista();
			a4.setPlaca("JAVA-2021");
			a4.setHoraEntradaEstacionamento(14);
			a4.setMinutoEntradaEstacionamento(11);
			a4.setHoraSaidaEstacionamento(16);
			a4.setMinutoSaidaEstacionamento(14);
			a4.status();
			
			Evento a5 = new Evento();
			a5.setPlaca("JJUU-3699");
			a5.setNomeEvento("Bingo");
			a5.setHoraEntradaEstacionamento(14);
			a5.setMinutoEntradaEstacionamento(0);
			a5.setHoraSaidaEstacionamento(16);
			a5.setMinutoSaidaEstacionamento(0);
			a5.status();
			
			HoraCheia a6 = new HoraCheia();
			a6.setPlaca("JJUU-3699");
			a6.setHoraEntradaEstacionamento(14);
			a6.setMinutoEntradaEstacionamento(0);
			a6.setHoraSaidaEstacionamento(16);
			a6.setMinutoSaidaEstacionamento(0);
			a6.status();

			System.out.print("===================================================\n \n \n");
			//Verificando o caixa
			e3.statusCaixa();
		} catch(DescricaoEmBrancoException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}

	
	
}