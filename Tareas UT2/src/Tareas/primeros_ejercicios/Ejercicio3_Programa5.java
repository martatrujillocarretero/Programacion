package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_Programa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float cateto1, cateto2;
		double hipotenusa;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe los dos catetos del tri�ngulo rect�ngulo: ");
		cateto1=teclado.nextFloat();
		cateto2=teclado.nextFloat();
			
		hipotenusa = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
		
		System.out.println("La hipotenusa es " + hipotenusa);
		
		teclado.close();

	}

}
