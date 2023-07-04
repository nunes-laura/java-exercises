package Level5;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		
		/*	Ler 2 vetores V1 e Ve com no máximo 50 posições
		 * 	Imprimir quantas vezes V1 e V2 possuem valores idênticos nas mesmas posições
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho dos vetores V1 e V2 (Entre 1 e 50): ");
        int valor = sc.nextInt();
        while (valor < 1 || valor > 50 ){
            System.out.print("Valor não permitido! Digite novamente: ");
            valor = sc.nextInt();
        }

        int[] v1 = new int[valor];
        int[] v2 = new int[valor];
        int soma = 0;

        System.out.println();
        for (int i = 0; i<v1.length; i++){
            System.out.print("Digite o " + (i+1) + "º valor do vetor V1: ");
            v1[i] = sc.nextInt();
            System.out.print("Digite o " + (i+1) + "º valor do vetor V2: ");
            v2[i] = sc.nextInt();

            if (v1[i] == v2[i]){
                soma++;
            }

        }
        System.out.println();
        System.out.println(soma + " é o nº de vezes que os valores se repetem nas mesmas posições.");
		
		
		sc.close();

	}

}
