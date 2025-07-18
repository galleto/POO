/*
 * Clase: E3_01_NominaEscuela.java
 * Clase Principal de la nomina de la escuela
 * @ autor: Gael Guerrero
 * @ version: 7.9.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package herencia;
public class E3_01_NominaEscuela {
 public static void main(String[] args) {
     // Crear instancias del personal
     PersonalAdministrativo perAdmin = new PersonalAdministrativo(
         "Adrian", "González", 21, 29, 1);
     
     PersonalDeLimpieza perLimpieza = new PersonalDeLimpieza(
         "María", "López", 23, 28, 2);
     
     MaestroTiempoCompleto maestroTC = new MaestroTiempoCompleto(
         "Carlos", "Martínez", 35, 5);
     
     MaestroMedioTiempo maestroMT = new MaestroMedioTiempo(
         "Ana", "Rodríguez", 28, 3);
     
     MaestroPorHora maestroPH = new MaestroPorHora(
         "Luis", "Fernández", 30, 25, 2);

     // Mostrar información de cada empleado
     perAdmin.mostrarDatos();
     System.out.println("\n" + "=".repeat(40) + "\n");
     
     perLimpieza.mostrarDatos();
     System.out.println("\n" + "=".repeat(40) + "\n");
     
     maestroTC.mostrarDatos();
     System.out.println("\n" + "=".repeat(40) + "\n");
     
     maestroMT.mostrarDatos();
     System.out.println("\n" + "=".repeat(40) + "\n");
     
     maestroPH.mostrarDatos();
     System.out.println("\n" + "=".repeat(40) + "\n");

     // Calcular nómina total
     double nominaTotal = perAdmin.calcularSueldo() + 
                        perLimpieza.calcularSueldo() + 
                        maestroTC.calcularSueldo() + 
                        maestroMT.calcularSueldo() + 
                        maestroPH.calcularSueldo();
     
     System.out.println("NÓMINA TOTAL DE LA ESCUELA: $" + nominaTotal);
 }
}
