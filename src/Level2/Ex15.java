package Level2;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		/* Ler 4 notas escolares. Se a média for >=7, aprovado
		 * Se a média for < 7, solicitar nota de recuperação
		 *Soma a recuperação com a media e obter nova media
		 * Se a nova media for >=7, aprovado. Se não, reprovado
		*/

		
		Scanner sc = new Scanner(System.in);
		
		
		int soma = 0;
		int media = 0;
		int[] notas = new int[4];
		int novaMedia = 0;
		
		for(int i = 0; i<notas.length; i++ ) {
		System.out.print("Digite a " + (i +1) + "ª nota do aluno: ");
		notas[i] = sc.nextInt();
		soma += notas[i];
		}
		
		media = soma / 4;
		if (media >= 7) {
			System.out.println("Aluno aprovado sem recuperação.");
		}
		
		if(media < 7) {
			System.out.print("Insira  a nota de recuperação do aluno: ");
			int recuperação = sc.nextInt();
			novaMedia = recuperação+= media;

			if(novaMedia >= 7) {
				System.out.println("Aluno aprovado na recuperação.");
			}
			else if(novaMedia < 7) {
				System.out.println("Aluno reprovado.");
			}
		}
		

		
		
		sc.close();
	}

}
