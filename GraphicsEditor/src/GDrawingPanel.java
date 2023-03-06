import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GDrawingPanel extends JPanel {

	public GDrawingPanel() {
		this.setBackground(Color.WHITE);
	}
	public void paint(Graphics graphics) {
		super.paint(graphics);
		
		graphics.setColor(Color.RED);
		graphics.drawRect(10, 10, 40, 40);
	}
}
