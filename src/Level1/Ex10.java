package Level1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// Ler 2 numeros e informar relacionamento entre eles (iguais, não iguais, maior, menor)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.print("Digite mais um número (pode repetir): ");
		int n2 = sc.nextInt();
		
		System.out.println();
		System.out.println("****RESULTADOS****");
		System.out.println(n1 + " é igual a " + n2 + "? " + (n1 == n2 ? true : false ));
		System.out.println(n1 + " é maior que " + n2 + "? " + (n1 > n2 ? true : false ));
		System.out.println(n2 + " é maior que " + n1 + "? " + (n2 > n1 ? true : false ));
		System.out.println(n1 + " é maior ou igual a " + n2 + "? " + (n1 >= n2 ? true : false ));
		System.out.println(n2 + " é maior ou igual a " + n1 + "? " + (n2 >= n1 ? true : false ));
		System.out.println(n2 + " é menor ou igual a " + n1 + "? " + (n2 <= n1 ? true : false ));
		System.out.println(n1 + " é menor ou igual a " + n2 + "? " + (n1 <= n2 ? true : false ));
		sc.close();

	}

}
