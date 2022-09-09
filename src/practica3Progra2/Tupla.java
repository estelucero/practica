package practica3Progra2;

public class Tupla<T1,T2> {
	private T1 x;
	private T2 y;
	
	public Tupla(T1 x,T2 y) {
		this.x=x;
		this.y=y;
	}
	
	public T1 obtenerx() {
		return this.x;
		
	}
	public void establecex(T1 x) {
		this.x=x;
	}
	
	public void establecey(T2 y) {
		this.y=y;
	}
	
	public T2 obtenery() {
		return this.y;
	}
	
	public String devolverTupla() {
		return "("+this.x+","+this.y+")";
	}
}
