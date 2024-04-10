package main;

import java.util.Random;

public class Tabuleiro {
	private Carta[][] matriz = new Carta[3][3];
	
	public Tabuleiro() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				matriz[i][j] = new Carta(0,0,0,0,null);
			}
		}
	}
	
	public Carta[] getLinhaDeCartas(int i) {
		return matriz[i];
	}

	public boolean jogarCarta(Carta carta, int i, int j) {
		matriz[i][j] = carta;
		analisarCartasProximas(carta, i, j);
		return true;
	}
	
	public void analisarCartasProximas(Carta carta, int i, int j) {
		if(i-1 >= 0 && carta.getTop() > matriz[i-1][j].getBottom()) {
			tomarCartaProxima(carta, matriz[i-1][j]);
		}
		if(i+1 <= 2 && carta.getBottom() > matriz[i+1][j].getTop()) {
			tomarCartaProxima(carta, matriz[i+1][j]);
		}
		if(j-1 >= 0 && carta.getLeft() > matriz[i][j-1].getRight()) {
			tomarCartaProxima(carta, matriz[i][j-1]);
		}
		if(j+1 <= 2 && carta.getRight() > matriz[i][j+1].getLeft()) {
			tomarCartaProxima(carta, matriz[i][j+1]);
		}
	}
	
	private void tomarCartaProxima(Carta cartaJogada, Carta cartaProxima) {
		if(cartaProxima.getPlayer() != null) {
			cartaJogada.getPlayer().ganhouCarta();
			cartaProxima.getPlayer().perdeuCarta();
			cartaProxima.setPlayer(cartaJogada.getPlayer());
		}
	}
	
	public void distribuirCartas(Player player) {
		Random random = new Random();
		for(int i = 0; i<5; i++) {
			int top = random.nextInt(10) +1;
			int bottom = random.nextInt(10) +1;
			int left = random.nextInt(10) +1;
			int right = random.nextInt(10) +1;
			Carta carta = new Carta(top,bottom,left,right,player);
			player.setCarta(carta);
		}
	}
	
	public boolean isIndexValid(int i, int j) {
		if(i <= 2 && i >= 0 && j <= 2 && j >= 0) {
			return true;
		}
		System.out.println("Posição do tabuleiro inválida!");
		return false;
	}
	
	public boolean isPlaceEmpty( int i, int j) {
		if(matriz[i][j].getTop() != 0) {
			System.out.println("O jogador não pode jogar uma carta em cima de outra!");
			return false;
		} 
		return true;
	}

}
