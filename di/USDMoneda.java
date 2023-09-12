package di;

public class USDMoneda extends Moneda {

	public USDMoneda(VendaVersioDI venda) {
		super(venda);
	}

	@Override
	public String getNom() {
		return "USD";
	}

	@Override
	public double getValue() {
		return venda.getTotal() * 1.0972d;
	}
}
