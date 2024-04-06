package main;

public class Carta{
	int top;
	int bottom;
	int left;
	int right;
	Player player;
	
	public Carta(int top, int bottom, int left, int right, Player player) {
		this.top = top;
		this.bottom = bottom;
		this.left = left;
		this.right = right;
		this.player = player;
	}
}
