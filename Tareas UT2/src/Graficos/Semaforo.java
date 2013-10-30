package Graficos;

import graphics.Canvas;
import graphics.Color;
import graphics.Rectangle;
import graphics.Ellipse;


public class Semaforo {

	public static void main(String[] args) {
		
		Canvas lienzo;
		Rectangle rectangulo;
		Ellipse circulo1;
		Ellipse circulo2;
		Ellipse circulo3;
		
		lienzo = Canvas.getInstance();
		
		rectangulo = new Rectangle(20,40,100,250);
		circulo1 = new Ellipse (50,50,50,50);
		circulo2 = new Ellipse (50,120,50,50);
		circulo3 = new Ellipse (50,190,50,50);
		
		
		rectangulo.draw();
		circulo1.draw();
		circulo2.draw();
		circulo3.draw();
		
		rectangulo.setColor(Color.BLACK);
		rectangulo.fill();
		
		circulo1.setColor(Color.YELLOW);
		circulo2.setColor(Color.RED);
		circulo3.setColor(Color.GREEN);
		circulo1.fill();
		circulo2.fill();
		circulo3.fill();
		
			
		
		

	}

}
