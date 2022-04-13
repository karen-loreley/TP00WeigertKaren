package ar.edu.unju.edm;

//import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;
//import java.until.Scanner;
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

public double resolverdivision() {
	
	/*if (numerob > 0 || numerob<0 numerob != 0)*/
	
		double resultado4 = (double) numero / numerob;
		return resultado4;	
	
}

public double potencia ()
{
	//double base=numero, expo=numerob;
	double potencia = Math.pow((double)numero, (double)numerob);
	
	return potencia;
}

public double raiz ()
{
	//double base=numero, expo=numerob;
	double raiz = Math.pow((double)numero, (double)1/numerob);
	
	return raiz;
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
