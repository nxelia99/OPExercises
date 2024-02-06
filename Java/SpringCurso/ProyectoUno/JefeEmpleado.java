public class JefeEmpleado implements Empleados{
	
	//creación del constructor
	private CreacionInformes informeNuevo;
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados "
				+ "de sección";	
	}
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	
	
}
