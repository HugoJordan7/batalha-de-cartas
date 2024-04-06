package main;

import java.util.ArrayList;

public class Player {
	private String nome;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private int score = 5;
	
	public Player(String nome) {
		this.nome = nome;
	}
	
	public int getQuantCartas() {
		return cartas.size();
	}
	
	public Carta getCarta(int i) {
		return cartas.get(i);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void ganhouCarta() {
		score++;
	}
	
	public void perdeuCarta() {
		score--;
	}
	
	public void setCarta(Carta carta) {
		if(cartas.size() == 5) {
			System.out.println("O jogador " + nome + " já possui 5 cartas");
		} else{
			cartas.add(carta);
		}
	}
	
	public boolean jogarCarta(int pos, Tabuleiro tabuleiro, int i, int j) {
		boolean isRegistred = tabuleiro.registrarCarta(cartas.get(pos), i, j);
		if(isRegistred) cartas.remove(pos);
		return isRegistred;
	}

	public int getScore() {
		return score;
	}
	
}
