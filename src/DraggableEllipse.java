import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.Ellipse;

// Allows for the head to be draggable
public class DraggableEllipse extends Ellipse implements Mover {
	private Mover co;
	private ColorHolder colorHolder;

	// Constructor
	public DraggableEllipse(Color color, Mover co, ColorHolder colorHolder) {
		super(color);
		this.colorHolder = colorHolder;
		this.co = co;
	}

	// When the draggableEllipse (the head) is clicked, it changes its
	// color to the one saved in the color holder(which is the color of the button
	// clicked)
	public void mouseClicked(MouseEvent e) {
		this.setColor(colorHolder.getColor());
	}

	// Implemented methods of the interface
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		co.move(dx, dy);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		co.mousePressed(e);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		co.mouseDragged(e);
	}

}
