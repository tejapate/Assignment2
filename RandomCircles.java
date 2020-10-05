import acm.program.*;
import acm.util.*;
import acm.graphics.*;

public class RandomCircles extends GraphicsProgram {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 9090890481470727024L;
	/**
	 * 
	 */
	
	private static final int NUMCIRCLES = 10;
	private static final double MIN_RADIUS = 5;
	private static final double MAX_RADIUS = 50;


	public void run() {
	for (int i = 0; i<NUMCIRCLES; i++) {
		double r = random.nextDouble(MIN_RADIUS, MAX_RADIUS);
		double x = random.nextDouble(0, getWidth() - 2 * r);
		double y = random.nextDouble(0, getHeight() - 2 * r);
		GOval circle = new GOval(x, y, 2 * r, 2 * r);
		add(circle);
		circle.setFilled(true);
		circle.setColor(random.nextColor());
		
		
	}
		
	}
	
	private RandomGenerator random = RandomGenerator.getInstance();
}
