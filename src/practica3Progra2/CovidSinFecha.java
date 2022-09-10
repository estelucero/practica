package practica3Progra2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CovidSinFecha {
	HashMap<String,PersonaCovidSinFecha> lista;
	Integer Maxdosis;
	Map<Integer,String> esquemas;
	public CovidSinFecha(HashMap<Integer,String> esquema) {
		this.lista=new HashMap<String,PersonaCovidSinFecha>();
		this.Maxdosis=esquema.size();
		this.esquemas= esquema;
		
	}
	
	public boolean agregarPersona(String dni,PersonaCovidSinFecha persona) {
		if(this.personaExiste(dni)) {
			return false;
		}
		this.lista.put(dni, persona);
		return true;
	}
	
	public boolean agregarVacuna(String dni,Integer dosis) {
		if(this.personaExiste(dni)&& this.ultimaDosis(dni)+1==dosis && this.dosisValida(dosis)) {
			this.lista.get(dni).agregarDosis(dosis);
			return true;
		}else {
			return false;
		}
	}
	public boolean personaExiste(String dni) {
		return this.lista.containsKey(dni);
	}
	public boolean dosisValida(Integer dosis) {
		return this.Maxdosis>=dosis?true:false;
	}
	public Integer ultimaDosis(String dni) {
		return this.lista.get(dni).getUltimaDosis();
	}
	
	public String esquemaVacunacion(String dni) {
		return this.esquemas.get(this.ultimaDosis(dni));
		
	}
	
	
}
