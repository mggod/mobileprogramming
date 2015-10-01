package kr.ac.kookmin.lab03;

<<<<<<< HEAD
public abstract class Shape {
	protected Point center;
	
	public Point getCenter()
	{
		return center;
	}
	public abstract Rectangle getBounds();
	public abstract void draw(Graphics g);
}
=======
public class Shape {
	protected Point center;
	
	public Shape(Point center) {
		this.center = center;
	}
}
>>>>>>> branch 'master' of https://github.com/mggod/mobileprogramming.git
