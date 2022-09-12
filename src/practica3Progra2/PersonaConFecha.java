package practica3Progra2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonaConFecha {
	
	private String dni;
	private String apellido;
	private String nombre;
	private Map<Integer,String> cartilla;
	private Integer ultimaDosis;
	public PersonaConFecha(String dni,String apellido,String nombre) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.ultimaDosis=0;
		this.cartilla=new HashMap<Integer,String>() ;
	}
	public Integer getUltimaDosis() {
		return this.ultimaDosis;
	}
	 boolean agregarDosis(Integer dosis,String fecha) {
		if(cartilla.containsKey(dosis)) {
			return false;
		}
		cartilla.put(dosis,fecha);
		this.ultimaDosis=dosis;
		return true;
		
	}
	 public String getDni() {
		 return this.dni;
	 }
	 public String getFecha(Integer dosis) {
		return  this.cartilla.get(dosis);
	 }
	 
	 
}
