import javax.swing.JFrame;

public class GMainFrame extends JFrame {
	private GMenuBar menuBar; 
//	private ToolBar toolBar;
	private GDrawingPanel drawingPanel;

	public GMainFrame() {
		// attributes
		this.setVisible(true);
		this.setLocation(200, 100);
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// components

		this.menuBar = new GMenuBar();
		this.setJMenuBar(menuBar);
//		this.toolBar = new ToolBar();

		this.drawingPanel = new GDrawingPanel();
		this.add(drawingPanel);
	}
}
