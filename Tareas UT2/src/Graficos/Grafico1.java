package Graficos;

import graphics.Canvas;
import graphics.Color;
import graphics.Rectangle;
//import = para importar cosas de otros paquetes

public class Grafico1 {

	public static void main(String[] args) {
		Canvas lienzo;
		Rectangle rectangulo;
		
		lienzo = Canvas.getInstance();
		//con esto nos crea una ventanita..
		
		rectangulo = new Rectangle(10,10,50,100);
		//Colocandote en los parentesis das a ctrol y espacio y te dan los metodos.
		//los numeros (10,10,50,100) son las cordinadas para que te dibuje el grafico que hemos elegido.
		
		rectangulo.draw();
		
		lienzo.pause();
		//muestra la ventana y se espera a que yo le de a aceptar.
		
		rectangulo.translate(250, 0);
		//Para que se translade el dibujo.
		
		rectangulo.setColor(Color.PINK);
		//Para poner el borde del dibujo de color
		
		rectangulo.fill();
		//Para reyenar el dibujo
		
		Color gris;
		
		gris=new Color(200,200,200);
		rectangulo.setColor(gris);
	}

}
