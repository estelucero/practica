package practica3Progra2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaRobot {
	Robot r=new Robot();
	
	@Test
	public void avanzarT() {
		assertTrue(r.avanzar(2));
	}
	@Test
	public void avanzarT1() {
		assertTrue(r.avanzar());
	}
	@Test
	public void avanzarF1() {
		r.avanzar();
		r.girarL();
		r.girarL();
		r.avanzar();
		assertFalse(r.avanzar());
	}

}
