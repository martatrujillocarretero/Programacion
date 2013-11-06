package Graficos;

import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Color;

public class Semaforo_P {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde,ambar,rojo;
		
		caja = new Rectangle(10,10,60,110);
		caja.draw();
		
		palo = new Rectangle(30,120,5,100);
		palo.draw();		
		palo.fill();
		
		verde = new Ellipse(45,80,20,20);
		verde.setColor(Color.GREEN);
		verde.draw();
		verde.fill();
		
		ambar = new Ellipse(45,60,20,20);
		ambar.setColor(Color.ORANGE); //Para crear un color utilizamos esta expresion: (new Color(0,200,0));
		ambar.draw();
		ambar.fill();
		
		rojo = new Ellipse(45,40,20,20);
		rojo.setColor(Color.RED);
		rojo.draw();
		rojo.fill();
		
		
		
		
		
		
		
		

	}

}
