package recursos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Obtendo o número de estacionamentos a serem criados
		System.out.print("===================================================\n \n \n");
		System.out.print("Digite o número de estacionamentos a serem criados:");
		System.out.print("\n \n \n===================================================");
		int numEstacionamentos = scanner.nextInt();
		

		//Hora de criar uma array para armazenar os estacionamentos:
		Estacionamento[] estacionamentos = new Estacionamento[numEstacionamentos];

		// Inserir sobre o número de estacionamentos e permitindo que o usuário insira os dados para cada um:
		for (int i = 0; i < numEstacionamentos; i++){
			System.out.print("===================================================\n \n \n");
			System.out.println("Estacionamento " + (i + 1));

			//Obtendo os dados do estacionamento
			System.out.println("Qual a capacidade máxima do estacionamento?");
			int capTotal = scanner.nextInt();

			//Código para tentar limpar o prompt (console)
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.print("===================================================\n \n \n");
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

			//Hora de exibir o status de cada estacionamento:
			for (int u = 1; u < numEstacionamentos; u++){
				Estacionamento estacionamentoFinal = estacionamentos[i];
				System.out.println("Status do Estacionamento " + (i + i));
				estacionamentoFinal.status();
				System.out.println();
			}
		}
		
	}
	static void Estacionamento1(){
		//Cadastrando
		Cadastro c1 = new Cadastro();
		c1.setPlaca("POO-2023");
		c1.setEstacionamento(1);
		
		//Inicializando o estacionamento 1
		// Estacionamento e1 = new Estacionamento(300,30, 15 , 120 , 45, 600, 50, 50, 06, 22);
		// e1.status();

		Noturno a1 = new Noturno();
		a1.setHoraEntradaEstacionamento(20);
		a1.setHoraSaidaEstacionamento(05);
		a1.setMinimoEntrada(19);
		a1.setMaximoSaida(7);
		a1.status();
		
		Diurno a3 = new Diurno();
		a3.setHoraEntradaEstacionamento(9);
		a3.setMinutoEntradaEstacionamento(9);
		a3.setHoraSaidaEstacionamento(18);
		a3.setMinutoSaidaEstacionamento(17);
		a3.status();
		
		
		Mensalista a4 = new Mensalista();
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

		Fracao a7 = new Fracao();
		a7.setPlaca("JJUU-3699");
		a7.setHoraEntradaEstacionamento(14);
		a7.setMinutoEntradaEstacionamento(12);
		a7.setHoraSaidaEstacionamento(16);
		a7.setMinutoSaidaEstacionamento(45);
		a7.status();

		
		//Incicioanliznado o estacionamento 2
		//Estacionamento e2 = new Estacionamento(120, 20, 10 , 70 , 30, 455, 60, 60, 0, 24);
		//e2.status();
		//Estacionamento e3 = new Estacionamento(600, 10, 0 , 50 , 40, 350, 40, 70);
		//e3.status();
		
	
	
		// estacionamentoFinal.statusCaixa();
		//e1.statusCaixa();

		
	}
}
	
				