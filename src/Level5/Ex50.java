package Level5;

import java.util.Random;
import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		
		/*	Programa sorteia um nº entre 0 e 100 e permite que o usuário tente acerta
		 * 	Enquanto ele não acerta, imprimir mensagem.
	 	 * 	Quando acertar, imprimir mensagem  de sucesso.	 
	 	 */	
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
        int aleatorio = r.nextInt(99) + 1;

        int n;
        int soma = 0;
        do {
            System.out.print("Digite um valor: ");
            n = sc.nextInt();

            if (n > aleatorio) {
                System.out.println("Ops, esse nº é maior que o sorteado :(");
                soma++;
                System.out.println();
            } else if (n < aleatorio) {
                System.out.println("Ops, esse nº é menor que o sorteado :(");
                soma++;
                System.out.println();
            } else {
                System.out.println("Parabéns! O nº " + n + " é o sorteado!");
                soma++;
                System.out.println();
            }
        } while (n != aleatorio);

        System.out.println("Número de tentativas realizadas: " + soma);
		
		
		sc.close();

	}

}
