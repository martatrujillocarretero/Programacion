package Tarea_objetos;

import java.util.Scanner;

public class Ejercicio1_objetos {
	
public static void main(String[] args) {

	//public class Alumno {
		String nombre1,nombre2,nombre3;
		int edad;

		
		Scanner teclado = new Scanner (System.in);
		nombre1= teclado.nextLine();
		System.out.println("Dame el nombre1  "+ nombre1);
		nombre2= teclado.nextLine();
		System.out.println("Dame el nombre2  "+ nombre2);
		nombre3= teclado.nextLine();
		System.out.println("Dame el nombre3  "+ nombre3);
		edad=teclado.nextInt();
		System.out.println("Dame la edad de los tres nombres:  " + edad);
	

	}

}
