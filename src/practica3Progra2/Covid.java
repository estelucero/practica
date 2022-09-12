package practica3Progra2;

import java.util.HashMap;
import java.util.Map;

public class Covid {
	private HashMap<String,PersonaConFecha> lista;
	private Integer Maxdosis;
	private Map<Integer,String> esquemas;
	public Covid() {
		this.lista=new HashMap<String,PersonaConFecha>();
		this.esquemas= this.esquemaVacunacion();
		this.Maxdosis=this.esquemas.size();
		
		
	}
	
	public boolean agregarPersona(PersonaConFecha persona) {
		if(this.personaExiste(persona.getDni())) {
			return false;
		}
		this.lista.put(persona.getDni(), persona);
		return true;
	}
	
	public boolean agregarVacuna(String dni,Integer dosis,String fecha) {
		if(this.personaExiste(dni)&& this.ultimaDosis(dni)+1==dosis && this.dosisValida(dosis)) {
			this.lista.get(dni).agregarDosis(dosis,fecha);
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
	public String getFechaDosis(String dni,Integer dosis) {
		return this.lista.get(dni).getFecha(dosis);
	}
	public void cartillaVacunacion(String dni) {
		System.out.println("Dni:"+this.lista.get(dni).getDni());
		for(int i =1;i<=this.ultimaDosis(dni);i++) {
			System.out.println("Dosis:"+i+"  Fecha:"+this.getFechaDosis(dni, i));
		}
	}

}
