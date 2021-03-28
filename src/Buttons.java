import java.awt.Color;
import wheels.users.Rectangle;

public class Buttons {
	// Declares the five buttons(clickable) and the color swatch border(rectangle)
	private ClickableRoundedRectangle btn1, btn2, btn3, btn4, btn5;
	private Rectangle border;

	// Constructor has parameter of the color holder as it needs to know about it
	// in order to send the info on the color to the clickableRoundedRectangle
	// Sends the location, color of the button, and the color holder to the
	// clickableRoundedRectangle
	public Buttons(ColorHolder colorHolder) {
		border = new Rectangle();
		border.setSize(300, 70);
		border.setLocation(250, 15);
		border.setColor(Color.black);
		border.setFillColor(null);

		btn1 = new ClickableRoundedRectangle(255, 25, java.awt.Color.red, colorHolder);
		btn1.setSize(48, 50);

		btn2 = new ClickableRoundedRectangle(315, 25, java.awt.Color.orange, colorHolder);
		btn2.setSize(48, 50);

		btn3 = new ClickableRoundedRectangle(375, 25, java.awt.Color.green, colorHolder);
		btn3.setSize(48, 50);

		btn4 = new ClickableRoundedRectangle(435, 25, java.awt.Color.blue, colorHolder);
		btn4.setSize(48, 50);

		btn5 = new ClickableRoundedRectangle(495, 25, java.awt.Color.magenta, colorHolder);
		btn5.setSize(48, 50);
	}

}
