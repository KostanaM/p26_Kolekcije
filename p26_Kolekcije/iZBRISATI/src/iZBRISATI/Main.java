package iZBRISATI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	String imena []= {"Zika", "Mika", "Una"};
	
	List<String> listaImena = new ArrayList<String>();
		for(String s : imena)
		listaImena.add(s);
		
		String imenaBrisanje [] = { "Una"};
		List<String>listazaBrisanje = new ArrayList<String>();
		for (String s : imenaBrisanje)
			listazaBrisanje.add(s);
		
		Iterator<String> itr = listaImena.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		itr=listaImena.iterator();
		while(itr.hasNext())
			if(listazaBrisanje.contains(itr.next()))
				itr.remove();
		
		
	}
}
