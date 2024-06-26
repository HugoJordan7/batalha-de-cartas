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
			if(i%2 == 0) currentPlayer = player1;
			else currentPlayer = player2;
			Util.imprimirTabuleiro(tabuleiro);
			Util.imprimirCartas(currentPlayer.getCartas());
			if(!realizarJogada(tabuleiro, currentPlayer)) i--;
		}
		Util.imprimirTabuleiro(tabuleiro);
		Util.imprimirPlacar(player1, player2);
	}
	
	public static boolean realizarJogada(Tabuleiro tabuleiro, Player player) {
		System.out.print(player.getNome() + " escolha uma carta para jogar: ");
		int pos = scanner.nextInt() -1;
		if(!player.isIndexValid(pos)) return false;
		
		System.out.print("Informe a linha do tabuleiro: ");
		int lin = scanner.nextInt() -1;
		System.out.print("Informe a coluna do tabuleiro: ");
		int col = scanner.nextInt() -1;
		if(!tabuleiro.isIndexValid(lin, col)) return false;
		if(!tabuleiro.isPlaceEmpty(lin, col)) return false;
		
		Carta carta = player.getCarta(pos);
		player.removerCarta(pos);
		return tabuleiro.jogarCarta(carta, lin, col);
	}
	
}