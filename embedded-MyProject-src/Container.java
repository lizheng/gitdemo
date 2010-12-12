import java.util.ArrayList;


public interface Container {
	
	public void addItem(Item newItem);
	public void deleteItem( Item deletedItem );
	public void modifyItemInfo( Item a );
	public ArrayList<Item> searchItems( String s );

}
