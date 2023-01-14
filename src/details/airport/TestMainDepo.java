package details.airport;

import java.util.List;

import details.Bag;
import details.Client;
import details.Deposit;
import details.Size;

public class TestMainDepo {

	public static void main(String[] args) {

		// 1. Deposit (Catalog)
		Deposit deposit = new Deposit("55d6", "depo1", "address1", 230);

		// 2.Clienti (categorii din catalog)
		Client client1 = new Client("5967c", "Alina M", "074253315");
		deposit.addClient(client1);
		Client client2 = new Client("5575m", "Alina L", "074298536");
		deposit.addClient(client2);

		Client client3 = new Client("639dh", "Alina N", "074253369");
		deposit.addClient(client3);

		Client client4 = new Client("56sgv", "Alina H", "074263315");
		deposit.addClient(client4);

		// 3. Bagajele clientilor (Produs)
		Bag bag1 = new Bag("52sjd", Size.big, "alb", 10.0);
		client1.addBag(bag1);
		Bag bag2 = new Bag("95755sj", Size.big, "verde", 12.0);
		client2.addBag(bag2);
		Bag bag3 = new Bag("963fdd8", Size.big, "gri", 13.5);
		Bag bag4 = new Bag("3345g", Size.big, "rosu", 5.5);

		client3.addBag(bag3);
		client3.addBag(bag4);

		System.out.println(" ----------------------------------- ");
		System.out.println(client3.getName() + " are urmatoarele bagaje: ");
		List<Bag> bagList = client3.getBagsList();
		for (Bag b : bagList)
			System.out.println( "Bagajul cu id:  " + b.getId() + " de culoare "+b.getColor()+" si de marime "+ b.getSize() );

		System.out.println(" ----------------------------------- ");
		System.out.println(deposit.getDepositName() + " are urmatorii clienti: ");
		List<Client> clientList = deposit.getClienti();
		for (Client c : clientList)
			System.out.println("Clientii depozitului: " + c.name);

	}
}
