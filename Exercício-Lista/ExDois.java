package exerciciosFixacao;

public class ExDois {
	
	public static void main(String args[]) {
		
		for (int i = 1000; i < 2000; i++) {
			if(i%11 == 0 || i%11 == 5) {
				System.out.println(i);
			}
		}
	}

}
