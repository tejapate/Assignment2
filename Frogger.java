import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class Frogger extends GraphicsProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GImage frog = new GImage("/frog.jpg");
	public static final int SQSIZE = 75;
	public static final int NCOL = 7;
	public static final int NROWS = 3;
	public static final int GRAVITY = 10;
	public int jump;
	

	public void run () {
		addMouseListeners();
		frogger();
		jump();
		
		}
	public void jump() {
		jump = 50;
		double tempY = frog.getY();
		do {
			frog.move(0, -jump);
			jump-=GRAVITY;
			pause(100);
			add(frog);
		} while
			(frog.getY() <= tempY);
		
	}

	public void frogger() {
		frog.setLocation(SQSIZE *(NCOL / 2),SQSIZE *(NROWS -1));
		add(frog);
				
	}

	public void mouseClicked(MouseEvent e) {
		jump();
}
	
}
