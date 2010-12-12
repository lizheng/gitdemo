import java.util.ArrayList;


public interface Item {
	public void modifyInfo();
	public void addTag( Tag t );
	public ArrayList<Attribute> getAllAttribute();

}
