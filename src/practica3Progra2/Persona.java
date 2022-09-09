package practica3Progra2;

public class Persona {
	private String nombre;
	private Integer numero;
	private String direccion;
	
	public Persona(String nombre,Integer numero,String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.numero=numero;
		
		
		}
		
	public String datosPersona() {
		return "Nombre:"+this.nombre+",Numero:"+this.numero+",Direccion:"+this.direccion;
	}
	public String getNombre() {
		return this.nombre;		
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	public String getDireccion() {
		return this.direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

}
