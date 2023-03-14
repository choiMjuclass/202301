import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class GDrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private EventHandler eventHandler;
	
	public GDrawingPanel() {
		this.setBackground(Color.WHITE);
		
		this.eventHandler = new EventHandler();
		this.addMouseListener(eventHandler);
		this.addMouseMotionListener(eventHandler);
	}
	public void paint(Graphics graphics) {
		super.paint(graphics);
		
		graphics.setColor(Color.RED);
		graphics.drawRect(10, 10, 40, 40);
	}
	
	private class EventHandler implements MouseListener, MouseMotionListener {
		@Override
		public void mouseDragged(MouseEvent e) {	
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println(e.getX()+" "+e.getY());
		}
		@Override
		public void mouseClicked(MouseEvent e) {	
		}
		@Override
		public void mousePressed(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
	}
}
