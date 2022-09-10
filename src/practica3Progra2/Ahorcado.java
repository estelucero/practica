package practica3Progra2;

import java.util.ArrayList;

public class Ahorcado {
	private String palabra;
	private Integer puntos;
	private Integer errores;
	private boolean jugando;
	private boolean gano;
	private String palabraEscondida;
	
	
	public Ahorcado(String palabra) {
		this.palabra=palabra;
		this.puntos=0;
		this.errores=0;
		this.gano=false;
		this.jugando=false;
		this.palabraEscondida=esconderPalabra(palabra);
		
	}
	public String esconderPalabra(String palabra){
		String salida="";
		for(int i =0;i<palabra.length();i++) {
			salida+="*";
		}
	return salida;}
	
	public void adivinar(char letra) {
		Scanner input= new Scanner()
	}
}
