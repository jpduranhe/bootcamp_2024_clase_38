package wallet;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * 
		 * Probando los métodos!:
Vamos a trabajar sobre la clase Cuenta con los métodos depositar() y retirar(). 
Luego, crearemos las subclases CuentaPesoCL y CuentaUSD que implementarán estos métodos realizando el cambio de moneda correspondiente.
Vamos a mostrar por pantalla los resultados para verificar.

		 */
		CuentaPesosCL cuentaPesos= new CuentaPesosCL(200,1500);
		CuentaUSD cuentaDolares= new CuentaUSD(300,1500);
		
		System.out.println(cuentaPesos.getSaldoActual());
		System.out.println(cuentaDolares.getSaldoActual());
	}

}
