/*
 * Clase: MainT.java
 * Clase principal para mostrar el tiempo real (real real real)
 * 
 * @ autor: Gael Guerrero
 * @ version: 7.3.25
 * @ gmail: plaguepatient@outlook.com
 * 
 * @ by galleto B)
 * 
 */
package clasesyObjetos;
// uso el java local time paa agarrar el tiempo actual del la maquina actual
import java.time.LocalTime;

	public class MainT {
	    public static void main(String[] args) {
	        // Obtener tiempo real del sistema
	        LocalTime tiempoActual = LocalTime.now();
	        int horas = tiempoActual.getHour();
	        int minutos = tiempoActual.getMinute();
	        int segundos = tiempoActual.getSecond();
	        
	        // Crear objeto tiempo actual
	        Tiempo ahorita = new Tiempo(horas, minutos, segundos);
	        System.out.println("Ahorita: " + ahorita);
	        
	        // Calcular tiempo de hace una hora (3600 segundos menos)
	        int segundosTotales = ahorita.aSegundos();
	        int segundosHaceUnaHora = segundosTotales - 3600;
	        
	        // Si el resultado es negativo, agregar 24 horas (86400 segundos)
	        if (segundosHaceUnaHora < 0) {
	            segundosHaceUnaHora += 86400;
	        }
	        
	        System.out.println("Hace una hora: " + segundosHaceUnaHora + " segundos");
	        
	        // Y otra opción haciendo lo contrario: de segundos a horas
	        System.out.println("------------------------------");
	        Tiempo tiempoConvertido = new Tiempo(segundosHaceUnaHora);
	        System.out.println(segundosHaceUnaHora + " segundos = " + tiempoConvertido);
	    }
	}
