import java.util.ArrayList;
import java.util.Iterator;


public class AttributeList {
	ArrayList<Attribute> attributeList;
	ArrayList<Tag> tagList;
	private boolean getAttributeInListSucc;
	
	public AttributeList() {
		super();
		attributeList = new ArrayList<Attribute>();
		attributeList.add(new Press());
		attributeList.add(new Author());
		attributeList.add(new Comment());
		tagList = new ArrayList<Tag>();
	}
	
	public void modifyAttribute(String name, String value) {		
		Attribute targetAttribute = getAttributeInList(name); 
		if(isGetAttributeInList())
			targetAttribute.setAttributeValue(value);		
	}

	private boolean isGetAttributeInList() {
		// TODO Auto-generated method stub
		return getAttributeInListSucc;
	}

	private Attribute getAttributeInList(String attributeType) {
		// TODO Auto-generated method stub
		Iterator<Attribute> iterator = attributeList.iterator();
		Attribute attributeLoop;
		while(iterator.hasNext()) {
			attributeLoop = iterator.next(); 
			if( attributeLoop.getAttributeName().equals(attributeType) )
				return attributeLoop;
		}
		getAttributeInListSucc = false;
		return null;
	}
}
