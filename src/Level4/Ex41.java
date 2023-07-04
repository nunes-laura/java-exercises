package Level4;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		
		 //Dada a idade de um nadador, classificá-lo em uma das categorias
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a idade do nadador: ");
		int idade = sc.nextInt();
		
		if (idade < 5 ) {
			System.out.println("A idade do nadador não se adequada a nenhuma categoria.");
		}
		
		else if (idade >= 5 && idade <= 7) {
			System.out.println("Categoria: Infanto A");
		}
		else if (idade >=8 && idade <= 11) {
			System.out.println("Categoria: Infanto B");
		}
		else if (idade == 12 || idade == 13) {
			System.out.println("Categoria: Juvenil A");
		}
		else if (idade >=14 && idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		}
		else {
			System.out.println("Categoria: Adulto");
		}
		
		
		sc.close();

	}

}
