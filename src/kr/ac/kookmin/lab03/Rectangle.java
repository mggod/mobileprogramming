package kr.ac.kookmin.lab03;

<<<<<<< HEAD
public class Rectangle extends Shape {
	private int w;
	private int h;
	
	public Rectangle(Point center, int w, int h)
	{
		this.center = center;
		this.h = h;
		this.w = w;
	}
	public Rectangle getBounds()
	{
		return this;
	}
	public int getHeight()
	{
		return h;
	}
	public int getWidth()
	{
		return w;
	}
	public void draw(Graphics g)
	{
		g.draw(this);
	}
	public String toString()
	{
		return "Rectangle";
	}

}
=======
public class Rectangle extends shape{
	int h;
	int w;
	
	public Rectangle(Point center, int w, int h) {
		this.w = w;
		this.h = h;
	}
}
>>>>>>> branch 'master' of https://github.com/mggod/mobileprogramming.git
