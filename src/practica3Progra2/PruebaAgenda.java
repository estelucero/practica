package practica3Progra2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaAgenda {
	Agenda agenda= new Agenda();
	Persona p1=new Persona("Juan",11554235,"Piclomayo");
	Persona p2=new Persona("Juan",11554235,"Piclomayo");
	Persona p3=new Persona("Perez",1152235,"Muñoz");
	
	@Test
	public void agregarT() {
		
		assertTrue(this.agenda.agregar("1",p1));
		
	}
	@Test
	public void agregarF() {
		this.agenda.agregar("1", p1);
		assertFalse(this.agenda.agregar("1",p1));
		
	}
	
	@Test
	public void eliminarV() {
		this.agenda.agregar("1", p1);
		assertTrue(this.agenda.eliminar("1"));
		
	}
	@Test
	public void eliminarF() {
		this.agenda.agregar("1", p1);
		assertFalse(this.agenda.eliminar("2"));
		
	}
	@Test
	public void eliminarF2() {
		
		assertFalse(this.agenda.eliminar("2"));
		
	}
	@Test
	public void devolverAgendaT() {
		this.agenda.agregar("1", p1);
		assertEquals("[DNI:" + "1" + "," + "Nombre:"+p1.getNombre()+",Numero:"+p1.getNumero()+",Direccion:"+p1.getDireccion() + "]",agenda.devolverDatos("1"));
		
	}
	

}
