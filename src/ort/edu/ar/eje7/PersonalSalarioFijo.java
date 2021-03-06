package ort.edu.ar.eje7;

public class PersonalSalarioFijo extends Personal {

	private static final int AŅO_ACTUAL = 2021;
	private static final double MENOR2 = 0;
	private static final double MAYORA2_Y_MENORIGUAL5 = 0.05;
	private static final double MAYORAIGUAL6_Y_MENORIGUAL10 = 0.1;
	private static final double MAYORA10 = 0.15;
	private double sueldoBasico;

	public PersonalSalarioFijo(String dNI, String nombre, String apellido, int aņoDeIngreso, double sueldoBasico) {
		super(dNI, nombre, apellido, aņoDeIngreso);
		this.sueldoBasico = sueldoBasico;
	}

	private double porcSegunAntiguedad() {
		double porcentaje = MENOR2;
		if (calcularDiferenciaDeAņos() >= 2 && calcularDiferenciaDeAņos() <= 5) {
			porcentaje = MAYORA2_Y_MENORIGUAL5;
		} else if (calcularDiferenciaDeAņos() >= 6 && calcularDiferenciaDeAņos() <= 10) {
			porcentaje = MAYORAIGUAL6_Y_MENORIGUAL10;
		} else if (calcularDiferenciaDeAņos() > 10) {
			porcentaje = MAYORA10;
		}
		return porcentaje;
	}

	private double calcularDiferenciaDeAņos() {
		return AŅO_ACTUAL - super.getAņoDeIngreso();
	}

	@Override
	public double getSalario() {
		return this.sueldoBasico + this.sueldoBasico * porcSegunAntiguedad();
	}

}
