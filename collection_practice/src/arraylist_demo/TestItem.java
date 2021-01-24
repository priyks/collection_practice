package arraylist_demo;

import java.util.ArrayList;
import java.util.Collections;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Item> myitem=new ArrayList<>();
		myitem.add(new Item(1,"pen",25.00f));
		myitem.add(new Item(3,"pencil",10.0f));
		myitem.add(new Item(2,"notebook",500.00f));
		myitem.add(new Item(4,"writing pad",70.00f));
		myitem.add(new Item(5,"color box",500.00f));
		myitem.add(new Item(6,"bag",650.00f));
		
		Collections.sort(myitem);
		
		for(Item i: myitem) {
			
			System.out.println(i);
			
		}
		

	}

}
