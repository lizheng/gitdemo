
public class Attribute {
	protected String attributeName;
	protected String attributeValue;
	
	public Attribute() {
		setAttributeName("");
		setAttributeValue("");
	}

	public String getAttributeName() { return attributeName; }
	public String getAttributeValue() { return attributeValue; }
	
	public void setAttributeName(String attributeName) { this.attributeName = attributeName; }	
	public void setAttributeValue(String attributeValue) { this.attributeValue = attributeValue; }
}
