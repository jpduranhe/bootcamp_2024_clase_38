package wallet;

public class CuentaPesosCL extends Cuenta {

	public CuentaPesosCL(int numeroDeCuenta, double saldo) {
		super(numeroDeCuenta, saldo);
	}
	
	@Override
	public String getSaldoActual() {
		return "$ CLP "+saldo;
	}
	

}
