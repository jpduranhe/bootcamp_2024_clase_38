package herenciauno;

public class Empleado extends Persona{
	private String cargo;
	
	
	public Empleado() {}
	
	public Empleado(String cargo,String nombre ) {
		this.cargo=cargo;
		this.nombre=nombre;
	}
	public Empleado(String rut) {
		super(rut);
	}
	
	public Empleado(String nombre,String apellidos,String rut,String cargo) {
		/*
		 * Forma uno
		super(nombre,rut,apellidos);
		this.cargo=cargo;
		*/
		
		// forma dos
		super(rut);
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.cargo=cargo;
	}
	
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void cualquierCosa() {
		
		this.cargo="";
		this.nombre="";
	}
	
	
}
