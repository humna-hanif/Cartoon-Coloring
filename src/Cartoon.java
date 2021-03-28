
public class Cartoon {

	// Instance variables for the components
	private Head head;
	private Body body;
	private int x, y, clickLocX, clickLocY;

	// Constructor which takes in the location, color, and knows about the color
	// holder
	// The info on the location and color is sent from the App
	public Cartoon(int x, int y, java.awt.Color hbColor, ColorHolder colorHolder) {
		this.x = x;
		this.y = y;
		body = new Body(x, y, hbColor, this, colorHolder); // initialization of body
		head = new Head(x, y, hbColor, this, colorHolder); // initialization of head
	}

	// Sets the location of the head and body to one specified
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		head.setLocation(x, y);
		body.setLocation(x, y);
	}
}
