import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsoEmpleados{
	public static void main(String[] args) {
		
		
		//cargar contexto creando objeto o instancia ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//pedimos al contexto el Bean con el id y el nombre de la interfaz
		
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Juan.getTareas());
		
		//cerramos contexto, el xml
		
		contexto.close();
		
	}
}
