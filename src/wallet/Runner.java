package wallet;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente ctacta= new CuentaCorriente(132,500.0,"Julio");
		
		System.out.println(ctacta.getNumeroDeCuenta());
		System.out.println(ctacta.getSaldo());
		System.out.println(ctacta.getTitular());
	}

}
