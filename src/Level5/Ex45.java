package Level5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		
		 //Dada uma sequência de nºs, imprimir na ordem inversa em que a leitura foi realizada
		 

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        List<Integer> myList = new ArrayList<>();
        Integer vect[] = new Integer[n];

        for (int i = 0; i<vect.length;i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            vect[i] = sc.nextInt();
        }

        Collections.addAll(myList, vect);
        Collections.reverse(myList);
        System.out.println(myList);
        
        sc.close();
	}

}
