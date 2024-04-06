package wallet;

public class CuentaUSD extends Cuenta {

	public CuentaUSD(int numeroDeCuenta, double saldo) {
		super(numeroDeCuenta, saldo);
	}
	@Override
	public String getSaldoActual() {
		return "$ USD "+saldo;
	}
}
