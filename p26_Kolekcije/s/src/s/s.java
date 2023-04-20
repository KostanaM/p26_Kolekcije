package s;

import java.util.Scanner;

public class s {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Unesite n: ");
		int n = sc.nextInt();
		
		int x[][] = new int[n][n];
		
		System.out.println("Matrica: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i+j == n-1)
					x[i][j] = 1;
					else 
						x[i][j] = 0;
			
			System.out.print(x[i][j]+ " ");
			}
			System.out.println();
			
		}
		sc.close();
	}

}
