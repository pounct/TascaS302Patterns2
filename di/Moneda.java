package di;

public abstract class Moneda {

	protected VendaVersioDI venda;

	abstract String getNom();

	abstract double getValue();

	public Moneda(VendaVersioDI venda) {
		this.venda = venda;
	}

	@Override
	public String toString() {
		return " Venda en " + getNom() + " : " + getValue();
	}

	// abstract void setValue(VendaVersioDI venda);
}
