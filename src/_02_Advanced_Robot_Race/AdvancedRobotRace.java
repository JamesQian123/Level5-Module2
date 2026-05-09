package _02_Advanced_Robot_Race;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	
	//1. make a main method
	volatile ArrayList<Integer> list = new ArrayList<>();
	public void start() {
		Robot referee = new Robot(0,100);
		referee.turn(90);
		referee.penDown();
		referee.setSpeed(100);
		referee.move(1600);
		Robot rob1 = new Robot(0,600);
		Robot rob2 = new Robot(200,600);
		Robot rob3 = new Robot(400,600);
		Robot rob4 = new Robot(600,600);
		Robot rob5 = new Robot(800,600);
		
		Runnable r;
		Thread r1 = new Thread(()->{
			
			while(list.size() == 0) {
				int rand = (int) (Math.random()*10)+1;
				rob1.setSpeed((int) (Math.random()*10)+1);
				rob1.move(rand);
				if(rob1.getY() <= 100) {
					list.add(1);
				}
			}
		});
		Thread r2 = new Thread(()->{
			
			while(list.size() == 0) {
				int rand = (int) (Math.random()*10)+1;
				rob2.setSpeed((int) (Math.random()*10)+1);
				rob2.move(rand);
				if(rob2.getY() <= 100) {
					list.add(1);
				}
			}
		});
		Thread r3 = new Thread(()->{
			
			while(list.size() == 0) {
				int rand = (int) (Math.random()*10)+1;
				rob3.setSpeed((int) (Math.random()*10)+1);
				rob3.move(rand);
				if(rob3.getY() <= 100) {
					list.add(1);
				}
			}
		});
		Thread r4 = new Thread(()->{
			
			while(list.size() == 0) {
				int rand = (int) (Math.random()*10)+1;
				rob4.setSpeed((int) (Math.random()*10)+1);
				rob4.move(rand);
				if(rob4.getY() <= 100) {
					list.add(1);
				}
			}
		});
		Thread r5 = new Thread(()->{
		
			while(list.size() == 0) {
				int rand = (int) (Math.random()*10)+1;
				rob5.setSpeed((int) (Math.random()*10)+1);
				rob5.move(rand);
				if(rob5.getY() <= 100) {
					list.add(1);
					
					
				}
			}
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
	public static void main(String[] args) {
		AdvancedRobotRace arr = new AdvancedRobotRace();
		arr.start();
		
//	Random rand = new Random();
//	
//	//2. create an array of 5 robots.
//	Robot[] robots = new Robot[5];
//	//3. use a for loop to initialize the robots.
//	
//	int x = 0;
//	for(int i = 0; i < 5; i++) {
//		Robot rob = new Robot();
//		robots[i] = rob;
//		
//		rob.setX(x);
//		rob.setY(600);
//		x+=200;
//		rob.setSpeed(25);
//	}
//		//4. make each robot start at the bottom of the screen, side by side, facing up
//	
//	//5. use another for loop to iterate through the array and make each robot move 
//	//   a random amount less than 50.
//	int winner = 0;
//	boolean move = true;
//	while(move)
//		for(int i = 0;i < robots.length; i++ ) {
//			robots[i].move(rand.nextInt(50));
//			int y = robots[i].getY();
//			if(y < 0) {
//				move = false;
//				winner = i; 
//				JOptionPane.showMessageDialog(null, "Hooray, Robot " + winner + " won");
//			}
//		}
//	
//	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
//
//	//7. declare that robot the winner and throw it a party!
//
//	//8. try different races with different amounts of robots.
//	
//	//9. make the robots race around a circular track.
//}	
}
}

