package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double tamaño,velocidad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Cual es el tamaño del archivo (Mbytes)? ");
		tamaño=teclado.nextDouble();
		System.out.print("¿Cual es la velocidad de tu linea (Mbps)? " );
		velocidad=teclado.nextDouble();
		tamaño = tamaño * 1024* 1024 * 8; //= Tamaño* Math.pow(2,20) * 8
		velocidad = velocidad * 1000000;
		
		
		
		System.out.print("Datos:" + tamaño);
		System.out.print("\nVelocidad: " + velocidad + "bps"); // el palito y la n= " \n " es como un introl
		System.out.print("Tiempo para transmitir:" + tamaño/velocidad + " s ");
		
	
		teclado.close();
		
		
		
	}

}
