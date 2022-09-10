package practica3Progra2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado {
	private String palabra;
	private Integer puntos;
	private Integer errores;
	private boolean jugando;
	private boolean gano;
	private String palabraEscondida;

	public Ahorcado(String palabra) {
		
		if (this.palabraValida(palabra)) {
			this.palabra = palabra.toLowerCase();
		}else {
			throw new RuntimeException("Error la palabra es invalida");
	}
		this.puntos = 0;
		this.errores = 0;
		this.gano = false;
		this.jugando = true;
		this.palabraEscondida = esconderPalabra(palabra);

	}

	public String esconderPalabra(String palabra) {
		String salida = "";
		for (int i = 0; i < palabra.length(); i++) {
			salida += "*";
		}
		return salida;
	}

	public void jugando() {
		Scanner input = new Scanner(System.in);

		while (this.jugando) {
			this.imprimir();

			Integer eleccion = this.ingresarOpcion();

			if (this.quiereAdivinarPalabra(eleccion)) {

				String rta = this.adivinarPalabra();
				if (this.acertoPalabra(rta)) {
					this.jugando = false;
					this.gano = true;

				} else {
					this.jugando = false;
					System.out.println(rta);
				}

			} else {

				String rta = this.adivinarLetra();
				if (this.acertoLetra(rta)) {
					this.aparecerLetra(rta);
					this.sumarPuntos();
				} else {
					System.out.println("Usted erro");
					this.restarIntento();
				}
			}
			if (this.perdio()) {
				this.jugando = false;
			}
			if (this.completoPalabra()) {
				this.jugando = false;
				this.gano = true;
			}

		}
		if (this.gano) {
			System.out.print("Felicidades!! Usted adivino la palabra");
		} else {
			System.out.println("Usted perdio la palabra era:" + this.palabra);

		}
	}

	public boolean quiereAdivinarPalabra(Integer opcion) {

		if (opcion == 1) {
			return true;
		}
		return false;

	}

	public Integer ingresarOpcion() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese una opcion:");
		System.out.println("1.Ingresar palabra");
		System.out.println("2.Ingresar una Letra");
		String opcion = input.next();
		while (!this.opcionValida(opcion)) {
			this.imprimir();
			System.out.println("Ingrese una opcion:");
			System.out.println("1.Ingresar palabra");
			System.out.println("2.Ingresar una Letra");
			opcion = input.next();
		}
		return Integer.parseInt(opcion);
	}

	public boolean opcionValida(String opcion) {
		String opcionValida = "1234567890";

		if (opcion.length() != 1) {
			return false;
		}
		if (opcionValida.indexOf(opcion.charAt(0)) == -1) {
			return false;
		}
		return true;

	}

	public String adivinarPalabra() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la palabra a adivinar: ");
		String rta = input.next();

		while (!this.palabraValida(rta)) {
			System.out.println("Ingrese la palabra a adivinar: ");
			rta = input.next();
		}
		return rta;
	}

	public boolean palabraValida(String palabra) {
		boolean acum = true;
		String caracteresInvalidos = "1234567890|°¬!#$%&/()=?\'¡¿,.-_:;{[^}]}¨´*+~";
		if (palabra.length() == 1) {
			return false;
		}

		for (int i = 0; i < caracteresInvalidos.length(); i++) {
			if (!(palabra.indexOf(caracteresInvalidos.charAt(i)) == -1)) {
				acum = acum && false;
			}
		}
		return acum;
	}

	public boolean acertoPalabra(String palabra) {

		// String palabraNueva=this.sacarUltimaLetra(palabra);
		if (this.palabra.equals(palabra)) {
			return true;
		}
		return false;
	}

	public String adivinarLetra() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la letra a adivinar: ");
		String rta = input.next();

		while (!this.letraValida(rta)) {
			System.out.println("Ingrese la letra a adivinar: ");
			rta = input.next();
		}

		return rta;
	}

	public boolean letraValida(String letra) {
		boolean acum = true;
		String caracteresInvalidos = "1234567890|°¬!#$%&/()=?\'¡¿,.-_:;{[^}]}¨´*+~";
		if (letra.length() != 1) {
			return false;
		}

		for (int i = 0; i < caracteresInvalidos.length(); i++) {
			if (!(letra.indexOf(caracteresInvalidos.charAt(i)) == -1)) {
				acum = acum && false;
			}
		}
		return acum;

	}

	public boolean acertoLetra(String letra) {

		if (this.palabra.indexOf(letra.charAt(0)) != -1 && this.palabraEscondida.indexOf(letra.charAt(0)) == -1) {
			return true;
		}
		return false;
	}

	public void aparecerLetra(String letra) {
		String nuevaPalabraEscondida = "";
		for (int i = 0; i < this.palabra.length(); i++) {
			if (this.palabra.charAt(i) == letra.charAt(0)) {
				nuevaPalabraEscondida += letra.charAt(0);
			} else {
				nuevaPalabraEscondida += this.palabraEscondida.charAt(i);
			}
		}
		this.palabraEscondida = nuevaPalabraEscondida;

	}

	public void sumarPuntos() {
		this.puntos++;
	}

	public void restarIntento() {
		this.errores++;
	}

	public boolean perdio() {
		return this.errores == 6 ? true : false;
	}

	public boolean completoPalabra() {
		return this.palabraEscondida.indexOf('*') == -1 ? true : false;
	}

	public void imprimir() {
		int intentos = 6 - this.errores;
		System.out.println(this.palabraEscondida + "            Los intentos que tiene son:" + intentos+"         Los puntos que tiene son:"+this.puntos);

	}

	public String sacarUltimaLetra(String palabra) {
		String salida = salida = "";
		for (int i = 0; i < palabra.length() - 1; i++) {
			salida += palabra.charAt(i);
		}
		return salida;
	}
}
