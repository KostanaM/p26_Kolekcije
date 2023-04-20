package iZBRISATI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ddd {
	
	Scanner sc=new Scanner (System.in);
	List<Integer> brojevi = new ArrayList<Integer>();
	
	void UnesiteBrojeve()
{
	System.out.println("Za prekid -1");
	
	while(true) {
		int n=sc.nextInt();
	if (n==-1)
	{
		return;
	}
this.brojevi.add(n);

}
	}
	
	
void IspisiteBrojeve()
	{
		System.out.println(this.brojevi);
}
	
}
	
