/* 
 * @ autor: Gael Guerrero
 * @ version: 7.10.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 */    
package figuras;
    public class E4_01_AreasYPerimetros {
    public static void main(String[] args) {
        Cuadrado cube = new Cuadrado(9);
        Rectangulo rect = new Rectangulo(8, 3);
        Triangulo tri = new Triangulo(5, 4, 5, 6); // base, altura, lado1, lado2
        Rombo rom = new Rombo(6, 5, 3); // lado, diagonal mayor, diagonal menor
        Romboide boide = new Romboide(3, 6, 4); // base, altura, lado oblicuo
        Trapecio trap = new Trapecio(4, 6, 5, 5, 4); // base menor, mayor, lado1, lado2, altura
        Ciruculo cir = new Ciruculo(5);
        Poligono poli = new Poligono(4, 6, 5); // lado, numLados, apotema

        cube.mostrarDatos();
        System.out.println("\n" + "=".repeat(40) + "\n");

        rect.mostrarDatos();
        System.out.println("\n" + "=".repeat(40) + "\n");

        tri.mostrarDatos();
        System.out.println("\n" + "=".repeat(40) + "\n");

        rom.mostrarDatos();
        System.out.println("\n" + "=".repeat(40) + "\n");

        boide.mostrarDatos();
        System.out.println("\n" + "=".repeat(40) + "\n");

        trap.mostrarDatos();
        System.out.println("\n" + "=".repeat(40) + "\n");

        cir.mostrarDatos();
        System.out.println("\n" + "=".repeat(40) + "\n");

        poli.mostrarDatos();
        System.out.println("\n" + "=".repeat(40) + "\n");
    }
}