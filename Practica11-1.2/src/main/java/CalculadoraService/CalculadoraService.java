package CalculadoraService;

public class CalculadoraService {
private double capital, interes, plazo, cuota;
	

	public CalculadoraService(String capital, String interes, String plazo) throws NumberFormatException, CantidadCorrectaException {
		try {
			this.capital = Double.parseDouble(capital);
			this.interes = Double.parseDouble(interes);
			this.plazo = Double.parseDouble(plazo);
		} catch (NumberFormatException b) {
			
		}
		if (this.capital <= 0 || this.interes <= 0 || this.plazo <= 0) {
			throw new CantidadCorrectaException();
		}else {
			calcular();
		}
	
	}
	
	/**
	 * Este metodo requerira usar la formula del calculo mensual
	 */
	
	public void calcular() {
		double P, i, n, z, zn, d;
		i = this.interes / 1200.00;
		P = this.capital*i;
		z = (1 + i); 
		//Ponemos exponenete en negativo
		n = this.plazo*12 * -1 ;
		// Usamos Math pow para calular el exponente
		zn = Math.pow(z, n);
		d = (1-zn);
		this.cuota = P / d;
	}
	
	//Redondeamos los decimales a 2, creando una clase para redondear decimales en la devolucion de la cuota
	public double getCuota() {
		this.cuota = redondear(this.cuota, 2);
		return this.cuota;
	}
	
	public double redondear (double numero, int decimales) {
		return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
	}
}
