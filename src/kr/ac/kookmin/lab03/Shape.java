package kr.ac.kookmin.lab03;

public abstract class Shape {
	protected Point center;
	
	public Point getCenter()
	{
		return center;
	}
	public abstract Rectangle getBounds();
	public abstract void draw(Graphics g);
}
