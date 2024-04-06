package sobreescritura;

public class Runner  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor profeJp= new Profesor();
		profeJp.setNombre("Juan Pablo");
		profeJp.setClase("JAVA 3");
		
		
		System.out.println(profeJp.toString());
		profeJp.hablar();
	}

}
