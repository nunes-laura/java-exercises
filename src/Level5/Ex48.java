package Level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		
		/*	Programa recebe nome e idade de 20 modelos
		 * 	Informar quais modelos são aptas, ou seja: Apenas modelos entre 18-20 anos
		 * 	Imprimir nome das modelos aptas
		 */	

		Scanner sc = new Scanner(System.in);
		
		String[] nome = new String[20];
        int[] idade = new int[20];
        
        List<String> list = new ArrayList<>();

        for(int i = 0; i<nome.length; i++){
            System.out.print("Digite o nome da candidata " + (i+1) + " : " );
            nome[i] = sc.nextLine();
          
            System.out.print("Digite a idade da candidata " + (i+1) + " : ");
            idade[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------");

            if (idade[i] > 17 && idade[i] < 21){
                list.add(nome[i]);
            }

        }

        System.out.println("***CANDIDATAS APTAS*** ");
        System.out.println(list);

		
		
		sc.close();
	}

}
