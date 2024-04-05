package clase_38;
import herenciauno.*;

public class EjercicioHerenciaUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona = new Persona();		
		persona.setNombre("Jose");
		persona.setRut("11111111-1");
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Sara");
		empleado.setRut("25369852-5");
		empleado.setCargo("Gerente TI");
		empleado.setApellidos("Rioseco");
		
		Empleado empleadoJulio = new Empleado("1-9");
		
		empleadoJulio.getCargo();
		
		
		Empleado empleadoMarco = new Empleado("Marco","Polo","1-8","Informatico");
		
		empleadoMarco.getCargo();
		
		
		Empleado empleadoMaria = new Empleado("Diseñador","Maria");
		
		empleadoMaria.getCargo();
		
		System.out.println("");
		
		/*
		Cliente cliente = new Cliente();
		cliente.setNombre("Miguel");
		cliente.setRut("24321654-9");
		cliente.setTipo("Premium");
		cliente.setApellidos("Baillon");
		*/
		
	}

}
