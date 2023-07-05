package recursos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Testes dos estacionamentos
		Estacionamento1();
		Estacionamento2();
		Estacionamento3();
		
		
		Scanner scanner = new Scanner(System.in);

		//Obtendo o número de estacionamentos a serem criados
		System.out.print("===================================================\n \n \n");
		System.out.print("Digite o número de estacionamentos a serem criados:");
		System.out.print("\n \n \n===================================================\n");
		int numEstacionamentos = scanner.nextInt();

		//Hora de criar uma array para armazenar os estacionamentos:
		Estacionamento[] estacionamentos = new Estacionamento[numEstacionamentos];

		// Inserir sobre o número de estacionamentos e permitindo que o usuário insira os dados para cada um:
		for (int i = 0; i < numEstacionamentos; i++){
			System.out.print("===================================================\n\n\n");
			System.out.println("Estacionamento " + (i + 1));

			//Obtendo os dados do estacionamento
			System.out.println("Qual a capacidade máxima do estacionamento?");
			int capTotal = scanner.nextInt();

			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n\n\n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual será o valor fração do acesso?");
			int valFrac = scanner.nextInt();

			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual será a porcentagem do acesso hora cheia?");
			int porcentHC = scanner.nextInt();

			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual será o valor da diária?");
			int valDiaria = scanner.nextInt();

			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual será a porcentagem do acesso noturno?");
			int porcentNot = scanner.nextInt();

			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual será o valor do acesso mensalista?");
			int valMensalista = scanner.nextInt();

			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual será o valor do acesso evento?");
			int valEvento = scanner.nextInt();
			
			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual será a porcentagem do retorno");
			int porcentRetorno = scanner.nextInt();

			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual o hora em que o estacionamento abre?");
			int horaInicio = scanner.nextInt();

			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			System.out.println("Qual o hora em que o estacionamento fecha?");
			int horaFecha = scanner.nextInt();

			//Criando o objeto Estacionamento com os dados inseridos:
			Estacionamento estacionamento = new Estacionamento(capTotal, valFrac, porcentHC, valDiaria, porcentNot, valMensalista, valEvento, porcentRetorno, horaInicio, horaFecha);

			//Hora de armazenar o estacionamento no array:
			estacionamentos[i] = estacionamento;
			}
		
		System.out.print("===================================================\n \n \n");
		
		//Hora de exibir o status de cada estacionamento:
		for (int i = 1; i < numEstacionamentos; i++){
			Estacionamento estacionamentoFinal = estacionamentos[i];
			System.out.println("Status do Estacionamento " + (i + i));
			estacionamentoFinal.status();
			System.out.println();
		}
		scanner.close();
		
	}
	static void Estacionamento1(){
		//Cadastrando
		Cadastro c1 = new Cadastro();
		c1.setPlaca("POOP-2023");
		c1.setEstacionamento(1);
		c1.status();
		
		
		Cadastro c2 = new Cadastro();
		c2.setPlaca("JAVA-2021");
		c2.setEstacionamento(1);
		c2.status();
		
		Cadastro c3 = new Cadastro();
		c3.setPlaca("JJUU-3699");
		c3.setEstacionamento(1);
		c3.status();
		
		//Exemplo do GitHub
		Cadastro c4 = new Cadastro();
		c4.setPlaca("AC50M");
		c4.setEstacionamento(1);
		c4.status();
		
		Cadastro c5 = new Cadastro();
		c5.setPlaca("RM3A9");
		c5.setEstacionamento(1);
		c5.status();
		
		System.out.print("===================================================\n \n \n");
		
		
		//Inicializando o estacionamento 1
		Estacionamento e1 = new Estacionamento(300,30, 15 , 120 , 45, 600, 50, 50, 06, 22);
		e1.status();
		
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
	
static void Estacionamento2(){
	//Cadastrando
	Cadastro c1 = new Cadastro();
	c1.setPlaca("POOP-2023");
	c1.setEstacionamento(2);
	c1.status();
	
	
	Cadastro c2 = new Cadastro();
	c2.setPlaca("JAVA-2021");
	c2.setEstacionamento(2);
	c2.status();
	
	Cadastro c3 = new Cadastro();
	c3.setPlaca("JJUU-3699");
	c3.setEstacionamento(2);
	c3.status();
	
	//Exemplo do GitHub
	Cadastro c4 = new Cadastro();
	c4.setPlaca("HI139");
	c4.setEstacionamento(2);
	c4.status();
	
	
	Cadastro c5 = new Cadastro();
	c5.setPlaca("AC50M");
	c5.setEstacionamento(2);
	c5.status();
	
	System.out.print("===================================================\n \n \n");
	
	
	
	//Incicioanliznado o estacionamento 2
	Estacionamento e2 = new Estacionamento(120, 20, 10 , 70 , 30, 455, 60, 60, 0, 24);
	e2.status();
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
	static void Estacionamento3(){
		//Cadastrando
		Cadastro c1 = new Cadastro();
		c1.setPlaca("POOP-2023");
		c1.setEstacionamento(3);
		c1.status();
		
		
		Cadastro c2 = new Cadastro();
		c2.setPlaca("JAVA-2021");
		c2.setEstacionamento(3);
		c2.status();
		
		Cadastro c3 = new Cadastro();
		c3.setPlaca("JJUU-3699");
		c3.setEstacionamento(3);
		c3.status();
		
		System.out.print("===================================================\n \n \n");
		
		//Incicioanliznado o estacionamento 3
		Estacionamento e3 = new Estacionamento(600, 10, 0 , 50 , 40, 350, 40, 70, 06, 22);
		e3.status();
		
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