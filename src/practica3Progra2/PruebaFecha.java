package practica3Progra2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaFecha {
	Fecha fecha;
	
	@Test
	public void esBisiestoV() {
		Fecha fecha= new Fecha(2024,12,31);
		assertTrue(fecha.esBisiesto());
	}
	
	@Test
	public void esBisiestoF() {
		Fecha fecha= new Fecha(2022,12,31);
		assertFalse(fecha.esBisiesto());
	}
	
	
	

}
