package main;

public class miniav1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10; int n2=20; int n3=n1/2;
		int min=(n2-1) %n3;
		int max=(n2-1)/2;
		
		System.out.println("Exemplo \n");
		
		for (int i = min; i <= max; i++) {
			for (int j = i+1; j <= max; j++) {
				System.out.print("("+i+","+j+")");
			}
			System.out.println("\n");
		}
	}

}
