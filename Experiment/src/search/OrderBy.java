package search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class OrderBy {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos deseja cadastrar? ");
		int cad = input.nextInt();
		
		for(int i=0;i<cad;i++) {
			System.out.print("digite o numero a ser armazenado: ");
			numbers.add(input.nextInt());
		}
		
		numbers.sort(Comparator.naturalOrder());
		System.out.println("Ordenado: "+numbers.toString());
		
		input.close();
	}
}
