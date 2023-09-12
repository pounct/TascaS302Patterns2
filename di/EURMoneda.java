package di;

public class EURMoneda extends Moneda {

	public EURMoneda(VendaVersioDI venda) {
		super(venda);
	}

	@Override
	public String getNom() {
		return "EUR";
	}

	@Override
	public double getValue() {
		return venda.getTotal();
	}
}
