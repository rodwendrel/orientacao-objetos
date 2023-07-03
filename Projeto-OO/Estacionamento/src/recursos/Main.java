package recursos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Estacionamento e1 = new Estacionamento(300, 30, 15 , 120 , 45, 600, 50, 50);
		e1.status();
		//Estacionamento e2 = new Estacionamento(120, 20, 10 , 70 , 30, 455, 60, 60);
		//e2.status();
		//Estacionamento e3 = new Estacionamento(600, 10, 0 , 50 , 40, 350, 40, 70);
		//e3.status();
		
		HoraCheia c2 = new HoraCheia();
		c2.setHoraEntradaEstacionamento(14);
		c2.setMinutoEntradaEstacionamento(0);
		c2.setHoraSaidaEstacionamento(16);
		c2.setMinutoSaidaEstacionamento(0);
		c2.status();
		
		Noturno c1 = new Noturno();
		c1.setHoraEntradaEstacionamento(20);
		c1.setHoraSaidaEstacionamento(5);
		c1.setMinimoEntrada(19);
		c1.setMaximoSaida(7);
		//c1.status();

	



		

		
	}

	}	
	
	