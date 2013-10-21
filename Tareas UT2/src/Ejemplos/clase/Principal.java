package Ejemplos.clase;

public class Principal {

	public static void main(String[] args) {
		Clase1 objeto,objeto2,objeto3;
		
		objeto = new Clase1();
		objeto2 = new Clase1();
		objeto3 = new Clase1();
		objeto.mensaje();
		
		
		Alumno Juan,Pedro;
		
		Juan = new Alumno();
		Pedro = new Alumno();
		
		Juan.nombre="Juan";
		Pedro.nombre="Pedro";
		
		Juan.mensaje();
		Pedro.mensaje();
		
		
		}
	}

