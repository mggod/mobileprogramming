package kr.ac.kookmin.lab03;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void getX(int x) {
		this.x = x;
	}
	
	public void getY(int y) {
		this.y = y;
	}
	
	public int setX() {
		return this.x;
	}
	
	public int setY() {
		return this.y;
	}
}
