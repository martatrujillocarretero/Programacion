package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float peso;
		double onzas;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Número en Kg a convertir en Onzas: ");
		
		peso=teclado.nextFloat();
			
		onzas =peso*35.2739619;
		
		System.out.print("El número en onzas es: "+ onzas);
		
		teclado.close();

	}

}
