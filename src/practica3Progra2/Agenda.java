package practica3Progra2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Agenda {

	Map<String, Persona> agenda;

	public Agenda()   {
		agenda= new HashMap<String, Persona>();
	}

	public boolean agregar(String dni, Persona persona) {
		if (agenda.containsKey(dni)) {
			return false;
		}
		agenda.put(dni, persona);
		return true;

	}

	public boolean eliminar(String dni) {
		if (agenda.containsKey(dni)) {
			agenda.remove(agenda.get(dni));
			return true;
		} else {
			return false;
		}
	}

	public boolean cambiarNombre(String dni, String nombre) {
		if (agenda.containsKey(dni)) {
			agenda.get(dni).setNombre(nombre);
			return true;
		} else {
			return false;
		}
	}

	public boolean cambiarNumero(String dni, Integer numero) {
		if (agenda.containsKey(dni)) {
			agenda.get(dni).setNumero(numero);
			return true;
		} else {
			return false;
		}
	}

	public boolean cambiarDireccion(String dni, String direccion) {
		if (agenda.containsKey(dni)) {
			agenda.get(dni).setDireccion(direccion);
			return true;
		} else {
			return false;
		}
	}

	public String devolverDatos(String dni) {
		return "[DNI:" + dni + "," + this.agenda.get(dni).datosPersona() + "]";

	}

	public void imprimir(String dni) {
		System.out.println(this.devolverDatos(dni));
	}

	public String[] devolverAgenda() {
		String[] agendaSalida = new String[this.agenda.size()];
		Integer indice = 0;
		for (String dni : this.agenda.keySet()) {
			agendaSalida[indice] = this.devolverDatos(dni);
			indice++;
		}
		return agendaSalida;
	}

	public void imprimirAgenda() {
		String[] recorrer = this.devolverAgenda();
		for (int i = 0; i < recorrer.length; i++) {
			System.out.println(recorrer[i]);

		}
	}

}
