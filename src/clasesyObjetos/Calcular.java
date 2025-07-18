package clasesyObjetos;
public class Calcular {
    public static void main(String[] args) {
        Operaciones2 op = new Operaciones2();
        op.leerNumeros();
        String resultado = op.opera();
        javax.swing.JOptionPane.showMessageDialog(null, resultado);
    }
}