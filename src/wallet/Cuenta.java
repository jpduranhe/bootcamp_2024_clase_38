package wallet;

public class Cuenta {
	protected int numeroDeCuenta;
	protected double saldo;
	
	
	public Cuenta(int numeroDeCuenta,double saldo){
		this.numeroDeCuenta=numeroDeCuenta;
		this.saldo=saldo;
	}
	
	public void depositar(double monto) {
		this.saldo+=monto;
	}
	
	public void retirar(double monto) {
		
		this.saldo-=monto;
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
	
	public String getSaldoActual() {
		return "$  "+saldo;
	}
	
}
