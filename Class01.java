package test;

abstract class CShape {
	protected String color;

	public CShape(String str) {
		color = str;
	}

	public abstract void show();
}

class CRectangle extends CShape {
	int width, height;

	public CRectangle(int w, int h) {
		super("Yellow");
		width = w;
		height = h;
	}

	public void show() {
		System.out.print("color=" + color + ", ");
		System.out.println("area=" + width * height);
	}
}

class CCircle extends CShape {
	double radius;

	public CCircle(double r) {
		super("Green");
		radius = r;
	}

	public void show() {
		System.out.print("color=" + color + ", ");
		System.out.println("area=" + 3.14 * radius * radius);
	}
}

public class hw11_1 {
	public static void main(String args[]) {
		CRectangle rect = new CRectangle(5, 10);
		rect.show();

		CCircle cir = new CCircle(2.0);
		cir.show();
	}
}
