package beans;

import utilidades.LecturaDatos;
import beans.Empleado;

public class Gerente extends Empleado{
	protected String departamento;
	
	public Gerente(){
		
	}
	
	public Gerente(String nombre, double salario, String fNacimiento, String departamento) {
		super(nombre,salario,fNacimiento);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public void setSalario(double salario) {
		salario = salario * 1.05;
		this.salario = salario;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
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
		Gerente other = (Gerente) obj;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		return true;
	}
	
	public void crearGerente(){
		System.out.println("---Dar de alta a Gerente");
		datosGerente();
	}
	
	public void datosGerente(){
		this.datosEmpleado();
		this.setDepartamento(LecturaDatos.leerString("Departamento: "));
	}

	@Override
	public String toString() {
		String datos_emp = super.toString();
		return "Gerente " + datos_emp + ", del Departamento: " + departamento;
	}	
}
