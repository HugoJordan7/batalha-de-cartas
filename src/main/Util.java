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
		int t = c1.getTop();
		int b = c1.getBottom();
		int l = c1.getLeft();
		int r = c1.getRight();
		System.out.println(" _____ " );
		System.out.println("|  "+(is10(t) ? "A": t)+"  |");
		System.out.println("|"+(is10(l) ? "A": l)+"   "+(is10(r) ? "A": r)+"|" ); 
		System.out.println("|  "+(is10(b) ? "A": b)+"  |");
		System.out.println("|_____|");
	}
	
	
	private static boolean is10(int num) {
		if(num == 10) return true;
		else return false;
	}
	
	public static void imprimirTresCartas(Carta c1, Carta c2, Carta c3) {
		int t1 = c1.getTop();
		int b1 = c1.getBottom();
		int l1 = c1.getLeft();
		int r1 = c1.getRight();
		int t2 = c2.getTop();
		int b2 = c2.getBottom();
		int l2 = c2.getLeft();
		int r2 = c2.getRight();
		int t3 = c3.getTop();
		int b3 = c3.getBottom();
		int l3 = c3.getLeft();
		int r3 = c3.getRight();
		String p1 = "  ";
		String p2 = "  ";
		String p3 = "  ";
		if(c1.getPlayer() != null) {
			p1 = c1.getPlayer().getNome();
		}
		if(c2.getPlayer() != null) {
			p2 = c2.getPlayer().getNome();
		}
		if(c3.getPlayer() != null) {
			p3 = c3.getPlayer().getNome();
		}
		System.out.println((is0(t1) ? "  " : p1) + "         " + (is0(t2) ? "  " : p2) + "         " + (is0(t3) ? "  " : p3));
		System.out.println(" _____ " + "    " + " _____ " + "    " + " _____ ");
		System.out.println("|  "+(is10(t1) ? "A": t1)+"  |" + "    " + "|  "+(is10(t2) ? "A": t2)+"  |" + "    " + "|  "+(is10(t3) ? "A": t3)+"  |");
		System.out.println("|"+(is10(l1) ? "A": l1)+"   "+(is10(r1) ? "A": r1)+"|" + "    " + "|"+(is10(l2) ? "A": l2)+"   "+(is10(r2) ? "A": r2)+"|" + "    " + "|"+(is10(l3) ? "A": l3)+"   "+(is10(r3) ? "A": r3)+"|"); 
		System.out.println("|  "+(is10(b1) ? "A": b2)+"  |" + "    " + "|  "+(is10(b2) ? "A": b2)+"  |" + "    " + "|  "+(is10(b3) ? "A": b3)+"  |");
		System.out.println("|_____|" + "    " + "|_____|" + "    " + "|_____|");
	}
	
	public static boolean is0(int num){
		if(num == 0) return true;
		else return false;
	}
	
}
