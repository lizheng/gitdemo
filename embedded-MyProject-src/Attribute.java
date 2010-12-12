
public class Attribute {
	protected String attributeValue;
	
	public Attribute() {
		setAttributeValue("");
	}
	
	public Attribute(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public String getAttributeValue() { return attributeValue; }
	
	public void setAttributeValue(String attributeValue) { this.attributeValue = attributeValue; }
}
