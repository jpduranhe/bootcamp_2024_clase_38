package sobreescritura;

public class Profesor extends Persona {
	
	private String clase;
	
	
	
	
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	@Override
	public String toString() {
		return "Profesor [clase=" + clase + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre().toUpperCase();
	}
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("BLA BLA BLA");
	}
	
	

	
	
}
