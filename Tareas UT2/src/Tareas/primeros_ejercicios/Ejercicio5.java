package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float tamaño,velocidad;
		double tiempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el tamaño del archivo en Mbytes y a continuación la velocidad de la línea de datos en Mbps: ");
		tamaño=teclado.nextFloat();
		velocidad=teclado.nextFloat();
		
		tiempo = (tamaño*8)/velocidad;  //1Mbytes = 8 Mbites; Mbps = Mbites por segundo
		
		System.out.print("El tiempo que tarda en transmitir el archivo es: " + tiempo);
		
		teclado.close();
		
	}

}
