package exerciciosFixacao;

public class ExUm {
	
	public static void main(String args[]) {
		
		int soma = 0;
		
		for(int i=1; i<501; i++) {
			
			if(i%2 != 0 && i%3 == 0) {
				soma = soma + i;
			}
		}
		
		System.out.print("A soma dos �mpares m�ltiplos de 3 �: ");
		System.out.print(soma);
	}

}
