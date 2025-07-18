package clasesyObjetos;
import javax.swing.JOptionPane;
public class Operaciones2 {
    int a;
    int b;

    public void leerNumeros() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer número entero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo número entero"));
    }

    public String opera() {
        String resultado = "Resultados:\n";
        resultado += "Suma: " + (a + b) + "\n";
        resultado += "Resta: " + (a - b) + "\n";
        resultado += "Multiplicación: " + (a * b) + "\n";
        
        if (b != 0) {
            resultado += "División: " + ((double) a / b) + "\n";
        } else {
            resultado += "División: No se puede dividir entre cero\n";
        }

        return resultado;
    }
}