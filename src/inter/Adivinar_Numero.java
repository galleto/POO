package inter;

import java.util.Scanner;

public class Adivinar_Numero implements games{

	// Atributos
	private int num, lifes;
	private Scanner key;
	
	// Metodos del juego
	public  Adivinar_Numero() {
	key = new Scanner(System.in);
	}
	
	
	@Override
	public void iniciar() {
		// Inicar
		num = 1 + (int) (Math.random() * 100);		
	}

	@Override
	public void play() {
		// Jugar
		int numero;
		do {
			System.out.println(" Adivina un numero entre del 1 y el 100.......   ");
			numero = key.nextInt();
			if (num < numero)
			System.out.println("El numero a adivinadr es menor..... ");
			else if (num > numero)
		    System.out.println("El numero a adivinadr es mayor..... ");
			lifes++;
		} while (numero != num);
		
	}

	@Override
	public void end() {
		// terminar
		System.out.println("El numero era: " + num);
		System.out.println("Ganaste luego de gastar " + lifes + " vidas ");
	}

}
