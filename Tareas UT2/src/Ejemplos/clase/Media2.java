package Ejemplos.clase;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numero1,numero2;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		
		//podemos ver en las tablas que es float (p�gina 509 del libro en Espa�ol)
		//la f es para que en float funcione los decimales
		
		System.out.print("Dame los dos n�meros: ");
		numero1=teclado.nextFloat();
		numero2=teclado.nextFloat();

		media = (numero1+numero2)/2;
		
		System.out.println("N�mero 1 " + numero1);
		System.out.println("N�mero 2 " + numero2);
		System.out.println("Media " + media);

		//cerrar el teclado no ser�a necesario, pero evita que salga un aviso
		teclado.close();
		
	}

}
