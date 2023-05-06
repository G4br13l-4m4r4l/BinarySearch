package search;

import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How long will be the list? ");
		int lista = input.nextInt();
		
		int[] vetor = new int[lista];
		
		for(int i = 0;i<vetor.length;i++) {
			vetor[i] = i;
		}
		
		System.out.print("What's your number? ");
		int advinha = input.nextInt();
		int cont = 0;
		
		boolean achar = false;
		
		int inicio = 0;
		int fim = vetor.length -1;
	
		int meio =0;
		
		while(inicio <= fim) {
			meio = (int) ((fim + inicio)/2);
			
			if(vetor[meio] == advinha) {
				achar = true;
				cont++;
				break;
			}else if(vetor[meio]< advinha) {
				inicio = meio+1;
				cont++;
			}else {
				fim = meio-1;
				cont++;
			}		
		}
		
		if(achar == true) {
			System.out.println(vetor[meio]);
			System.out.println("Was found in  " + cont + " times");
		}else {
			System.out.println("Not found!");
		}
		
		input.close();
	}
}
