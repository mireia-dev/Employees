package beans;

import utilidades.LecturaDatos;
import beans.Gerente;

public class Director extends Gerente {
	private String matricula;
	
	public Director() {
	}

	public Director(String nombre, double salario, String fNacimiento, String Departamento, String matricula) {
		super(nombre, salario, fNacimiento, Departamento);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void setSalario(double salario) {
		salario = salario * 1.10 + 100;
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Director other = (Director) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
	public void crearDirector(){
		System.out.println("---Dar de alta a Director");
		this.datosGerente();
		this.setMatricula(LecturaDatos.leerString("Matrícula: "));
	}
	

	@Override
	public String toString() {
		String datos_gerente = super.toString();
		return "Director " + datos_gerente + ", con Matrícula: " + matricula;
	}
	
}
