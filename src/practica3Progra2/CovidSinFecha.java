package practica3Progra2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CovidSinFecha {
	private HashMap<String,PersonaCovidSinFecha> lista;
	private Integer Maxdosis;
	private Map<Integer,String> esquemas;
	public CovidSinFecha() {
		this.lista=new HashMap<String,PersonaCovidSinFecha>();
		this.esquemas= this.esquemaVacunacion();
		this.Maxdosis=this.esquemas.size();
		
		
	}
	
	public boolean agregarPersona(PersonaCovidSinFecha persona) {
		if(this.personaExiste(persona.getDni())) {
			return false;
		}
		this.lista.put(persona.getDni(), persona);
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
		return this.Maxdosis>dosis?true:false;
	}
	public Integer ultimaDosis(String dni) {
		return this.lista.get(dni).getUltimaDosis();
	}
	
	public String esquemaVacunacion(String dni) {
		return this.esquemas.get(this.ultimaDosis(dni));
		
	}
	
	public Map<Integer,String> esquemaVacunacion(){
		Map salida=new HashMap<Integer,String>();
		salida.put(0, "No inició la vacunación");
		salida.put(1, "Esquema de vacunación incompleto");
		salida.put(2, "Esquema de vacunación completo" );
		salida.put(3, "Primer refuerzo");
		salida.put(4, "Segundo refuerzo");
		return salida;
	}
	
	
}
