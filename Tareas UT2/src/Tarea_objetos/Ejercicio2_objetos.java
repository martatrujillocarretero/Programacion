package Tarea_objetos;

import java.util.Scanner;

public class Ejercicio2_objetos {
	
public static void main(String[] args) {

	//public class Alumno {
		String nombre1,nombre2,nombre3;
		int edad1,edad2,edad3;

		
		Scanner teclado = new Scanner (System.in);
		nombre1= teclado.nextLine();
		
		System.out.println("Dame el nombre1  "+ nombre1);
		nombre2= teclado.nextLine();
		
		System.out.println("Dame el nombre2  "+ nombre2);
		nombre3= teclado.nextLine();
		
		System.out.println("Dame el nombre3  "+ nombre3);
		
		edad1=teclado.nextInt();
		System.out.println("Dame la edad  "+ edad1);
		
		edad2= teclado.nextInt();
		System.out.println("Dame la edad  "+ edad2);
		
		edad3= teclado.nextInt();
		System.out.println("Dame la edad  "+ edad3);
	

	}

}
