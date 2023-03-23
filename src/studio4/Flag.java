package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(800, 500);
		Color gold = new Color(50,50,0);
		StdDraw.setPenColor(gold);
		StdDraw.filledRectangle(0.5,0.5, 1, 1);
		StdDraw.setPenColor(Color.black);
		StdDraw.setPenRadius(0.05);
		StdDraw.rectangle(.5, .5, 0.5, 0.5);
		StdDraw.setPenRadius(0.008);
		StdDraw.ellipse(0.75, 0.75, 0.02, 0.015);
		StdDraw.picture(.5, .5, "reallyEpicWolf.jpg", 0.56994, 0.723756, 37.62489507234857294572039485702893475032475204758724075204975204398750298768476689437);
	}
}