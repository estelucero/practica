package practica3Progra2;

public class Fecha {
	Integer ano;
	Integer mes;
	Integer dia;
	Integer anoValido=1990;
	
	public Fecha(Integer ano,Integer mes,Integer dia) {
		
		if(ano>=this.anoValido) {
			this.ano=ano;
		}else {
			throw new RuntimeException("Erro:año invalido");
		}
		
		if(mes>=1 && mes<=12) {
			this.mes=mes;
		}else {
			throw new RuntimeException("Erro:mes invalido");
			
		}
		
		if(dia>=1 && dia<= diasMes(mes, ano)) {
			this.dia=dia;
		}else {
			throw new RuntimeException("Erro:dia invalido");
		}
		
	}
	

	
	
	public static boolean esBisiesto(Integer ano) {
		return ano%4==0?true:false;
	}
	
	public static Integer diasMes(Integer mes,Integer ano) {
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ) {
			return 31;
		}else if(mes==2) {
			if(esBisiesto(ano)) {
				return 29;
			}else {
				return 28;
			}
		}
	return 30;
	}
 
	public boolean esBisiesto() {
		return this.esBisiesto(this.ano);
	}
	
	public Integer diferenciaAnos(Interger ano) {
		Integer cantDias=0;
		for(int i =this.ano;i<=ano;i++ ) {
			
		}
		
	}
}
