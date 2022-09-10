package practica3Progra2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class JuegoAhorcado {
	String[] palabras;
	ArrayList<String> listaActualizable;
	boolean seguirJugando;
	Ahorcado ahorcado;
	Integer cantPalabras=2;
	public JuegoAhorcado(String[] palabras) {
		if(palabras.length==this.cantPalabras) {
			this.palabras=palabras;
		}else {
			throw new RuntimeException("Error la cantidad de palabras en al lista no es 10");
		}
		this.listaActualizable=new ArrayList<String>();
		this.seguirJugando=true;
	}
	public void empezarJuego() {
		this.reiniciar();
		while(this.seguirJugando) {
			
			int numRandom=(int)(Math.random()*this.listaActualizable.size());
			this.ahorcado=new Ahorcado(this.listaActualizable.get(numRandom));
			this.sacarDeLaLista(numRandom);
			ahorcado.jugando();
			
			
			Integer eleccion=this.ingresarOpcion();
			if(this.terminoDeJugar(eleccion)) {
				this.seguirJugando=false;
			}
			
			
			
			if(this.listaVacia()) {
				this.reiniciar();
			}
			
			
		}
		
		}
	public void sacarDeLaLista(Integer indice) {
		this.listaActualizable.remove(indice);
	}
	public boolean listaVacia() {
		return this.listaActualizable.isEmpty();
		
	}
	
	public void reiniciar() {
		for(int i =0;i<this.palabras.length;i++) {
			this.listaActualizable.add(this.palabras[i]);
		}
	}
	public Integer ingresarOpcion() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese una opcion:");
		System.out.println("1.Salir del juego");
		System.out.println("Cualquier numero.Seguir jugando");
		String opcion = input.next();
		while (!this.ahorcado.opcionValida(opcion)) {
			
			System.out.println("Ingrese una opcion:");
			System.out.println("1.Salir del juego");
			System.out.println("Cualquier numero.Seguir jugando");
			opcion = input.next();
		}
		return Integer.parseInt(opcion);
	}
	public boolean terminoDeJugar(Integer opcion) {
		if(opcion==1) {
			return true;
		}
		return false;
	}
	
	
}
