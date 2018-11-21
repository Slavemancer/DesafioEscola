package main;

import java.util.Random;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int jogadaComputadorInt = (int)rnd.nextInt(5);
		for (int i = 0; i < 10; i++) {
			jogadaComputadorInt = (int)rnd.nextInt(5);
			System.out.println(jogadaComputadorInt);
		}
		
	}

}
