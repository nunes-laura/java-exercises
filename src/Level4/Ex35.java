package Level4;

public class Ex35 {

	public static void main(String[] args) {
		
		/*	Programa que conte de 1 a 100 
		 * 	e a cada múltiplo de 10 exiba uma mensagem: Múltiplo de 10
		 */
		
		for (int i = 100; i>=1; i--) {
			if (i % 10 == 0) {
				System.out.println(i + " é múltiplo de 10!");
			}
		}

	}

}
