import java.util.ArrayList;


public class Library implements Container {
	private ArrayList<Book> Books;

	@Override
	public void addItem(Item newBook) {
		// TODO Auto-generated method stub
		Books.add((Book)newBook);
	}

	@Override
	public void deleteItem(Item deletedBook) {
		// TODO Auto-generated method stub
		Books.remove(deletedBook);
	}
	
	public void showItemInfo(Item selectedBook) {
		//TODO
		selectedBook.getAllAttribute();
		
	}

	@Override
	public void modifyItemInfo(Item selectedBook) {
		// TODO Auto-generated method stub
		
		selectedBook.modifyInfo();
	}

	@Override
	public ArrayList<Item> searchItems(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
