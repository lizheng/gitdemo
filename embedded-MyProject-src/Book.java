import java.util.ArrayList;



public class Book implements Item {
	InfoList AL;


@Override
public void modifyInfo() {
	// TODO Auto-generated method stub
	
}

@Override
public void addTag(Tag t) {
	// TODO Auto-generated method stub
	
}


@Override
public ArrayList<Attribute> getAllAttribute() {
	// TODO Auto-generated method stub
	return (this.AL).getAllAttribute();
}

}