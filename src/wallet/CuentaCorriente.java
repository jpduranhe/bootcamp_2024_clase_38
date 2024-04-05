package wallet;

public class CuentaCorriente extends Cuenta {
	
	private String titular;
	
	
	
	public CuentaCorriente(int numeroDeCuenta,double saldo,String titular) {
		super(numeroDeCuenta,saldo);
		this.titular=titular;
		
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
