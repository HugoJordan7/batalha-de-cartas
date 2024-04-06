package main;

import java.util.Random;

public class Tabuleiro {
	
	private Carta[][] matriz = new Carta[3][3];

	public void registrarCarta(Carta carta, int i, int j) {
		matriz[i][j] = carta;
	}
	
	public void criarCartas(Player p1, Player p2) {
		Random random = new Random();
		for(int i = 0; i<5; i++) {
			int top = random.nextInt(10) +1;
			int bottom = random.nextInt(10) +1;
			int left = random.nextInt(10) +1;
			int right = random.nextInt(10) +1;
			Carta carta = new Carta(top,bottom,left,right,p1);
			p1.setCarta(carta);
		}
		for(int i = 0; i<5; i++) {
			int top = random.nextInt(10) +1;
			int bottom = random.nextInt(10) +1;
			int left = random.nextInt(10) +1;
			int right = random.nextInt(10) +1;
			Carta carta = new Carta(top,bottom,left,right,p2);
			p2.setCarta(carta);
		}
	}

}
