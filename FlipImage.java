import acm.program.GraphicsProgram;
import acm.graphics.*;

public class FlipImage extends GraphicsProgram {
	
	GImage image = new GImage("Milkmaid.jpg");
	public void flip() {
		image = flipHorizantal(image);
		add(image);
		
	}
	public GImage flipHorizantal(GImage image) {
		
		int[][] array = image.getPixelArray();
		int width = array[0].length;
		for(int pix1 = 0; pix1 < width / 2; pix1++) {
			int pix2 = width - pix1 - 1;
			int[] temp = new int[array.length];
			for(int i = 0; i < array.length; i++) {
				temp[i] = array[i][pix2];
			}
			for(int i = 0; i < array.length; i++) {
				array[i][pix2] = array[i][pix1];
			}
			for(int i = 0; i < array.length; i ++) {
				array[i][pix1] = temp[i];
			}
		}
		return new GImage(array);
	}
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
