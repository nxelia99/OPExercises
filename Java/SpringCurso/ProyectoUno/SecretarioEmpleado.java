public class SecretarioEmpleado implements Empleados{
	
	public String getTareas() {
		return "Gestionar la agenda de los Jefes";
	}
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el Secretario: " + informeNuevo.getInforme() ; 
	}
	
	//setter para la inyección
	private CreacionInformes informeNuevo;
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	//creamos campos
	private String email;
	private String nombreEmpresa;
	
	//setters y getters establece valor de los campos desde ApplicatonContext
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	
	


	
	

}
