package main;

public class Carta{
	private int top;
	private int bottom;
	private int left;
	private int right;
	private Player player;
	
	public Carta(int top, int bottom, int left, int right, Player player) {
		this.top = top;
		this.bottom = bottom;
		this.left = left;
		this.right = right;
		this.player = player;
	}

	public int getTop() {
		return top;
	}

	public int getBottom() {
		return bottom;
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public Player getPlayer() {
		return player;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
}
