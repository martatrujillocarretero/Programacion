package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float tama�o,velocidad;
		double tiempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el tama�o del archivo en Mbytes y a continuaci�n la velocidad de la l�nea de datos en Mbps: ");
		tama�o=teclado.nextFloat();
		velocidad=teclado.nextFloat();
		
		tiempo = (tama�o*8)/velocidad;  //1Mbytes = 8 Mbites; Mbps = Mbites por segundo
		
		System.out.print("El tiempo que tarda en transmitir el archivo es: " + tiempo);
		
		teclado.close();
		
	}

}
