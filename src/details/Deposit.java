package details;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Deposit extends BaseID {

	private String depositName;
	private String depositAdress;
	private Integer capacity;

	// Adaugare client in depozit
	private List<Client> clienti = new ArrayList<Client>();

	public void addClient(Client client) {
		// adaugam clientul numai daca acesta nu este inregistrat deja
		if (!this.clienti.contains(client))
			this.clienti.add(client);
	}

	public String getDepositName() {
		return depositName;
	}

	public void setDepositName(String depositName) {
		this.depositName = depositName;
	}

	public String getDepositAdress() {
		return depositAdress;
	}

	public void setDepositAdress(String depositAdress) {
		this.depositAdress = depositAdress;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public List<Client> getClienti() {
		return clienti;
	}

	public void setClienti(List<Client> clienti) {
		this.clienti = clienti;
	}

	public Deposit(String id, String depositName, String depositAdress, Integer capacity) {
		super(id);
		this.depositName = depositName;
		this.depositAdress = depositAdress;
		this.capacity = capacity;
	}

	public Deposit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deposit(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity, clienti, depositAdress, depositName);
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
		Deposit other = (Deposit) obj;
		return Objects.equals(capacity, other.capacity) && Objects.equals(clienti, other.clienti)
				&& Objects.equals(depositAdress, other.depositAdress) && Objects.equals(depositName, other.depositName);
	}

	@Override
	public String toString() {
		return "Deposit [depositName=" + depositName + ", depositAdress=" + depositAdress + ", capacity=" + capacity
				+ ", clienti=" + clienti + "]";
	}

}