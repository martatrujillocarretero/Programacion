package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radio;
		double volumen;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el radio de la esfera: ");
		radio=teclado.nextInt();
			
		volumen = (4 *Math.PI*Math.pow(radio,3)) / 3;
		
		System.out.println("El radio es " + radio);
		System.out.println("El volumen es " + volumen); //Math.roud es para que no te salga los numeros decimales
		
		
		teclado.close();

	}

}
