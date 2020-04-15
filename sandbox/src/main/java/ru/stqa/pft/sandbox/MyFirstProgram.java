package ru.stqa.pft.sandbox;

import java.awt.*;

public class MyFirstProgram {
	
	public static void main(String[] args) {

		hello("world");
		hello("user");
		hello("Alex");

		Square s = new Square();
		s.l = 5;
		System.out.println("Ploshadi kvadrata so storonoi " + s.l + " = " + area(s));

		Rectangle r = new Rectangle();
		r.x = 4;
		r.y = 6;
		System.out.println("Ploshadi preamougolinika so storonami " + r.x + " and " + r.y + " = " + area(r));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(Square s) {
		return s.l * s.l;
	}
	public static double area(Rectangle r) {
		return r.x * r.y;
	}


}
