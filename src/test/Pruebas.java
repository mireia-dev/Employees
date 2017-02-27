package test;

import beans.Director;
import beans.Gerente;
import beans.Empleado;

public class Pruebas {

	public static void Prueba01() {
		Gerente gerente = new Gerente();
		Director director = new Director();
		Empleado [] listaEmpleados = new Empleado[5];
		
		for (int i=0; i<3 ; i++){
			Empleado empleado = new Empleado();
			empleado.crearEmpleado();
			listaEmpleados[i] = empleado;
		}
		
		System.out.println(listaEmpleados[0]);
		System.out.println(listaEmpleados[1]);
		System.out.println(listaEmpleados[2]);
		
		gerente.crearGerente();
		listaEmpleados[3] = gerente;
		
		director.crearDirector();
		listaEmpleados[4] = director;
		
		
		for (Empleado e: listaEmpleados){
			System.out.println(e);
		}
    }
}
