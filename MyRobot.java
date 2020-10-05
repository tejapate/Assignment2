import acm.program.*;
import java.awt.*;
import java.awt.Color.*;
import acm.graphics.*;

public class MyRobot extends GraphicsProgram{

	//values passed into methods as set parameters
	private static final double FACE_WIDTH = 200;
	private static final double FACE_HEIGHT = 300;
	private static final double EYE_RADIUS = 20;
	private static final double MOUTH_WIDTH = 140;
	private static final double MOUTH_HEIGHT = 40;

	//main method
	public void run() {
		MyRobot(getWidth() / 2, getHeight() / 2);
	}

	//this method get the results from private methods face, eye and mouth
	//sets the center of the canvas, and decide where to put eyes and mouth 
	//according to the width and height of face
	private void MyRobot(double centerX, double centerY) {
		face(centerX, centerY);
		eyeLeft(centerX - FACE_WIDTH / 4, centerY - FACE_HEIGHT / 4);
		eyeLeft(centerX + FACE_WIDTH / 6, centerY - FACE_HEIGHT / 4);
		mouth(centerX, centerY + FACE_HEIGHT / 4);
	}

	//this method add the face of robot with gray color and in center of canvas
	private void face(double centerX, double centerY) {
		//double centerX = getWidth() / 2;
		double facewidth = centerX - FACE_WIDTH / 2;
		//double centerY = getHeight() / 2;
		double faceheight = centerY - FACE_HEIGHT / 2;

		GRect rectFace = new GRect(facewidth, faceheight , FACE_WIDTH, FACE_HEIGHT);
		rectFace.setFilled(true);
		rectFace.setFillColor(Color.GRAY);
		rectFace.setColor(Color.BLACK);
		add(rectFace);
	}

	//this method add the eyes filled with yellow color on face
	private void eyeLeft(double centerX, double centerY) {
		//double centerX = getWidth() / 2;
		double eyewidth = centerX - EYE_RADIUS / 2;
		//double centerY = getHeight() / 2;
		double eyeheight = centerY - EYE_RADIUS / 2;

		GOval ovalEye = new GOval(eyewidth, eyeheight, EYE_RADIUS * 2, EYE_RADIUS * 2);
		ovalEye.setFilled(true);
		ovalEye.setFillColor(Color.YELLOW);
		add(ovalEye);
	}

	//this method add the mouth of robot filled with color white 

	private void mouth(double centerX, double centerY) {
		//double centerX = getWidth() / 2;
		double mouthwidth = centerX - MOUTH_WIDTH / 2;
		//double centerY = getHeight() / 2;
		double mouthheight = centerY - MOUTH_HEIGHT / 2;

		GRect rectMouth = new GRect(mouthwidth, mouthheight, MOUTH_WIDTH, MOUTH_HEIGHT);
		rectMouth.setFilled(true);
		rectMouth.setFillColor(Color.WHITE);
		add(rectMouth);
	}

}


