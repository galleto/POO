package inter;

public class Tester {

	public static void main(String[] args) {

		JuegoDeDados game1 = new JuegoDeDados();
		game1.iniciar();
		game1.play();
		game1.end();
		
		Adivinar_Numero game2 = new Adivinar_Numero();
		game2.iniciar();
		game2.play();
		game2.end();
		
		
	}

}
