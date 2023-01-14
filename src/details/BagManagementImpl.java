package details;

public class BagManagementImpl implements BagManagement {

	public double chirieBagaj(double minute) {

		int pret = 0;
		pret += 10;

		double ora;
		ora = Math.ceil(minute / 60);

		if (ora > 1) {
			ora -= 1;
			pret += (ora * 5);
		}
		
		System.out.println("You have to pay for luggage the amount of " + pret + " lei.");
		return pret;
	}

}
