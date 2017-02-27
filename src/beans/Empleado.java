package beans;

import utilidades.LecturaDatos;

public class Empleado {
	protected String nombre;
	protected double salario;
	protected String fNacimiento;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, double salario, String fNacimiento){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFNacimiento() {
		return fNacimiento;
	}

	public void setFNacimiento(String fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fNacimiento == null) ? 0 : fNacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (fNacimiento == null) {
			if (other.fNacimiento != null)
				return false;
		} else if (!fNacimiento.equals(other.fNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}

	public void crearEmpleado(){
		System.out.println("---Dar de alta a Empleado");
		datosEmpleado();
	}
	
	public void datosEmpleado(){
		this.setNombre(LecturaDatos.leerString("Nombre: "));
		this.setSalario(LecturaDatos.leerInteger("Salario: "));
		this.setFNacimiento(LecturaDatos.leerString("Fecha de Nacimiento: "));
	}
	
	@Override
	public String toString() {
		return "Nombre " + nombre + ", con Salario: " + salario + ", Fecha de Nacimiento: " + fNacimiento + "\n";
	}

}
