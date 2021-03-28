import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.*;

public class Body implements Mover {

	// Declare the different shapes for different parts (instance variables)
	// Declare the x and y locations as well as the displacements
	private DraggableRoundedRectangle body;
	private Rectangle rLeg, lLeg;
	private Line rHand, lHand, rShoe, lShoe;
	private int clickLocX, clickLocY, displaceX, displaceY;
	private ColorHolder colorHolder;

	// All of the properties or "parts" of the cartoon's body (creating new shape,
	// color, and size)
	// Constructor takes the location(x,y), the color of the cartoon's body, knows
	// about
	// the cartoon(as it gives all of the information), and knows about the color
	// holder
	// which will cause the color of the body to change
	// the body is draggable
	public Body(int x, int y, Color hbColor, Cartoon cartoon, ColorHolder colorHolder) {
		this.colorHolder = colorHolder;

		body = new DraggableRoundedRectangle(hbColor, this, colorHolder);
		body.setColor(Color.cyan);
		body.setSize(90, 104);

		rLeg = new Rectangle();
		rLeg.setColor(Color.orange);
		rLeg.setSize(15, 90);

		lLeg = new Rectangle();
		lLeg.setColor(Color.orange);
		lLeg.setSize(15, 90);

		rHand = new Line();
		rHand.setColor(Color.black);
		rHand.setThickness(3);

		lHand = new Line();
		lHand.setColor(Color.black);
		lHand.setThickness(3);

		rShoe = new Line();
		rShoe.setColor(Color.black);
		rShoe.setThickness(4);

		lShoe = new Line();
		lShoe.setColor(Color.black);
		lShoe.setThickness(4);

		setLocation(x, y);
	}

	// Sets location of body and its parts
	// The body should be able to move alone and with the head and so the
	// displacement needs to be recorded somewhere and info about its old location
	// as well
	public void setLocation(int x, int y) {
		body.setLocation(x - 63 + displaceX, y + 32 + displaceY);
		rLeg.setLocation(x - 45, y + 135);
		lLeg.setLocation(x - 7, y + 135);
		rHand.setP1(x - 60, y + 70);
		rHand.setP2(x - 110, y + 30);
		lHand.setP1(x + 20, y + 70);
		lHand.setP2(x + 80, y + 30);
		rShoe.setP1(x - 5, y + 223);
		rShoe.setP2(x + 25, y + 223);
		lShoe.setP1(x - 30, y + 223);
		lShoe.setP2(x - 59, y + 223);
	}

	// Takes a color to set the color of the body
	public void setColor(Color color) {
		body.setColor(color);
	}

	// Changes the color of the body to the color that is being held in the
	// color holder. When the body is clicked, it changes its color
	public void mouseClicked(MouseEvent e) {
		body.setColor(colorHolder.getColor());
	}

	// Implemented methods from the Mover interface
	@Override
	public void move(int dx, int dy) {
		body.setLocation(dx + body.getXLocation(), dy + body.getYLocation());
		displaceX = displaceX + dx;
		displaceY = displaceY + dy;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		clickLocX = e.getX();
		clickLocY = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		move(e.getX() - clickLocX, e.getY() - clickLocY);
		clickLocX = e.getX();
		clickLocY = e.getY();
	}
}
