package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float base,altura;
		float perimetro;
		float area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe primero la base y luego la altura del rect�ngulo: ");
		base=teclado.nextFloat();
		altura=teclado.nextFloat();
		
		perimetro = 2*(base+altura);
		area = base*altura;
		
		System.out.println("La base es " + base);
		System.out.println("La altura es " + altura);
		System.out.println("El per�metro es " + perimetro);
		System.out.println("El �rea es "+ area);
		
		teclado.close();
		
	}

}
