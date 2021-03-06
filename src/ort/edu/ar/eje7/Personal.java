package ort.edu.ar.eje7;

public abstract  class   Personal {
private String DNI;
private String nombre;
public  String apellido;
protected int aņoDeIngreso;
public Personal(String dNI, String nombre, String apellido, int aņoDeIngreso) {
	super();
	DNI = dNI;
	this.nombre = nombre;
	this.apellido = apellido;
	this.aņoDeIngreso = aņoDeIngreso;
}

public abstract double getSalario();

public String nombreCompleto() {
	return this.nombre+" "+this.apellido;
}

public int getAņoDeIngreso() {
	return aņoDeIngreso;
}
@Override
public String toString() {
	return "Personal [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", aņoDeIngreso=" + aņoDeIngreso
			+ "]";
}

}
