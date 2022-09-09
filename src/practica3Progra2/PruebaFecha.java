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
	@Test
	public void diferencia0() {
		Fecha fecha= new Fecha(2022,12,31);
		Fecha fecha1= new Fecha(2022,12,31);
		int var=fecha.diferenciaDias(fecha1);
		assertEquals(0,var);
	}
	@Test
	public void diferenciaE() {
		Fecha fecha= new Fecha(2022,12,31);
		Fecha fecha1= new Fecha(2021,12,15);
		int var=fecha.diferenciaDias(fecha1);
		assertEquals(0,var);
	}
	@Test
	public void diferenciaA1() {
		Fecha fecha= new Fecha(2022,12,31);
		Fecha fecha1= new Fecha(2023,1,4);
		int var=fecha.diferenciaDias(fecha1);
		System.out.print(var);
		assertEquals(4,var);
	}
	@Test
	public void diferenciaA2() {
		Fecha fecha= new Fecha(2022,12,31);
		Fecha fecha1= new Fecha(2023,12,31);
		int var=fecha.diferenciaDias(fecha1);
		System.out.print(var);
		assertEquals(365,var);
	}
	@Test
	public void diferenciaAB1() {
		Fecha fecha= new Fecha(2023,12,31);
		Fecha fecha1= new Fecha(2024,12,31);
		int var=fecha.diferenciaDias(fecha1);
		System.out.print(var);
		assertEquals(366,var);
	}
	@Test
	public void diferenciaAB2() {
		Fecha fecha= new Fecha(2024,1,31);
		Fecha fecha1= new Fecha(2024,3,1);
		int var=fecha.diferenciaDias(fecha1);
		System.out.print(var);
		assertEquals(30,var);
	}
	@Test
	public void diferenciaA3() {
		Fecha fecha= new Fecha(2024,1,31);
		Fecha fecha1= new Fecha(2024,3,1);
		Fecha fecha2;
		fecha2=fecha.queFechaSera(30);
		fecha2.imprimir();
		assertTrue(fecha1.comparar(fecha2));
	}
	
	
	

}
