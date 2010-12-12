/*
 * @author orange
 * @version roughly done as DEMO
 */

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class UI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UI();
	}

	private JFrame frame;
	//up Box
	private Box menuBox;
	private Box userBox;
	private Box basicBox;
	private Box searchBox;
	private Box funtionBox;
	private Button login;
	private Button setting;
	private Button add;
	private Button delete;
	private Button info;
	private Button comment;
	private Button upload;
	private Button download;
	private Button search;
	private JTextField searchText;
	private Button local;
	private Button online;
	
	private JSplitPane splitFirst;
	private JSplitPane splitSecond;	
	//split left
	private JScrollPane scrollPaneForTree;
	private JPanel splitLeftPanel;
	private JTree tree;
	private DefaultMutableTreeNode authorNode;
	private DefaultMutableTreeNode pressNode;
	private DefaultMutableTreeNode tagRootNode;
	private DefaultMutableTreeNode tag1Node;
	private DefaultMutableTreeNode tag2Node;
	private DefaultMutableTreeNode tag3Node;
	private DefaultTreeModel treeModel;
	private DefaultMutableTreeNode rootNode;	
	//split right
	private Box splitRightBox;
	private JLabel bookOverview;
	private JTextArea splitRightText;
	//split center
	private JLabel label2;
	private JPanel splitCenterPanel;
	private JScrollPane scrollPaneForTable;
	private JTable table;
	
	public UI() {
		declare();
		pack();
		addListener();
		show();		
	}

	private void show() {
		// TODO Auto-generated method stub
		frame.pack();
		//splitLeft.setDividerLocation(0.2);
		//splitRight.setDividerLocation(0.6);
		frame.show();
	}

	private void addListener() {
		// TODO Auto-generated method stub
		
	}

	private void pack() {
		// TODO Auto-generated method stub
		frame.add(menuBox, BorderLayout.NORTH);
		frame.add(splitFirst);
		packMenuBox();
		packSplit();
	}

	private void packSplit() {
		// TODO Auto-generated method stub
		packSplitLeft();
		packSplitCenter();
		packSplitRight();
		
		splitFirst.add(splitLeftPanel);
		splitFirst.add(splitSecond);		
		splitSecond.add(splitCenterPanel);
		splitSecond.add(splitRightBox);
	}

	private void packSplitRight() {
		// TODO Auto-generated method stub
		splitRightBox.add(bookOverview);
		splitRightBox.add(splitRightText);
	}

	private void packSplitCenter() {
		// TODO Auto-generated method stub
		splitCenterPanel.add(scrollPaneForTable);
	}

	private void packSplitLeft() {
		// TODO Auto-generated method stub
		splitLeftPanel.add(scrollPaneForTree);
		packTreeNodes();		
	}

	private void packTreeNodes() {
		// TODO Auto-generated method stub
		treeModel.insertNodeInto(authorNode, rootNode, 0);
		treeModel.insertNodeInto(pressNode, rootNode, 0);
		treeModel.insertNodeInto(tagRootNode, rootNode, 0);
		treeModel.insertNodeInto(tag1Node, tagRootNode, 0);
		treeModel.insertNodeInto(tag2Node, tagRootNode, 0);
		treeModel.insertNodeInto(tag3Node, tagRootNode, 0);
	}

	private void packMenuBox() {
		// TODO Auto-generated method stub
		menuBox.add(userBox);
		menuBox.add(funtionBox);
		
		packUserBox();
		packFuntionBox();
	}

	private void packFuntionBox() {
		// TODO Auto-generated method stub
		funtionBox.add(basicBox);
		funtionBox.add(searchBox);
		packBasicBox();
		packSearchBox();
	}

	private void packSearchBox() {
		// TODO Auto-generated method stub
		searchBox.add(searchText);
		searchBox.add(local);
		searchBox.add(online);
	}

	private void packBasicBox() {
		// TODO Auto-generated method stub
		basicBox.add(add);
		basicBox.add(delete);
		basicBox.add(info);
		basicBox.add(comment);
		basicBox.add(upload);
		basicBox.add(download);
		basicBox.add(search);
	}

	private void packUserBox() {
		// TODO Auto-generated method stub
		userBox.add(login);
		userBox.add(setting);
	}

	private void declare() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setLayout(new BorderLayout());		
				
		declareMenuBox();	
		
		declareSplit();
	}

	private void declareSplit() {
		// TODO Auto-generated method stub
		splitFirst=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);
		splitSecond=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);
	    splitFirst.setDividerSize(5);
	    splitSecond.setDividerSize(5);
		
		declareSplitLeft();
	    declareSplitCenter();
	    declareSplitRight();
	}

	private void declareSplitRight() {
		// TODO Auto-generated method stub
		splitRightBox = Box.createVerticalBox();
		bookOverview=new JLabel("Book Overview",JLabel.CENTER);                            
	    bookOverview.setBackground(Color.yellow);
	    bookOverview.setOpaque(true);
	    splitRightText = new JTextArea();
	}

	private void declareSplitCenter() {
		// TODO Auto-generated method stub
		label2 = new JLabel("Label 2",JLabel.CENTER);
		label2.setBackground(Color.pink);
		label2.setOpaque(true);
		
		splitCenterPanel = new JPanel();
		table = new JTable(5, 4);
		scrollPaneForTable = new JScrollPane(table);
	}

	private void declareSplitLeft() {
		// TODO Auto-generated method stub	    
	    splitLeftPanel = new JPanel();
	    declareTree();
	}

	private void declareTree() {
		// TODO Auto-generated method stub
		rootNode = new DefaultMutableTreeNode("Attribute List");
		tree = new JTree(rootNode);
		scrollPaneForTree = new JScrollPane(tree);
		treeModel = (DefaultTreeModel) tree.getModel();
		
		declareNodes();		
	}

	private void declareNodes() {
		// TODO Auto-generated method stub
		authorNode = new DefaultMutableTreeNode("Author");
		pressNode = new DefaultMutableTreeNode("Press");
		tagRootNode = new DefaultMutableTreeNode("Tag");
		tag1Node = new DefaultMutableTreeNode("1st tag");
		tag2Node = new DefaultMutableTreeNode("2nd tag");
		tag3Node = new DefaultMutableTreeNode("3rd tag");
	}

	private void declareMenuBox() {
		// TODO Auto-generated method stub
		menuBox = Box.createHorizontalBox();
		declareUserBox();
		declareFuntionBox();
	}

	private void declareFuntionBox() {
		// TODO Auto-generated method stub
		funtionBox = Box.createVerticalBox();
		declareBasicBox();
		declareSearchBox();
	}

	private void declareBasicBox() {
		// TODO Auto-generated method stub
		basicBox = Box.createHorizontalBox();
		
		add = new Button("add");
		delete = new Button("delete");
		info = new Button("info");
		comment = new Button("comment");
		upload = new Button("upload");
		download = new Button("download");
		search = new Button("search");
	}

	private void declareSearchBox() {
		// TODO Auto-generated method stub
		searchBox = Box.createHorizontalBox();
		
		searchText = new JTextField();
		local = new Button("local");
		online = new Button("online");
	}

	private void declareUserBox() {
		// TODO Auto-generated method stub
		userBox = Box.createVerticalBox();
		login = new Button("login");
		setting = new Button("setting");
	}

}
