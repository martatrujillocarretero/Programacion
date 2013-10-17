package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_Conjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int operacion; // declaro lo que utlizo para que me diga que operacion
						// hacer

		Scanner teclado = new Scanner(System.in);

		// declaro ahora todo, porque si lo hago en cada caso, salen duplicadas
		// double es m�s preciso que float, a veces exige el programa que sea
		// double

		float base, altura;
		double perimetro;
		double area;
		float radio;
		double volumen;
		float x1, x2, y1, y2;

		System.out
				.println("Introduce el n�mero de la operaci�n que quieres realizar ");
		System.out
				.println("1. Calcular el per�metro y �rea de un rect�ngulo dada su base y su altura.");
		System.out
				.println("2. Calcular el per�metro y �rea de un c�rculo dado su radio.");
		System.out
				.println("3. Calcular el volumen de una esfera dado su radio.");
		System.out
				.println("4. Calcular el �rea de un rect�ngulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.");
		System.out
				.println("5. Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.");

		operacion = teclado.nextInt();

		switch (operacion) {

		case 1:

			System.out
					.print("Escribe primero la base y luego la altura del rect�ngulo: ");
			base = teclado.nextFloat();
			altura = teclado.nextFloat();

			perimetro = 2 * (base + altura);
			area = base * altura;

			System.out.println("La base es " + base);
			System.out.println("La altura es " + altura);
			System.out.println("El per�metro es " + perimetro);
			System.out.println("El �rea es " + area);

			teclado.close();

			break; // MUY IMPORTANTE poner siempre los breaks, si no va a
					// ejecutar automaticamente el caso siguiente

		case 2:

			System.out.print("Escribe el radio del c�rculo: ");
			radio = teclado.nextFloat();

			perimetro = 2 * Math.PI * radio;
			area = Math.PI * Math.pow(radio, 2);

			System.out.println("El radio es " + radio);
			System.out.println("El per�metro es " + perimetro);
			System.out.println("El �rea es " + area);

			teclado.close();

			break;

		case 3:

			System.out.print("Escribe el radio de la esfera: ");
			radio = teclado.nextFloat();

			volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);

			System.out.println("El radio es " + radio);
			System.out.println("El volumen es " + volumen);

			teclado.close();

			break;

		case 4:

			System.out
					.print("Escribe las coordenadas x1, x2, y1, y2 de un rect�ngulo alineado con los ejes x e y, en ese orden: ");
			x1 = teclado.nextFloat();
			x2 = teclado.nextFloat();
			y1 = teclado.nextFloat();
			y2 = teclado.nextFloat();

			base = x2 - x1;
			altura = y2 - y1;
			area = base * altura;

			System.out.println("La base es: " + base);
			System.out.println("La altura es " + altura);
			System.out.println("El �rea es " + area);

			teclado.close();

			break;

		case 5:

			float cateto1,
			cateto2;
			double hipotenusa;

			System.out
					.print("Escribe los dos catetos del tri�ngulo rect�ngulo: ");
			cateto1 = teclado.nextFloat();
			cateto2 = teclado.nextFloat();

			hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

			System.out.println("La hipotenusa es " + hipotenusa);

			teclado.close();

			break;

		default:

			System.out.println("Introduce un n�mero del 1 al 5");

			break;
		}

	}

}
