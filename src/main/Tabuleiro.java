package main;

import java.util.Random;

public class Tabuleiro {
	private int quantCartas = 0;
	private Carta[][] matriz = new Carta[3][3];
	
	public Tabuleiro() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				matriz[i][j] = new Carta(0,0,0,0,null);
			}
		}
	}
	
	public int getQuantCartas() {
		return quantCartas;
	}
	
	public Carta getCarta(int i, int j) {
		return matriz[i][j];
	}

	public void registrarCarta(Carta carta, int i, int j) {
		if(!isIndexValid(i, j)) return;
		if(matriz[i][j].getTop() != 0) {
			System.out.println("O jogador não pode jogar uma carta em cima de outra!");
			return;
		} 
		quantCartas++;
		matriz[i][j] = carta;
		analisarCartasProximas(carta, i, j);
	}
	
	public void analisarCartasProximas(Carta carta, int i, int j) {
		if(carta.getTop() > matriz[i-1][j].getBottom()) {
			alterarMatriz(carta, i-1, j);
		}
		if(carta.getBottom() > matriz[i+1][j].getTop()) {
			alterarMatriz(carta, i+1, j);
		}
		if(carta.getLeft() > matriz[i][j-1].getRight()) {
			alterarMatriz(carta, i, j-1);
		}
		if(carta.getRight() > matriz[i][j+1].getLeft()) {
			alterarMatriz(carta, i, j+1);
		}
	}
	
	private void alterarMatriz(Carta carta, int i, int j) {
		if(isIndexValid(i, j)) {
			if(matriz[i][j].getPlayer() != null) {
				matriz[i][j].getPlayer().perdeuCarta();
			}
			matriz[i][j].setPlayer(carta.getPlayer());
			matriz[i][j].getPlayer().ganhouCarta();
		}
	}
	
	private boolean isIndexValid(int i, int j) {
		if(i <= 2 && i >= 0 && j <= 2 && j >= 0) {
			return true;
		}
		System.out.println("Posição do tabuleiro inválida!");
		return false;
	}
	
	public void destribuirCartas(Player player) {
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

}
