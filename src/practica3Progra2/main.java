package practica3Progra2;

import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {
	CovidSinFecha covid=new CovidSinFecha();
	PersonaCovidSinFecha p1=new PersonaCovidSinFecha("1", "Benito", "Jaun");
	covid.agregarPersona(p1);
	System.out.println(covid.esquemaVacunacion("1"));
	System.out.println(covid.agregarVacuna("1", 1));
	System.out.println(covid.esquemaVacunacion("1"));
	System.out.println(covid.agregarVacuna("1", 2));
	System.out.println(covid.esquemaVacunacion("1"));
	System.out.println(covid.agregarVacuna("1", 3));
	System.out.println(covid.esquemaVacunacion("1"));
	System.out.println(covid.agregarVacuna("1", 4));
	System.out.println(covid.esquemaVacunacion("1"));
	System.out.println(covid.agregarVacuna("1", 5));
	System.out.println(covid.esquemaVacunacion("1"));
	}

}
