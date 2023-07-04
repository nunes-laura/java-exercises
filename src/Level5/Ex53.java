package Level5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		
		/*	Programa recebe o nº de voltas de uma corrida
		 * 	Registra o tempo de cada corrida e imprime:
		 * - Melhor tempo
		 * - Melhor volta
		 * - Tempo media das voltas
		 */

		Scanner sc = new Scanner(System.in);

		
		List<Integer> list = new ArrayList<>();
		System.out.print("Digite o nº de voltas da corrida: ");
		int n = sc.nextInt();
		while (n == 0 || n < 0) {
			System.out.print("Valor inválido! Tente novamente: ");
			n = sc.nextInt();
		}
		int melhorVolta = 0;
		int melhorTempo = 0;
		int soma = 0;

		Integer[] tempos = new Integer[n];

		for (int i = 0; i < tempos.length; i++) {
			System.out.print("Digite o tempo em minutos da " + (i + 1) + "ª volta: ");
			tempos[i] = sc.nextInt();
			while (tempos[i] == 0) {
				System.out.print("O valor não pode ser nulo. Digite novamente: ");
				tempos[i] = sc.nextInt();
			}
			soma += tempos[i];
			if (i == 0 || tempos[i]<melhorTempo) {
				melhorVolta = (i+1);
				melhorTempo = tempos[i];
			}

		}

		Collections.addAll(list, tempos);
		Collections.sort(list);

		System.out.println();
		System.out.println("Melhor tempo: " + list.get(0) + "min");
		System.out.println("Tempo médio das " + tempos.length + " voltas : " + soma / tempos.length + "min");
		System.out.println("Melhor volta: " + melhorVolta + "ª");
		
		
		sc.close();

	}

}
