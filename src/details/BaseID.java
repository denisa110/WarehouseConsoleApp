package details;

import java.util.Objects;

public class BaseID {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BaseID(String id) {
		super();
		this.id = id;
	}

	public BaseID() {
		super();
	}

	@Override
	public String toString() {
		return "BaseID [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseID other = (BaseID) obj;
		return Objects.equals(id, other.id);
	}

}
