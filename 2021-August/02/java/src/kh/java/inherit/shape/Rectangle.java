package kh.java.inherit.shape;

public class Rectangle extends Shape {

	// { leftTop, rightTop, rightBottom, leftBotton }
	private Point[] points;
	private int width;
	private int height;

	Rectangle() {

	}

	Rectangle(Point[] points, int width, int height) {
		this.points = points;
		this.width = width;
		this.height = height;
	}

	public Point[] getPoints() {
		return this.points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("네 꼭지점이 %s, %s, %s, %s이고, 너비가 %d, 높이가 %d인 사각형을 그린다.%n", points[0], points[1], points[2],
				points[3], this.width, this.height);

	}

	@Override
	public double getArea() {
		return this.width * this.height;

	}

	@Override
	public String toString() {
		return String.format("points=[%s, %s, %s %s], width=%d, height=%d", points[0], points[1], points[2], points[3],
				this.width, this.height);

	}

}