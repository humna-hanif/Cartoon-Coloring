import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.RoundedRectangle;

// Allows for the body to be draggable
public class DraggableRoundedRectangle extends RoundedRectangle implements Mover {
	private Mover co;
	private ColorHolder colorHolder;

	// Constructor
	public DraggableRoundedRectangle(Color color, Mover co, ColorHolder colorHolder) {
		super(color);
		this.colorHolder = colorHolder;
		this.co = co;
	}

	// Changes the color of the body when clicked on to
	// the color stored in the color holder (color of the button clicked)
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
