package main;

import java.util.Scanner;

public class Main{
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Util.imprimirApresentacao();
		Player player1 = new Player("P1");
		Player player2 = new Player("P2");
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.distribuirCartas(player1);
		tabuleiro.distribuirCartas(player2);
		
		for(int i = 0; i<9; i++) {
			Player currentPlayer;
			if(i%2 == 0) {
				currentPlayer = player1;
			}else {
				currentPlayer = player2;
			}
			imprimirTabuleiro(tabuleiro);
			imprimirCartasDoPlayer(currentPlayer);
			if(!realizarJogada(tabuleiro, currentPlayer)) {
				i--;
			}
		}
	
	}
	
	public static boolean realizarJogada(Tabuleiro tabuleiro, Player player) {
		System.out.print(player.getNome() + " escolha uma carta para jogar: ");
		int pos = scanner.nextInt();
		System.out.print("Informe a linha do tabuleiro: ");
		int lin = scanner.nextInt();
		System.out.print("Informe a coluna do tabuleiro: ");
		int col = scanner.nextInt();
		return player.jogarCarta(pos, tabuleiro, lin, col);
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

