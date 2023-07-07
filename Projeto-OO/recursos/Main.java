package recursos;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Estacionamento> estacionamento = new ArrayList<>();
	
	public static void main(String[] args) {
		
		ArrayList<Cadastro> cadastro = new ArrayList<>();
		
		//Testes dos estacionamentos
		Estacionamento1(cadastro);
		Estacionamento2(cadastro);
		Estacionamento3(cadastro);

		 System.out.println("=== Cadastros dos Carros ===");
	        for (Cadastro c : cadastro) {
	            c.status();
	            System.out.println();
	        }
	   // try {
	    	
	    //	cadastro.remove(2);
	     // } catch (IndexOutOfBoundsException e) {
	       //   System.out.printf("\nErro: posição inválida (%s).",
	         //   e.getMessage());
	      //}
	    //int u1 = cadastro.size();
	    //for (int i=0; i<u1; i++) {
	    //	cadastro.get(i).status();
	    //}
	 // =====================================================
//		
//		System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
//	    int n = estacionamento.size();
//	    for (int i=0; i<n; i++) {
//	    	estacionamento.get(i).status();
//	    }
        System.out.println("=== Estacionamentos ===");
        for (Estacionamento e : estacionamento) {
            e.status();
            System.out.println();
        }
	    try {
	    	
	    	estacionamento.remove(2);
	      } catch (IndexOutOfBoundsException e) {
	          System.out.printf("\nErro: posição inválida (%s).",
	            e.getMessage());
	      }
	    int n1 = estacionamento.size();
	    for (int i=0; i<n1; i++) {
	    	estacionamento.get(i).status();
	    }
	}
	
	static void Estacionamento1(ArrayList<Cadastro> cadastro){

		//Cadastrando
		Cadastro c1 = new Cadastro();
		c1.setPlaca("POOP-2023");
		c1.setEstacionamento(1);
		
		Cadastro c2 = new Cadastro();
		c2.setPlaca("JAVA-2021");
		c2.setEstacionamento(1);
		
		Cadastro c3 = new Cadastro();
		c3.setPlaca("JJUU-3699");
		c3.setEstacionamento(1);
		
		//Exemplo do GitHub
		Cadastro c4 = new Cadastro();
		c4.setPlaca("AC50M");
		c4.setEstacionamento(1);
		
		Cadastro c5 = new Cadastro();
		c5.setPlaca("RM3A9");
		c5.setEstacionamento(1);

		cadastro.add(c1);
		cadastro.add(c2);
		cadastro.add(c3);
		cadastro.add(c4);
		cadastro.add(c5);
		System.out.println("A LISTAAAAA");
		System.out.println(c1);
		System.out.println("CABOU");
	
		
		System.out.print("===================================================\n \n \n");
		
		//Inicializando o estacionamento 1
		Estacionamento e1 = new Estacionamento(300,30, 15 , 120 , 45, 600, 50, 50, 06, 22);
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
		a5.setNomeEvento("Aniversário Bibia");
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
		e1.statusCaixa();
		System.out.print("===================================================\n \n \n");
	}
	
static void Estacionamento2(ArrayList<Cadastro> cadastro){
	//Cadastrando
	Cadastro c1 = new Cadastro();
	c1.setPlaca("POOP-2023");
	c1.setEstacionamento(2);
	
	Cadastro c2 = new Cadastro();
	c2.setPlaca("JAVA-2021");
	c2.setEstacionamento(2);
	
	Cadastro c3 = new Cadastro();
	c3.setPlaca("JJUU-3699");
	c3.setEstacionamento(2);
	
	//Exemplo do GitHub
	Cadastro c4 = new Cadastro();
	c4.setPlaca("HI139");
	c4.setEstacionamento(2);
	
	Cadastro c5 = new Cadastro();
	c5.setPlaca("AC50M");
	c5.setEstacionamento(2);

		cadastro.add(c1);
		cadastro.add(c2);
		cadastro.add(c3);
		cadastro.add(c4);
		cadastro.add(c5);
		System.out.println("A LISTAAAAA");
		System.out.println(c1);
		System.out.println("CABOU");
	
	System.out.print("===================================================\n \n \n");
	
	//Incicioanliznado o estacionamento 2
	Estacionamento e2 = new Estacionamento(120, 20, 10 , 70 , 30, 455, 60, 60, 0, 24);
	e2.status();
	estacionamento.add(e2);

	System.out.print("===================================================\n \n \n");
	
	Noturno a1 = new Noturno();
	a1.setPlaca("POOP-2023");
	a1.setHoraEntradaEstacionamento(20);
	a1.setHoraSaidaEstacionamento(05);
	a1.setMinimoEntrada(21);
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
}
	static void Estacionamento3(ArrayList<Cadastro> cadastro){
		//Cadastrando
		Cadastro c1 = new Cadastro();
		c1.setPlaca("POOP-2023");
		c1.setEstacionamento(3);
		
		Cadastro c2 = new Cadastro();
		c2.setPlaca("JAVA-2021");
		c2.setEstacionamento(3);
		
		Cadastro c3 = new Cadastro();
		c3.setPlaca("JJUU-3699");
		c3.setEstacionamento(3);

		cadastro.add(c1);
		cadastro.add(c2);
		cadastro.add(c3);
		
		System.out.print("===================================================\n \n \n");
		
		//Incicioanliznado o estacionamento 3
		Estacionamento e3 = new Estacionamento(600, 10, 0 , 50 , 40, 350, 40, 70, 06, 22);
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

	}

	
	
}