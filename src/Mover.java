import java.awt.event.MouseEvent;

// Mover interface 
// Method signatures of specific behaviors ALL classes must implement
public interface Mover {
	void move(int dx, int dy);

	void mousePressed(MouseEvent e);

	void mouseDragged(MouseEvent e);

}
