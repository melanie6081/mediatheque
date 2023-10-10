package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();
	private final ItemVisitor v= new CatalogPrinter();
	private final ItemVisitor vCD= new CDPrinter();
	private final ItemVisitor vBook= new BookPrinter();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		//for (Item i : items)
		//	i.print();
		for (Item i : items){
			i.accept(v);
		}
	}
	
	public void printOnlyBooks() {
		// throw new UnsupportedOperationException("Not supported yet.");
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
		for (Item i : items){
			i.accept(vBook);
		}
	}

	public void printOnlyCDs() {
		for (Item i : items){
			i.accept(vCD);
		}
	}


}
