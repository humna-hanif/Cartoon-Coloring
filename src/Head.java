
import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.*;

public class Head implements Mover {

	// Declares the different shapes for different parts (instance variables)
	// Declare the x and y locations as well as the displacements
	private DraggableEllipse face1;
	private Ellipse eye1, eye2, pupil1, pupil2;
	private int x, y, clickLocX, clickLocY;
	private Cartoon cartoon;
	private ColorHolder colorHolder;

	// All of the properties or "parts" of the cartoon's head (creating new shape,
	// color, and size)
	// Constructor takes the location(x,y), the color of the cartoon's head, knows
	// about
	// the cartoon(as it gives all of the information), and knows about the color
	// holder
	// which will cause the color of the head to change
	// the head (face1) is draggable
	public Head(int x, int y, Color hbColor, Cartoon cartoon, ColorHolder colorHolder) {
		this.cartoon = cartoon;
		this.x = x;
		this.y = y;

		face1 = new DraggableEllipse(hbColor, this, colorHolder);
		face1.setColor(hbColor);
		face1.setSize(100, 100);

		eye1 = new Ellipse();
		eye1.setColor(Color.black);
		eye1.setSize(30, 30);

		pupil1 = new Ellipse();
		pupil1.setColor(Color.white);
		pupil1.setSize(10, 10);

		eye2 = new Ellipse();
		eye2.setColor(Color.black);
		eye2.setSize(30, 30);

		pupil2 = new Ellipse();
		pupil2.setColor(Color.white);
		pupil2.setSize(10, 10);

		setLocation(x, y);
	}

	// Set location for each part of the head
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		face1.setLocation(x - 70, y - 70);
		eye1.setLocation(x - 55, y - 40);
		pupil1.setLocation(x - 45, y - 30);
		eye2.setLocation(x - 15, y - 40);
		pupil2.setLocation(x - 5, y - 30);
	}

	// Implemented methods of the interface
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		cartoon.setLocation(dx + x, dy + y);
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