package kostana.maksic;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> ll = new LinkedList<String>();
		
		//dodavanje elemenata u povezanoj listi
		ll.add("A");
		ll.add("B");
		
		ll.add(2, "C");
		
		System.out.println("Elementi povezane liste su: " + ll);
		
		//Brisanje elementa iz povezane liste
		ll.remove(0);
		ll.remove("B");
		
		System.out.println("Povezana lista nakon brisanja elemenata: " + ll);
	
	ll.add("D");
	ll.add("E");
	ll.add("F");
	
	//Unutar intergfejsa, indeskiranje ide od 0. ?

	System.out.println("Elementi povezane liste su: " + ll);
	
	//Trazenje elemenata u povezanoj listi
	boolean sadrzi = ll.contains("E");
	if(sadrzi == true) {
		System.out.println("Lista sadrzi element E. ");
	}
	else {
		System.out.println("Lista ne sadrzi element E. ");
	}
	
	//Pristupanje (uzimanje) vrednosti elementa iz povezane liste
	String element = ll.get(3);
	System.out.println("Zatrazen element je: " + element);
	
	//postavljanje elemenata u povezanoj listi
	ll.set(1, "Z");
	System.out.println("Povezana lista nakon promene: " + ll);
	
	}

}
