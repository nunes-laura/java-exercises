package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		// Ler 3 valores e escrever em ordem crescente e descrescente
		
		Scanner sc = new Scanner(System.in);
				
		//Vector list = new Vector();
		
		Integer[] valores = new Integer [3];
		
		for (int i = 0; i<valores.length; i++) {
			System.out.print("Digite o " + (i+1) + "º valor: ");
			valores[i] = sc.nextInt();}
		
		//list.add(valores[0]);
		//list.add(valores[1]);
		//list.add(valores[2]);
		
		ArrayList<Integer> myList = new ArrayList<>();
		Collections.addAll(myList, valores);
		
		System.out.println();
		System.out.println("***RESULTADOS***");
		
		Collections.sort(myList);
		System.out.println("Valores na ordem crescente: " + myList); //list
		
		Collections.reverse(myList);
		System.out.println("Valores na ordem decrescente: " + myList); //list
		
		
		
		sc.close();
	
	}
	

}

