package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cambio
System.out.print("Hola, ¿Como te llamas?");
		
		Scanner teclado=new Scanner(System.in);
		String nombre;
		
		nombre=teclado.nextLine();
		
		System.out.print("Buenas "+nombre);
		//Si escribo ahora el nombre en la consola, ya me lo devuelve
		
		teclado.close();
		//no es necesario pero quita el aviso

	}

}
