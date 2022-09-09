package practica3Progra2;

public class Fecha {
	private Integer ano;
	private Integer mes;
	private Integer dia;
	private Integer anoValido = 1990;

	public Fecha(Integer ano, Integer mes, Integer dia) {

		if (ano >= this.anoValido) {
			this.ano = ano;
		} else {
			throw new RuntimeException("Erro:año invalido");
		}

		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		} else {
			throw new RuntimeException("Erro:mes invalido");

		}

		if (dia >= 1 && dia <= diasMes(mes, ano)) {
			this.dia = dia;
		} else {
			throw new RuntimeException("Erro:dia invalido");
		}

	}

	public static Integer diasDelAno(Integer ano) {
		if (Fecha.esBisiesto(ano)) {
			return 366;
		} else {
			return 365;
		}
	}

	public static boolean esBisiesto(Integer ano) {
		return ano % 4 == 0 ? true : false;
	}

	public static Integer diasMes(Integer mes, Integer ano) {
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		} else if (mes == 2) {
			if (esBisiesto(ano)) {
				return 29;
			} else {
				return 28;
			}
		}
		return 30;
	}

	public boolean esBisiesto() {
		return this.esBisiesto(this.ano);
	}

	public Integer diferenciaDias(Fecha fecha) {
		Fecha f = new Fecha(this.ano, this.mes, this.dia);
		int cant = 0;
		boolean correr = this.fechaMasChica(fecha);
		if (correr) {
			while (!(f.comparar(fecha))) {
				f.sumarDia();
				cant++;
			}
		}
		return cant;
	}
	
	public Fecha queFechaSera(Integer dias) {
		Fecha f = new Fecha(this.ano, this.mes, this.dia);
		for(int i =0;i<dias;i++) {
			f.sumarDia();
		}
		return f;
	}

	public boolean fechaMasChica(Fecha fecha) {
		if (this.ano < fecha.getAno() || this.mes < fecha.getMes() || this.dia < fecha.getDia()) {
			return true;
		} else {
			return false;
		}
	}

	public void sumarDia() {
		if (this.dia == Fecha.diasMes(this.mes, this.ano)) {
			this.dia = 1;
			this.sumaMes();
		} else {
			this.dia++;
		}
	}

	private void sumaMes() {
		if (this.mes == 12) {
			this.mes = 1;
			this.sumaAno();
		} else {
			this.mes++;
		}
	}

	private void sumaAno() {
		this.ano++;
	}

	public boolean comparar(Fecha fecha) {
		if ( (int)fecha.getAno() == (int)this.getAno() && fecha.getMes() == this.getMes()  && fecha.getDia() == this.getDia()) {
			return true;
		} else {
			return false;
		}
	}
	public void imprimir() {
		System.out.println(this.getDia()+"/"+this.getMes()+"/"+this.getAno());
	}

	public Integer getAno() {
		return this.ano;
	}

	public Integer getMes() {
		return this.mes;
	}

	public Integer getDia() {
		return this.dia;
	}
}
