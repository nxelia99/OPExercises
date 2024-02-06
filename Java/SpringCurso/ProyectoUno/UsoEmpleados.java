import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsoEmpleados{
	public static void main(String[] args) {
		
		
		//cargar contexto creando objeto o instancia ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//pedimos al contexto el Bean con el id y el nombre de la interfaz

		
		//cerramos contexto, el xml 
		
		SecretarioEmpleado María = contexto.getBean("miSecretario", SecretarioEmpleado.class);
		System.out.println(María.getTareas());
		System.out.println(María.getInforme());
		System.out.println("Email: " + María.getEmail());
		System.out.println("Nombre de empresa: " + María.getNombreEmpresa());
		
		contexto.close();
		
	}
}
