package tightcouplingusingstaticmethods.utils;

public class Test {
	void paintIt(Circle c) {
	 int t = 0;
	 float s = GeometryUtils.calcsquare(c); // Tight Coupling // static decision 
	 float p = s * 5.55f;
	 if(t==0) {
		 // some issue at line 6 its waisted 
	 }
	 // paint using the p 
	}
}
