import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.RoundedRectangle;

// Allows for the buttons (color swatches) to be clickable
public class ClickableRoundedRectangle extends RoundedRectangle {
	// Instance variables
	private ColorHolder colorHolder;
	private Color color;

	// Constructor takes the width, height, color(of button), and color holder
	public ClickableRoundedRectangle(int width, int height, java.awt.Color color, ColorHolder colorHolder) {
		super(color);
		this.setLocation(width, height);
		this.colorHolder = colorHolder;
		this.color = color;
	}

	// Takes the color of the swatch that is clicked and places it in holder
	// Color is to be used when setting the color of body and/or head
	public void mouseClicked(MouseEvent e) {
		colorHolder.setColor(color);
	}
}
