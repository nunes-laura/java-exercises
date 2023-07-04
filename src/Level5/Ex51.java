package Level5;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		
		/*	Ler uma quantidade N de alunos e a nota de cada um deles
		 * 	Calcular e imprimir a media dos alunos
		 * 	Se nenhuma nota for maior que 5, imprimir mensagem
		 */	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos há na turma? ");
        int n = sc.nextInt();

        double soma = 0;
        double media = 0;
        int contador = 0;
        int contador2 = 0;

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            vect[i] = sc.nextInt();
            soma += vect[i];
            if (vect[i] > 7) {
                contador++;
            }
            if (vect[i] < 5) {
                contador2++;
            }
            media = soma / vect.length;
        }

            System.out.println();
            System.out.println("A média da turma é de: " + media);
            System.out.println("A quantidade de alunos com notas maiores que sete é de: " + contador);
            if (contador2 == vect.length) {
                System.out.println("Nenhum aluno tirou nota acima de 5!");
            }
		
		
		
		sc.close();

	}

}
