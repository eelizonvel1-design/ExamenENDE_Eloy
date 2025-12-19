package Examen;

/**
 * Clase que representa un vheiculo con una matricula una marca un modelo y el preciohora
 * 
 * @author eloye
 */

public class Vehiculo {
private String matricula;
private String marca;
private String modelo;

private String preciohora;

/**
 * Metodo constructor que instancia el objeto vvehiculo
 * @param matricula
 * @param marca
 * @param modelo
 * @param preciohora
 * 
 * @author eloye
 */

public Vehiculo(String matricula, String marca, String modelo, String preciohora) {
	super();
	this.matricula = matricula;
	this.marca = marca;
	this.modelo = modelo;
	this.preciohora = preciohora;
}

/**
 * Metodos geters and seters
 *
 * @return
 * 
 * @author eloye
 */

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getPreciohora() {
	return preciohora;
}

public void setPreciohora(String preciohora) {
	this.preciohora = preciohora;
}


/**
 * Metodo toString
 * 
 * @author eloye
 */
@Override
public String toString() {
	return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", preciohora=" + preciohora
			+ "]";
}



}
