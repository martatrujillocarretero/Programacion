package Graficos;

import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Color;

public class SemaforoaCalculos {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde,ambar,rojo;
		int ancho,alto,centro_x,centro_y,diametro_disco;
		
		//iniciamos los valores de dibulo del semaforo
		//esto es para sustituir a las cordenadas, ya que es mas rapido este metodo.
		ancho=100;
		alto=300;
		centro_x=100;
		centro_y=300;
		diametro_disco=ancho/2;
		
		
		caja = new Rectangle(centro_x-ancho/2, centro_y-alto/2,ancho,alto);
		caja.setColor(Color.BLACK);
		caja.draw();
		caja.fill();
		
		palo = new Rectangle(centro_x-(ancho/5)/2,centro_y+alto/2,ancho/5,alto);
		palo.draw();		
		palo.fill();
		
		verde = new Ellipse(centro_x-diametro_disco/2,centro_y+diametro_disco*1.5,diametro_disco,diametro_disco);
		verde.setColor(Color.GREEN);
		verde.draw();
		verde.fill();
		
		ambar = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco*0.5,diametro_disco,diametro_disco);
		ambar.setColor(Color.ORANGE); //Para crear un color utilizamos esta expresion: (new Color(0,200,0));
		ambar.draw();
		ambar.fill();
		
		rojo = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco*2.5,diametro_disco,diametro_disco);
		rojo.setColor(Color.RED);
		rojo.draw();
		rojo.fill();
		
		
		
		
		
		
		
		

	}

}
