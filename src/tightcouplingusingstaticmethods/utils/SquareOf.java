package tightcouplingusingstaticmethods.utils;

public class SquareOf {
	Circle c;
	public SquareOf(Circle c) {
		this.c = c;
	}
	
	public float square() {
		return this.c.square();
	}
}
