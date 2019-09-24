import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r2d2 =  new Robot();
public static void main(String[] args) {
	r2d2.setX(20);
	r2d2.setY(550);	
	r2d2.setSpeed(10);		
	r2d2.penDown();
	for (int i = 0; i < 10; i++) {
		drawHouse(100);
	}
}

public static void drawHouse(int Height) {
	r2d2.move(Height);
	r2d2.turn(90);
	r2d2.move(20);
	r2d2.turn(90);
	r2d2.move(Height); 
	r2d2.turn(270);
	r2d2.setPenColor(0,250,0);
	r2d2.move(30);
	r2d2.setPenColor(100,100,100);
	r2d2.turn(270);
}
}