package practica3Progra2;

import java.util.HashSet;
import java.util.Set;

public class PersonaCovidSinFecha {
	private String dni;
	private String apellido;
	private String nombre;
	private Set<Integer> cartilla;
	private Integer ultimaDosis;
	public PersonaCovidSinFecha(String dni,String apellido,String nombre) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.ultimaDosis=0;
		this.cartilla=new HashSet<Integer>() ;
	}
	public Integer getUltimaDosis() {
		return this.ultimaDosis;
	}
	 boolean agregarDosis(Integer dosis) {
		if(cartilla.contains(dosis)) {
			return false;
		}
		cartilla.add(dosis);
		this.ultimaDosis=dosis;
		return true;
		
	}
	 public String getDni() {
		 return this.dni;
	 }
}
