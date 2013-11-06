package Graficos;

import java.lang.ProcessBuilder.Redirect;

import graphics.Canvas;
import graphics.Color;
import graphics.Line;
import graphics.Rectangle;
import graphics.Text;


public class Grafica_barras {

	public static void main(String[] args) {

		Canvas lienzo;
		
		Rectangle carroceria = new Rectangle(120,300,50,200);
		//120= posicion X
		//300= posicion Y
		//50= lo que vale X (ancho)
		//200= lo que vale Y (alto)
		carroceria.setColor(Color.YELLOW);
		carroceria.draw();
		carroceria.fill();
		
		Rectangle carroceria1 = new Rectangle(250,250,80,250);
		carroceria1.setColor(Color.PINK);
		carroceria1.draw();
		carroceria1.fill();
		
		Rectangle carroceria2 = new Rectangle(390,200,50,300);
		carroceria2.setColor(Color.GREEN);
		carroceria2.draw();
		carroceria2.fill();
		
		Rectangle carroceria3 = new Rectangle(470,100,20,400);
		carroceria3.setColor(Color.RED);
		carroceria3.draw();
		carroceria3.fill();
		
		Line coordenadasY = new Line(100,75,100,500);
		coordenadasY.draw();
		
		Line coordenadasX = new Line(100,500,500,500);
		coordenadasX.draw();
		
		Text Euribor = new Text(100,50,"Euribor");
		Euribor.draw();
		
		Text Mes = new Text(500,500,"Mes");
		Mes.draw();
		
		

	}

}
