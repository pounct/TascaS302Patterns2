package passarella;

public class Main {

	public static void main(String[] args) {

		Botiga botigaDeSabates = new Botiga();

		botigaDeSabates.callbackMethod(new Passarella() {

			// PayPal
			// crear efectuarPagament() // implementar
			public String efectuarPagament() {
				System.out.println("--------------------------------------------------------");
				System.out.println("el codi a injectar que descriu la forma de pagament...");
				System.out.println("Processament de pagaments de PayPal...");
				return "primera devolució de trucada : pagaments PayPal fet.";
			}
		});
		
		botigaDeSabates.callbackMethod(new Passarella() {
			
			// targeta de crèdit
			// crear efectuarPagament() // implementar
			public String efectuarPagament() {
				System.out.println("--------------------------------------------------------");
				System.out.println("el codi a injectar que descriu la forma de pagament...");
				System.out.println("Processament de pagaments con targeta de crèdit...");
				return "segona devolució de trucada : pagament targeta de crèdit fet.";
			}
		});
		
		botigaDeSabates.callbackMethod(() -> {
			
			// deute en compte bancari
			// sense crear efectuarPagament() // implementar
			System.out.println("--------------------------------------------------------");
			System.out.println("el codi a injectar sin crear efectuarPagament()");
			System.out.println("La interfície de Passarela només té un mètode 'efectuarPagament()'");
			System.out.println("el codi a injectar que descriu la forma de pagament...");
			System.out.println("Processament de pagaments deute en compte bancari...");
			return "tercera devolució de trucada : pagament deute en compte bancari fet.";
		});

	}
}
