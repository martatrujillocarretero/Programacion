package Ejemplos.clase;

public class Operaciones {

	public static void main(String[] args) {
		//Math.pow = elevado a algo (^2)
		//Math.abs = Valor relativo (solo coge lo positivo [|2+65|]
		//Math.sqrt = para la raiz cuadrada
		
		//((-5)^2+10)*3
		
		System.out.println("uno: El resultado es:" + (Math.pow(-5, 2)+10)*3);
		
		
		//35.3 - 53 / 10
		
		System.out.println("dos: El resultado es:" + (35.3 - 53/10));
		
		
		//1 + 5% 1.5 + 8 / 2
		
		System.out.println("tres: El resultado es:" + (1+5%1.5*8/2));
		
		
		//-(-2^5 + 18 / 5 )
		
		System.out.println("Cuatro: El resultado es:" + (-(-Math.pow(2,5) + 18/5)));
		
		//65 / 3 / 4.0 * 3
		
		System.out.println("Cinco: El resultado es:" + (65/3/4.0*3));
		

		//44% 10 + 7 - 25^10 - 2
		
		System.out.println("Seis: El resultado es:" + (44%10+7-(Math.pow(25,10)-2)));
		
		
		//4.0 / 10.0 + 3.5 * 2
		
		System.out.println("Siete: El resultado es:" + (4.0/10.0+3.5*2) );
		
		//10% 4 + 6 / 2
		
		System.out.println("Ocho: El resultado es:" +(10%4+6/2) );
		
		//(|4 - 20 / 3| )^3
		
		System.out.println("Nueve: El resultado es:" +(Math.pow(Math.abs(4-20/3),3)));
		
		//3 * 10 / 3 + 10% 3
		
		System.out.println("Diez: El resultado es:" +(3*10/3+10%3) );
		
		// 3L^3
		
		System.out.println("Once: El resultado es:" + (Math.pow(3L,3)));
		
		//(36.0 / 4 ) + ( 5 * 3 )
		
		System.out.println("Doce: El resultado es:" + ((36.0/4)+(3*5)));
		
		// (28 / 7 ) * 2
		
		System.out.println("Trece: El resultado es:" + (28/7)*2);
		
		// (13 * 3 ) % 10
		
		System.out.println("Catorce: El resultado es:" + (13*3)%10);
		
		//2^3^3
		
		System.out.println("Quince: El resultado es:" + Math.pow(2.0,Math.pow(3,3)) );
		
		//4.5-5.0+7*3
		
		System.out.println("Dieciseis: El resultado es:" + (Math.sqrt(4.5-5.0)+7*3));
	}

}
