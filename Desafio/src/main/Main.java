package main;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JComboBox;

public class Main  {
	
	public static void main(String[] args) {
		String[] opcoes = {"Pedra","Papel","Tesoura","Spock","Lagarto"};
		List lista=new List();
		Scanner Teclado= new Scanner(System.in);
		Random rnd = new Random();
		int jogadaJogador=0;
		int jogadaComputadorInt = (int)rnd.nextInt(5);
		
		for(int i=0; i<=(opcoes.length)*2-1;i+=1) {
			//System.out.println(i);
			if (i<=4) {
				lista.add(opcoes[i]);
			}else {
				lista.add(opcoes[(i-5)]);				
			}
		}
		
		for(int i=0; i<=(opcoes.length)*2-1;i+=1) {
			System.out.println(i + " : "+opcoes[i]);
		}
		jogadaJogador = Teclado.nextInt();
		System.out.println(jogadaJogador);
	}

}
