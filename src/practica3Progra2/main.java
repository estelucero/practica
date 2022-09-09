package practica3Progra2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ano=2024;
		//System.out.print(Fecha.esBisiesto(ano));
		Fecha fecha= new Fecha(ano,1,31);
		System.out.print(fecha.getAno());
	}

}
