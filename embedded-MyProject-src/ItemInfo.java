import java.util.ArrayList;


public interface ItemInfo {
	public void updateAttribute( int infoIndex, String value );
	public void addAttribute( String value );
	public void deleteAttribute( int infoIndex );
	public ArrayList<Attribute> getAllAttribute();
	public ArrayList<Tag> getAllTag();
	public Attribute getAttribute( int infoIndex );
	
	public void addTag( Tag newTag );
	public void deleteTag( Tag deletedTag );
	
	
	
	//public void isVisible( int infoIndex );
	//public void infoDefaultValue( int infoIndex, String value );
}
