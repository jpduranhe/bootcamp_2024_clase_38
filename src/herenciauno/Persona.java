package herenciauno;

public class Persona {
	
	protected String nombre;
	protected String apellidos;
	private String rut;
	
	public Persona() {}
		
	
	public Persona(String nombre, String rut, String apellidos) {
		this.nombre = nombre;
		this.rut = rut;
		this.apellidos = apellidos;
	}
	public Persona( String rut) {
		this.rut = rut;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	

}
