package main;

public class Player {
	private String nome;
	private Carta[] cartas = new Carta[5];
	private int lastIndex = 0;
	
	public Player(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCarta(Carta carta) {
		if(lastIndex == 5) {
			System.out.println("O jogador " + nome + " já possui 5 cartas");
		} else{
			cartas[lastIndex] = carta;
			lastIndex++;
		}
	}
	
	public void jogarCarta(int pos, Tabuleiro tabuleiro, int i, int j) {
		if(i <= 2 && i >= 0 && j <= 2 && j >= 0) {
			System.out.println("Posição do tabuleiro inválida!");
		} else {
			tabuleiro.registrarCarta(cartas[pos], i, j);
		}
		
	}
	
}
