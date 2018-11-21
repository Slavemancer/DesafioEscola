package main;

import java.util.Random;
import java.util.Scanner;

public class Main  {
	
	public static void main(String[] args) {
		String[] opcoes = {"Tesoura","Papel","Pedra","Lagarto","Spock"};
		String[] verificacao= new String[opcoes.length*2];
		Random rnd = new Random();
		int jogadaJogador=0;
		int jogadaComputadorInt = (int)rnd.nextInt(5);
		Scanner Teclado= new Scanner(System.in);
		
		for(int i=0; i<=(opcoes.length)*2-1;i+=1) {
			//System.out.println(i);
			if (i<=4) {
				verificacao[i]=opcoes[i];
			}else {
				verificacao[i]=(opcoes[(i-5)]);				
			}
		}
		do {
			for(int i=0; i<=(opcoes.length)-1;i+=1) {
				System.out.println(i + " : "+opcoes[i]);
			}
			System.out.println();
			System.out.println("Introduza o numero correspondente á opção que pretende jogar");
			jogadaJogador = Teclado.nextInt();
			System.out.println();
			if(jogadaJogador<0 ||  jogadaJogador>4) {
				System.out.println("Introduziu um valor inv�lido");
			}
		}while(jogadaJogador<0 ||  jogadaJogador>4);
		
		Teclado.close();
		
		if(jogadaJogador==jogadaComputadorInt) {
			System.out.println("Empate , ambos jogaram "+opcoes[jogadaComputadorInt]);
		}else if(jogadaComputadorInt==jogadaJogador+1 || jogadaComputadorInt==jogadaJogador+3) {
			System.out.println("Ganhaste , "+opcoes[jogadaJogador]+" vence "+opcoes[jogadaComputadorInt]);
		}else {
			System.out.println("Perdeste , "+opcoes[jogadaComputadorInt]+" vence "+opcoes[jogadaJogador]);
		}
		System.out.println();
	}

}
