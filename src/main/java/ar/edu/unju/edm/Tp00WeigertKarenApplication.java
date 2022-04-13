package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.estudiante;

@SpringBootApplication
public class Tp00WeigertKarenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00WeigertKarenApplication.class, args);
		
		String nombre=" karen";
		System.out.println("Hola mundo"+ nombre+ ""+darnombre());
		estudiante unestudiante = new estudiante();
		unestudiante.setDni("44769217");
		unestudiante.setNombre("nuevonombre");
		System.out.println("el estudiante "+ unestudiante.getNombre()+ "dice hola");
	
		calculadora uncalculadora = new calculadora();
		uncalculadora.setNumero(2);
		uncalculadora.setNumerob(3);
		System.out.println("el resultado de la suma es "+ uncalculadora.resolversuma());
		System.out.println("el resultado de la resta es "+ uncalculadora.resolverresta());
		System.out.println("el resultado de la multiplicacion es "+ uncalculadora.resolvermultiplicacion());
		/*if(uncalculadora.resolverdivision()!=0)
		{*/
		if (uncalculadora.getNumerob()!=0)
		{
			System.out.println("el resultado de la divisicon es "+ uncalculadora.resolverdivision());
		}
		else
		{
			System.out.println("no puedo calcular porque el divisor es 0");
		}
		System.out.println("el resultado de la potencia con base numero y exponente numerob es: "+uncalculadora.potencia());
		System.out.println("el resultado de la raiz con base numero y exponente de la raiz numerob es: "+uncalculadora.raiz());
	}
 public static String darnombre(){
	 String darnombre= "loreley";
	 return darnombre;
 }
 }

