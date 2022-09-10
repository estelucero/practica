package practica3Progra2;

import static org.junit.Assert.assertFalse;

public class main {

	public static void main(String[] args) {
	String[] palabras= {"hola","chau"};
	JuegoAhorcado juego=new JuegoAhorcado(palabras);
	juego.empezarJuego();
	}

}
