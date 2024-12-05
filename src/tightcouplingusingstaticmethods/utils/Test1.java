package tightcouplingusingstaticmethods.utils;

public class Test1 {
	void paint(Circle c) {
		SquareOf s = new SquareOf(c);  // No tight coupling i can mock it dynamic dispatch 
		float p = s.square();
	}
}
