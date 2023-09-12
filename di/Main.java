package di;

public class Main {

	public static void main(String[] args) {

		VendaVersioDI venda1 = new VendaVersioDI(10000);
		System.out.println(new EURMoneda(venda1));
		System.out.println(new USDMoneda(venda1));
	}
}
