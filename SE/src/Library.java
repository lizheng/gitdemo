import java.util.ArrayList;


public class Library {
	private ArrayList<Book> library;
	
	public void addBook(Book newAdd) {
		library.add(newAdd);
	}
	
	public void deleteBook() {
		
	}
	
	public void modifyBookInfo(Book target) {
		library.get(library.indexOf(target));
	}
}
