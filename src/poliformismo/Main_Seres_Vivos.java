package poliformismo;

public class Main_Seres_Vivos {

	public static void main(String[] args) {
		Planta pla = new Planta();
		Animal_Carnivoro car = new Animal_Carnivoro();
		Animal_Hervivoro her = new Animal_Hervivoro();
		
		pla.alimentarce();
		car.alimentarce();
		her.alimentarce();
	}

}
