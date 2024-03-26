package Level5;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
	
		/* Considere vetor de 10 numeros inteiros positivos
		 * 1 numero x positivo maior que zero
		 * - Ler o vetor
		 * - Ler o numero x
		 * - Informar quantos numeros do vetor são: maiores, menores e iguais a X
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor entre 1 e 10: ");
        int valor = sc.nextInt();
        while (valor < 1|| valor > 10) {
        	System.out.println("Valor inválido! Digite novamente: ");
        	valor = sc.nextInt();
        }
        System.out.println();

        int somaMaiores = 0;
        int somaMenores = 0;
        int somaIguais = 0;
        int[] vect = new int[10];

        for(int i =0; i<vect.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vect[i] = sc.nextInt();

            if (vect[i] > valor){
                somaMaiores++;
            }

            else if(vect[i] < valor){
                somaMenores++;
            }
            else if(vect[i] == valor){
                somaIguais++;
            }
        }
        System.out.println();
        System.out.println("***RESULTADOS***");
        System.out.println("A quantidade de números maiores que " + valor + " é de: " + somaMaiores);
        System.out.println("A quantidade de números menores que " + valor + " é de: " + somaMenores);
        System.out.println("A quantidade de números iguais a " + valor + " é de: " + somaIguais);

		
		sc.close();

	}

}
