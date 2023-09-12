package passarella;

//La classe que invoca la passarel·la de pagament serà una botiga de sabates.
public class Botiga {
	
	// el metode callbackMethod() que invoca la passarel·la
	public void callbackMethod(Passarella passarellaDePagament) {
		//La passarel·la passarellaDePagament invocarà el pagament sense conèixer la forma
		// i retornant el control a la classe d'origen Botiga.
		System.out.println(passarellaDePagament.efectuarPagament());

	}

}
