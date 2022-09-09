package practica3Progra2;

import static org.junit.Assert.assertFalse;

public class main {

	public static void main(String[] args) {
		Robot r=new Robot();
		r.girarR();
		r.avanzar();
		r.girarL();
		r.girarL();
		
		
		System.out.println(r.avanzar());
	}

}
