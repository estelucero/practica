package practica3Progra2;

public class Robot {
	Tupla<Integer, Integer> posicion;
	Integer direccion=0;
	Integer direccionX;
	Integer direccionY;
	

	public Robot() {
		this.posicion = new Tupla<Integer, Integer>(0, 0);
		this.direccionX = -1;
		this.direccionY = -1;
		this.direccion=0;
	}

	public boolean avanzar(Integer x) {
		Integer mover = this.transformarPasos(x);
		if (estaRetrocediendo(mover)) {
			return false;
		}

		if (this.direccion == 1 || this.direccion == 3) {
			this.avanzarY(mover);

		} else {
			this.avanzarX(mover);

		}
		this.imprimir();
		return true;

	}

	public boolean avanzar() {
		Integer mover = this.transformarPasos(1);
		if (estaRetrocediendo(mover)) {
			return false;
		}

		if (this.direccion == 1 || this.direccion == 3) {
			this.avanzarY(mover);

		} else {
			this.avanzarX(mover);

		}
		this.imprimir();
		return true;

	}

	public boolean estaRetrocediendo(Integer x) {
		if (this.direccionX==-1 && (this.direccion==0 || this.direccion==2)) {
			this.direccionX=this.direccion;
			return false;
		} 
		if (this.direccionY==-1 && (this.direccion==1 || this.direccion==3)) {
			this.direccionY=this.direccion;
			return false;
		} 
		
		if(this.direccion==this.direccionX || this.direccion==this.direccionY) {
			return false;
		}
		return true;
		
	}

	public Integer transformarPasos(Integer x) {
		if (this.direccion == 2 || this.direccion == 3) {
			return x * -1;
		}
		return x;
	}

	public void avanzarX(Integer x) {
		posicion.establecex(posicion.obtenerx() + x);
		
		
	}

	public void avanzarY(Integer x) {
		posicion.establecey(posicion.obtenery() + x);
		
	}

	public String informarPosicion() {
		return this.posicion.devolverTupla();
	}

	public Integer informarDireccion() {
		return this.direccion;
	}

	public void imprimir() {
		System.out.println("Posicion:" + this.informarPosicion() + " Direccion:" + this.informarDireccion());
	}

	public void girarL() {
		if (this.direccion == 3) {
			this.direccion = 0;
		} else {
			this.direccion++;
		}
		System.out.println("Direccion:"+this.direccion);
	}

	public void girarR() {
		if (this.direccion == 0) {
			this.direccion = 3;
		} else {
			this.direccion--;
		}
		System.out.println("Direccion:"+this.direccion);
	}
}
