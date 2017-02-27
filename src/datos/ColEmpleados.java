package datos;

import java.util.ArrayList;
import java.util.List;
import beans.Empleado;

public class ColEmpleados {
	private List<Empleado> listaEmpleados = new ArrayList<>();
	
	public ColEmpleados() {
		
	}
	
	public List<Empleado> getListado() {
        return listaEmpleados;
    }

    public void setListado(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void agregar (Empleado e){
    	listaEmpleados.add(e);
    }
    
    
    @Override
    public String toString() {
        return "Empleados: " + listaEmpleados;
    }
}
