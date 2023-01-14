package details;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client extends BaseID {
	public String name;
	public String nrTelefon;

	// lista de bagaje
	private List<Bag> bagsList = new ArrayList<Bag>();

	public void addBag(Bag bag) {
		// se va adauga un bagaj doar daca acesta nu exista deja
		if (!this.bagsList.contains(bag))
			this.bagsList.add(bag);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public List<Bag> getBagsList() {
		return bagsList;
	}

	public void setBagsList(List<Bag> bagsList) {
		this.bagsList = bagsList;
	}

	public Client(String id, String name, String nrTelefon) {
		super(id);
		this.name = name;
		this.nrTelefon = nrTelefon;
	}

	public Client() {
		super();
	}

	public Client(String id) {
		super(id);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bagsList, name, nrTelefon);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(bagsList, other.bagsList) && Objects.equals(name, other.name)
				&& Objects.equals(nrTelefon, other.nrTelefon);
	}

}