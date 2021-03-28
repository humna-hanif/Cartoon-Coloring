
import wheels.users.Frame;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class App extends Frame {
	private Cartoon cartoon1, cartoon2;
	private Buttons btn;

	// App constructor with no paramters
	// Initializes the color holder, the two instances of the cartoon, and the buttons
	// Sends the necessary parameters to each instance, if necessary
	public App() {
		ColorHolder colorHolder = new ColorHolder();
		cartoon1 = new Cartoon(200, 230, java.awt.Color.red, colorHolder);
		cartoon2 = new Cartoon(400, 230, java.awt.Color.yellow, colorHolder);
		btn = new Buttons(colorHolder);
	}

	public static void main(String[] args) {
		new App();

		_dp.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println(e.getX() + ", " + e.getY());
			}
		});
	}
}