package Level5;

import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		
		/*	Dados 2 vetores x e y com n elementos, calcular:
		 * 	Produto escalar dos vetores = soma de todos os resultados da multiplicação de x[i] * y[i]*/
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("Digite quantos elementos terão os vetores X e Y: ");
        int x = sc.nextInt();
        int soma = 0;
        Integer[] vectX = new Integer[x];
        Integer[] vectY = new Integer[x];

        for(int i =0; i< vectX.length; i++){
            System.out.print("Digite o " + (i+1) + "º elemento do vetor X: ");
            vectX[i] = sc.nextInt();
            System.out.print("Digite o " + (i+1) + "º elemento do vetor Y: ");
            vectY[i] = sc.nextInt();
            int multi = vectX[i] * vectY[i];
            soma+=multi;
        }

        System.out.println("A soma dos produtos dos vetores é: " + soma);

        sc.close();

	}

}
