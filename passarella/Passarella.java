package passarella;

public interface Passarella {
	// La passarel·la invocarà el pagament sense conèixer la forma 
	// i retornant el control a la classe d'origen.
	public String  efectuarPagament();
}
