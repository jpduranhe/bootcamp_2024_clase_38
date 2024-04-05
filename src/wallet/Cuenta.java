package wallet;

public class Cuenta {
	private int numeroDeCuenta;
	private double saldo;
	
	
	public Cuenta(int numeroDeCuenta,double saldo){
		this.numeroDeCuenta=numeroDeCuenta;
		this.saldo=saldo;
	}


	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}


	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
