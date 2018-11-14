package main;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JComboBox;

public class Main  {
	
	public static void main(String[] args) {
		String[] opcoes = {"Pedra","Papel","Tesoura","Spock","Lagarto"};
		String[] verificacao= new String;
		Random rnd = new Random();
		int jogadaJogador=0;
		int jogadaComputadorInt = (int)rnd.nextInt(5);
		
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
			Scanner Teclado= new Scanner(System.in);
			jogadaJogador = Teclado.nextInt();
			System.out.println();
			if(jogadaJogador<0 ||  jogadaJogador>4) {
				System.out.println("Introduziu um valor inválido");
			}
		}while(jogadaJogador<0 ||  jogadaJogador>4);
		
		if(jogadaJogador==jogadaComputadorInt) {
			System.out.println("Empate , ambos jogaram "+opcoes[jogadaComputadorInt]);
		}else if(jogadaComputadorInt==jogadaJogador+1 || jogadaComputadorInt==jogadaJogador+3) {
			System.out.println("Ganhaste , "+opcoes[jogadaJogador]+" vence "+opcoes[jogadaComputadorInt]);
		}else {
			System.out.println("Perdeste , "+opcoes[jogadaJogador]+" vence "+opcoes[jogadaJogador]);
		}
		
		System.out.println(jogadaJogador);
	}

}
