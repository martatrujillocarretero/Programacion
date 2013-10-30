package Graficos;

import java.lang.ProcessBuilder.Redirect;

import graphics.Canvas;
import graphics.Color;
import graphics.Line;
import graphics.Rectangle;


public class Grafica_barras {

	public static void main(String[] args) {

		Canvas lienzo;
		
		Rectangle carroceria = new Rectangle(120,300,50,200);
		carroceria.setColor(Color.YELLOW);
		carroceria.draw();
		carroceria.fill();
		
		Rectangle carroceria1 = new Rectangle(250,250,80,250);
		carroceria1.setColor(Color.PINK);
		carroceria1.draw();
		carroceria1.fill();
		
		Rectangle carroceria2 = new Rectangle(390,200,30,300);
		carroceria2.setColor(Color.GREEN);
		carroceria2.draw();
		carroceria2.fill();
		
		Line coordenadasY = new Line(100,75,100,500);
		coordenadasY.draw();
		
		Line coordenadasX = new Line(100,500,500,500);
		coordenadasX.draw();
		
		

	}

}
