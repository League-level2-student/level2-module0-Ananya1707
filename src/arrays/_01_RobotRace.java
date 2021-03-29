package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {

	//2. create an array of 5 robots.
		Robot[] robots = new Robot[3];

	//3. use a for loop to initialize the robots.
		for(int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("mini");
			robots[i].setSpeed(100);
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setX(700-i*(700/robots.length));
			robots[i].setY(500);

		}


	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		Random random = new Random();
		boolean racing = true;
		int winner = 0; 

		while(racing) {
			for(int i = 0; i < robots.length; i++) {
				robots[i].move(random.nextInt(50));
				if(robots[i].getY() <= 10) {
					winner = i;
					racing = false;
					break;
				}	
				
			}
		}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "robot" + winner + " won!");

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	/*
		for(int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("mini");
			robots[i].setSpeed(100);
			robots[i].setX(400-i*(400/robots.length));
			robots[i].setY(250);

		}
		
		Random random2 = new Random();
		boolean racing2 = true;
		int winner2 = 0; 

		while(racing2) {
			for(int i = 0; i < robots.length; i++) {
				robots[i].move(random2.nextInt(3));
				robots[i].turn(1);
				if(robots[i].getY() > 240 && robots[i].getY() < 250) {
					winner2 = i;
					racing2 = false;
					break;
				}	
				
			}
		}
		
		JOptionPane.showMessageDialog(null, "robot" + winner2 + " won!");
	*/
	}
}
