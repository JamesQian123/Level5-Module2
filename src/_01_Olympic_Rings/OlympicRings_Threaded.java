package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot red = new Robot(700,200);
		Robot blue = new Robot(200,200);
		Robot black = new Robot(450,200);
		Robot green = new Robot(325,400);
		Robot yellow = new Robot(575,400);
		
		Thread be = new Thread(()->{
			blue.setPenColor(Color.BLUE);
			blue.penDown();
			blue.setSpeed(100);
			for(int i = 0; i < 360; i++) {
				blue.move(3);
				blue.turn(1);
			}
		});
		Thread bk = new Thread(()-> {
			black.setPenColor(Color.BLACK);
			black.penDown();
			black.setSpeed(100);
			for(int i = 0; i < 360; i++) {
				black.move(3);
				black.turn(1);
			}
		}) ;
		Thread r = new Thread(()->{
			red.setPenColor(Color.RED);
			red.penDown();
			red.setSpeed(100);
			for(int i = 0; i < 360; i++) {
				red.move(3);
				red.turn(1);
			}
		});
		Thread g = new Thread(()->{
			green.setPenColor(Color.GREEN);
			green.penDown();
			green.setSpeed(100);
			for(int i = 0; i < 360; i++) {
				green.move(3);
				green.turn(1);
			}
		});
		Thread y = new Thread(()->{
			yellow.setPenColor(Color.YELLOW);
			yellow.penDown();
			yellow.setSpeed(100);
			for(int i = 0; i < 360; i++) {
				yellow.move(3);
				yellow.turn(1);
			}
		});
		
		be.start();
		bk.start();
		r.start();
		g.start();
		y.start();
	}
}

