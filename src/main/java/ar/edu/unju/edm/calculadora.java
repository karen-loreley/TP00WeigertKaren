package ar.edu.unju.edm;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class calculadora {
private int numero;
private int numerob;

public calculadora() {
	// TODO Auto-generated constructor stub
}

public int resolversuma() {
	int resultado =numero+numerob;
	return resultado;
}

public int resolverresta() {
	int resultado2 =numero-numerob;
	return resultado2;
}

public int resolvermultiplicacion() {
	int resultado3 =numero*numerob;
	return resultado3;
}

public int resolverdivision() {
	
	if (numerob > 0 || numerob<0)
	{
		int resultado4 = numero/numerob;
		return resultado4;	
	}
	else
		return 0;
	
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public int getNumerob() {
	return numerob;
}

public void setNumerob(int numerob) {
	this.numerob = numerob;
}


}
