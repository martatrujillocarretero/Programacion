package Graficos;

import graphics.Canvas;
import graphics.Color;
import graphics.Rectangle;
import graphics.Ellipse;


public class coche {

	public static void main(String[] args) throws InterruptedException{
		
		Canvas lienzo;
		
		
		Rectangle rectangulo;
		Rectangle rectangulo1;
		Rectangle rectangulo2;
		Rectangle rectangulo3;
		Ellipse circulo1;
		Ellipse circulo2;
		
		lienzo = Canvas.getInstance();
		
		rectangulo = new Rectangle(40,10,90,60);
		rectangulo1 = new Rectangle(50,20,20,20);
		rectangulo2 = new Rectangle(100,20,20,20);
		rectangulo3 = new Rectangle(20,45,50,25);
		circulo1 = new Ellipse(45,60,30,30);
		circulo2 = new Ellipse(90,60,30,30);
		
		rectangulo.draw();
		rectangulo1.draw();
		rectangulo2.draw();
		rectangulo3.draw();
		circulo1.draw();
		circulo2.draw();
		
		rectangulo.setColor(Color.RED);
		rectangulo.fill();
		
		rectangulo1.setColor(Color.BLUE);
		rectangulo1.fill();
		
		rectangulo2.setColor(Color.BLUE);
		rectangulo2.fill();
		
		rectangulo3.setColor(Color.RED);
		rectangulo3.fill();
		
		circulo1.setColor(Color.BLACK);
		circulo1.fill();
		
		circulo2.setColor(Color.BLACK);
		circulo2.fill();
		
		for(int i=0;i<150; i++){
			Thread.sleep(100 / 30);
			rectangulo.translate(3f,0f);
			rectangulo1.translate(3f,0f);
			rectangulo2.translate(3f,0f);
			rectangulo3.translate(3f,0f);
			circulo1.translate(3f,0f);
			circulo2.translate(3f,0f);
			
		}

	}

}
