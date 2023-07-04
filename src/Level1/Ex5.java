package Level1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		/*Calcular quantidde de L de combustível gasta uma viagem
		* Carro faz 12km por L
		* Usário fornecer tempo gasto na viagem e velocidade media
		* Distancia = tempo * velocidade
		* L gastos = distancia / 12  
		*/
		
		Scanner sc = new Scanner(System.in);
		
		final int AUTONOMIA = 12;
		
		System.out.print("Digite quanto tempo foi gasto na viagem: ");
		int tempo = sc.nextInt();
		System.out.print("Digite a velocidade média: ");
		int velocidade = sc.nextInt();
		
		int distancia = tempo * velocidade;
		int litros = distancia / AUTONOMIA;
		
		System.out.println();
		System.out.println("****RESULTADOS****");
		System.out.println("O tempo gasto na viagem foi de " + tempo + "h e a velocidade média foi de " + velocidade + "km/h");
		System.out.println("A distância percorrida foi de: " + distancia + "km");
		System.out.println("A quantidade de litros gastos foi de: " + litros + "L");
		
		
		sc.close();

	}

}
