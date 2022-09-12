package practica3Progra2;

import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {
	Covid covid=new Covid();
	PersonaConFecha p1=new PersonaConFecha("1", "Benito", "Jaun");
	covid.agregarPersona(p1);
	System.out.println(covid.esquemaVacunacion("1"));
	System.out.println(covid.agregarVacuna("1", 1,"3/7/22"));
	System.out.println(covid.agregarVacuna("1", 2,"6/7/22"));
	System.out.println(covid.agregarVacuna("1", 3,"6/8/22"));
	System.out.println(covid.agregarVacuna("1", 4,"6/12/22"));
	System.out.println(covid.agregarVacuna("1", 5,"10/12/22"));
	System.out.println(covid.esquemaVacunacion("1"));
	
	
	covid.cartillaVacunacion("1");

	}

}
