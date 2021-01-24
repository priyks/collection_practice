package arraylist_demo;

public class Item implements Comparable<Item>{
	
	int itemno;
	String Name;
	float price;
	
	public Item(int itemno, String name, float price) {
		super();
		this.itemno = itemno;
		Name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Item o) {
		
		
		return this.price>o.price?-1:this.price<o.price?1:0;
		
	}

	@Override
	public String toString() {
		return "Item [itemno=" + itemno + ", Name=" + Name + ", price=" + price + "]";
	}
	
	
	
	
	

}
