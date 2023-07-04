package Level4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		
		/* Informar menor valor e maior valor de uma coleção.
		 * 0 encerra o programa
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		List<Integer> list = new ArrayList<>();
		do {
		System.out.print("Digite o valor desejado(O valor 0 encerra a operação):  ");
		n = sc.nextInt();
		list.add(n);
		Collections.sort(list);
		
		
		}while(n != 0);
		
		System.out.println("***RESULTADOS***");
		System.out.println("O menor valor é: " + list.get(1));
		System.out.println("O maior valor é: " + list.get(list.size()-1));
		
		sc.close();

	}

}
