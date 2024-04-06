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
	
	public static void imprimirCarta(Carta c1) {
		System.out.println(" _____ " );
		System.out.println("|  "+c1.getTop()+"  |");
		System.out.println("|"+c1.getLeft()+"   "+c1.getRight()+"|" ); 
		System.out.println("|  "+c1.getBottom()+"  |");
		System.out.println("|_____|");
	}
	
	public static void imprimirTresCartas(Carta c1, Carta c2, Carta c3) {
		System.out.println(" _____ " + "    " + " _____ " + "    " + " _____ ");
		System.out.println("|  "+c1.getTop()+"  |" + "    " + "|  "+c2.getTop()+"  |" + "    " + "|  "+c3.getTop()+"  |");
		System.out.println("|"+c1.getLeft()+"   "+c1.getRight()+"|" + "    " + "|"+c2.getLeft()+"   "+c2.getRight()+"|" + "    " + "|"+c3.getLeft()+"   "+c3.getRight()+"|"); 
		System.out.println("|  "+c1.getBottom()+"  |" + "    " + "|  "+c2.getBottom()+"  |" + "    " + "|  "+c3.getBottom()+"  |");
		System.out.println("|_____|" + "    " + "|_____|" + "    " + "|_____|");
	}
	
}
