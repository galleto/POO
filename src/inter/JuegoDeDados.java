package inter;
import java.util.Scanner;
public class JuegoDeDados implements games{
	// Atributos
	private int d1, d2;
	private String player1, player2;
	private Scanner key;
	
	// Metodos del juego
		public  JuegoDeDados() {
			key = new Scanner(System.in);
		}
	@Override
	public void iniciar() {
		// Inicio
		System.out.println("Ingrese el nombre del 1* Jugador.....   ");
		player1 = key.nextLine();
		// >>>>>>>>>>>>>                                  <<<<<<<<<<<//
		System.out.println("Ingrese el nombre del 2* Jugador.....   ");
		player2 = key.nextLine();
	}

	@Override
	public void play() {
		// Jugar
		d1 = 1 + (int) (Math.random() * 6);
		d2 = 1 + (int) (Math.random() * 6);
		System.out.println(player1 + " Obtuvo el valor " + d1);
		System.out.println(player2 + " Obtuvo el valor " + d2);
	}

	@Override
	public void end() {
		// Terminar
		
	    if (d1 > d2) 
		System.out.println(player1 + "Gano"); 
		else if (d2 > d1) 
		System.out.println(player2 + "Gano");
		else 
		System.out.println("Empate");
		
	}
		
		
}
	