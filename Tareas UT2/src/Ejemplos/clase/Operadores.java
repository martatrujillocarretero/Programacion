package Ejemplos.clase;
import java.util.Scanner;
public class Operadores {

	public static void main(String[] args) {
		
				int X;
				int x;
				double Y;
				boolean variable;
				
				variable = 5 > (4 + 2);
				
				
				variable = true;
						
				
			boolean se_congela;
			
			Scanner teclado = new Scanner (System.in);
			
			System.out.print("Dame la temperatura del agua: ");
			if (teclado.nextInt()<=0) se_congela=true;
			else se_congela=false; System.out.println("Pon el aire acondicionado");
		
			if (se_congela) System.out.println("Pon la calefacción");
			
			
			
			
			//Empieza el otro ejercicio
		X=2+2*6;
		
		x=(34+4/3)+5;
		
		Y=X^3;
		
			//X++ incrementa 1
			//X=X+1 ariba y abajo las otras formas de hacerlo
			//++X incrementa 1
		
	 //Y=X++ le asigna la Y te lo incrementa

		System.out.println("Resultado de 5 > (4 + 2)" + variable);
		System.out.print("\nEl resultado es: " + X);
		System.out.print("\nEl resultado es: " + x);
		System.out.print("\nEl resultado es" + Y);
		
	}

}
