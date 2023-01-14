package details;


import java.util.Objects;

public class Bag extends BaseID {
	private Size size;
	private String color;
	private Double weight;
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Bag(String id, Size size, String color, Double weight) {
		super(id);
		this.size = size;
		this.color = color;
		this.weight = weight;
	}
	public Bag() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bag(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, size, weight);
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
		Bag other = (Bag) obj;
		return Objects.equals(color, other.color) && size == other.size && Objects.equals(weight, other.weight);
	}
	@Override
	public String toString() {
		return "Bag [size=" + size + ", color=" + color + ", weight=" + weight + "]";
	}
	
}
