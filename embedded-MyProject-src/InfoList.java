import java.util.ArrayList;

public class InfoList implements ItemInfo {
	ArrayList<Attribute> attributeList;
	ArrayList<Tag> tagList;

	//private boolean getAttributeInListSucc;

	public InfoList() {
		super();
		attributeList = new ArrayList<Attribute>();
		tagList = new ArrayList<Tag>();
	}

	/*
	 * public void modifyAttribute(String name, String value) { Attribute
	 * targetAttribute = getAttributeInList(name); if(isGetAttributeInList())
	 * targetAttribute.setAttributeValue(value); }
	 * 
	 * private boolean isGetAttributeInList() { // TODO Auto-generated method
	 * stub return getAttributeInListSucc; }
	 * 
	 * private Attribute getAttributeInList(String attributeType) { // TODO
	 * Auto-generated method stub Iterator<Attribute> iterator =
	 * attributeList.iterator(); Attribute attributeLoop;
	 * while(iterator.hasNext()) { attributeLoop = iterator.next(); if(
	 * attributeLoop.getAttributeName().equals(attributeType) ) return
	 * attributeLoop; } getAttributeInListSucc = false; return null; }
	 */
	@Override
	public void addAttribute(String value) {
		// TODO Auto-generated method stub
		attributeList.add(new Attribute(value));
	}

	@Override
	public void deleteAttribute(int infoIndex) {
		// TODO Auto-generated method stub
		attributeList.remove(infoIndex);
	}

	@Override
	public void updateAttribute(int infoIndex, String value) {
		attributeList.set(infoIndex, new Attribute(value));
		// TODO Auto-generated method stub

	}

	@Override
	public void addTag(Tag newTag) {
		// TODO Auto-generated method stub
		if ( !existTag(newTag) )
		{
			tagList.add(newTag);
		}
	}

	@Override
	public void deleteTag(Tag deletedTag) {
		// TODO Auto-generated method stub
		tagList.remove(deletedTag);
	}

	private boolean existTag(Tag newTag) {
		for (Tag currentTag : tagList) {
			if (currentTag.equals(newTag)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Attribute> getAllAttribute() {
		// TODO Auto-generated method stub
		return attributeList;
	}

	@Override
	public ArrayList<Tag> getAllTag() {
		// TODO Auto-generated method stub
		return tagList;
	}

	@Override
	public Attribute getAttribute(int infoIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
