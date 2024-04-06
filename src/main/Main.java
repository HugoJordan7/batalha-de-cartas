package main;

import java.util.Scanner;

public class Main{
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Util.imprimirApresentacao();
		System.out.print("Informe o nome do player1: ");
		String nome = "hugo";
		Player player1 = new Player(nome);
		System.out.print("Informe o nome do player2: ");
		nome = "thiago";
		Player player2 = new Player(nome);
		
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.destribuirCartas(player1);
		tabuleiro.destribuirCartas(player2);
		
		
		imprimirTabuleiro(tabuleiro);
		imprimirCartasDoPlayer(player1);
		realizarJogada(tabuleiro, player1);
		imprimirTabuleiro(tabuleiro);
	
	}
	
	public static void realizarJogada(Tabuleiro tabuleiro, Player player) {
		System.out.print(player.getNome() + " escolha uma carta para jogar: ");
		int pos = scanner.nextInt();
		System.out.print("Informe a linha do tabuleiro: ");
		int lin = scanner.nextInt();
		System.out.print("Informe a coluna do tabuleiro: ");
		int col = scanner.nextInt();
		player.jogarCarta(pos, tabuleiro, lin, col);
	}
	
	public static void imprimirTabuleiro(Tabuleiro tabuleiro) {
		Util.printRow();
		for(int i = 0; i < 3; i++) {
			Carta carta1 = tabuleiro.getCarta(i, 0);
			Carta carta2 = tabuleiro.getCarta(i, 1);
			Carta carta3 = tabuleiro.getCarta(i, 2);
			Util.imprimirTresCartas(carta1, carta2, carta3);
		}
		Util.printRow();
	}
	
	public static void imprimirCartasDoPlayer(Player player) {
		for(int i = 0; i < player.getQuantCartas(); i++) {
			Util.imprimirCarta(player.getCarta(i));
		}
	}
	
}

