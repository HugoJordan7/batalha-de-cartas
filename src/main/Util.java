package main;

public class Util {
	
	public static void imprimirApresentacao() {
		System.out.println("Bem vindo a batalha de cartas!");
		System.out.println("1 - Cada jogador inicia com 5 cartas e deve jogar uma a cada turno em um espaço vazio");
		System.out.println("2 - Cada carta possui 4 valores um em cima, em baixo, na direita e na esquerda");
		System.out.println("3 - Ganha a carta do oponente aquele cujo valor de uma das pontas da carta for maior do que o das cartas próximas do adversário ");
		System.out.println("4 - Ganha a batalha o jogador que possuir mais cartas no tabuleiro quando ele estiver cheio");
	}
	
	public static void printRow() {
		System.out.println("-----------------------------------------------------------------");
	}
	
	public static void imprimirCartas(Carta[] cartas) {
		for (int i = 0; i < cartas.length; i++) {
			linhaDoPlayer(cartas[i]);
		}
		System.out.println();
		
		for (int i = 0; i < cartas.length; i++) {
			linhaDaBordaSuperior();
		}
		System.out.println();
		
		for (int i = 0; i < cartas.length; i++) {
			linhaDoTop(cartas[i]);
		}
		System.out.println();
		
		for (int i = 0; i < cartas.length; i++) {
			linhaDoLeftRight(cartas[i]);
		}
		System.out.println();
		
		for (int i = 0; i < cartas.length; i++) {
			linhaDoBottom(cartas[i]);
		}
		System.out.println();
		
		for (int i = 0; i < cartas.length; i++) {
			linhaDaBordaInferior();
		}
		System.out.println();
	}
	
	
	private static void linhaDoPlayer(Carta c) {
		int top = c.getTop();
		String player = is0(top) ? "  ": c.getPlayer().getNome();
		System.out.print(player + "         ");
	}
	
	private static void linhaDaBordaSuperior() {
		System.out.print(" _____ " + "    ");
	}
	
	private static void linhaDoTop(Carta c) {
		int top = c.getTop();
		System.out.print("|  "+(is10(top) ? "A": top)+"  |" + "    ");
	}
	
	private static void linhaDoLeftRight(Carta c) {
		int left = c.getLeft();
		int right = c.getRight();
		System.out.print("|" + (is10(left) ? "A": left) + "   " + (is10(right) ? "A": right) + "|" + "    ");
	}
	
	private static void linhaDoBottom(Carta c) {
		int bottom = c.getBottom();
		System.out.print("|  "+(is10(bottom) ? "A": bottom)+"  |" + "    ");
	}
	
	private static void linhaDaBordaInferior() {
		System.out.print("|_____|" + "    ");
	}
	
	public static boolean is0(int num){
		if(num == 0) return true;
		else return false;
	}
	
	private static boolean is10(int num) {
		if(num == 10) return true;
		else return false;
	}
	
}
