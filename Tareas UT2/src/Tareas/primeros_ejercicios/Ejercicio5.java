package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double tama�o,velocidad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("�Cual es el tama�o del archivo (Mbytes)? ");
		tama�o=teclado.nextDouble();
		System.out.print("�Cual es la velocidad de tu linea (Mbps)? " );
		velocidad=teclado.nextDouble();
		tama�o = tama�o * 1024* 1024 * 8; //= Tama�o* Math.pow(2,20) * 8
		velocidad = velocidad * 1000000;
		
		
		
		System.out.print("Datos:" + tama�o);
		System.out.print("\nVelocidad: " + velocidad + "bps"); // el palito y la n= " \n " es como un introl
		System.out.print("Tiempo para transmitir:" + tama�o/velocidad + " s ");
		
	
		teclado.close();
		
		
		
	}

}
