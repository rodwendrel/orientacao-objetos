package recursos;


import java.util.Scanner;

import recursos.Estacionamento;
import recursos.Tempo;
import recursos.TipoAcesso;

public class Main {
	
	public static void main(String[] args) {
		Estacionamento e1 = new Estacionamento(300, 30, 15 , 120 , 45, 600, 50, 50);
		e1.status();
		Estacionamento e2 = new Estacionamento(120, 20, 10 , 70 , 30, 455, 60, 60);
		e2.status();
		Estacionamento e3 = new Estacionamento(600, 10, 0 , 50 , 40, 350, 40, 70);
		e3.status();
		
		
		TipoAcesso tp1 = new TipoAcesso();
		Scanner ler = new Scanner(System.in);
	 	int i;
		
		System.out.println("Digite o tipo de acesso: \n" + "1 - Acesso hora cheia \n" + "2 - Acesso diária diurna \n" + "3 - Acesso diária noturna \n" + "4 - Acesso Mensalista \n" + "5 - Acesso Evento \n");
        int Acesso = ler.nextInt();
        i = tp1.validarInt(Acesso);
        tp1.setDescricao(Acesso, i);
        
        tp1.status();
        ler.close();
		
	}

	}	
	
	