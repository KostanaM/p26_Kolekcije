package kostana.maksic;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String imena[] = {"Mika", "Zika", "Fica"};
				
		List<String> listaImena = new LinkedList<String>();
		for(String s : imena)
		listaImena.add(s);
		
		System.out.println("Prva lista: " + listaImena);
		
		String imena1[] = {"Ana", "Lena", "Hana", "Una"};
		List<String> listaImena1 = new LinkedList<String>();
		for(String ime : imena1)
		listaImena1.add(ime);
		
		System.out.println("Druga lista: " + listaImena1);
		
		listaImena.addAll(listaImena1);
		System.out.println("Nova lista: " + listaImena);
		
		//listaImena.sublist(1, 4).clear();
		listaImena.subList(0, 2).clear();
		
		//subList(indexFrom, indexTo);
		//indekFrom - pocevsi od zadatog indeksa, ukljucujuci i njega
		//indeksTo - do zadatog indeksa, NE ukljucujuci i njega
		System.out.println("Lista nakon uklanjanja imena na poziciji: ");
		System.out.println(listaImena);
	}

}
