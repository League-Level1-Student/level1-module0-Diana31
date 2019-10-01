import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r2d2 =  new Robot();
public static void main(String[] args) {
	
	r2d2.setX(20);
	r2d2.setY(550);	
	r2d2.setSpeed(10);		
	r2d2.penDown();
		drawHouse("large");
		drawHouse("small");
		drawHouse("medium");
		drawHouse("small");
		drawHouse("large");
		
}
public static void drawHouse(String heightString) {
	int height = 0;
	if(heightString.equals("small")) {
		height = 60;
	} 
	if(heightString.equals("meduim")) {
		height = 120;
	}
	if(heightString.equals("large")) {
		height = 250;
		drawFlatRoof();
	}
	r2d2.move(height);
	r2d2.turn(90);
	r2d2.move(20);
	r2d2.turn(90);
	r2d2.move(height); 
	r2d2.turn(270);
	r2d2.setPenColor(0,250,0);
	r2d2.move(30);
	r2d2.setPenColor(100,100,100);
	r2d2.turn(270);
}
public static void drawPointyRoof() {
	r2d2.turn(45);
	r2d2.move(25);
	r2d2.turn(90);
	r2d2.move(25);
	r2d2.turn(45);
}
public static void drawFlatRoof() {
	r2d2.turn(90);
	r2d2.move(20);
	r2d2.turn(90);
}
}