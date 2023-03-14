import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class GToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public GToolBar() {
		super();
		
		JRadioButton btnRectangle = new JRadioButton("Rectangle");
		this.add(btnRectangle);
		
		JRadioButton btnOval = new JRadioButton("Oval");
		this.add(btnOval);
		
		JRadioButton btnLine = new JRadioButton("Line");
		this.add(btnLine);
		
		JRadioButton btnPolygon = new JRadioButton("Polygon");
		this.add(btnPolygon);
	}
}
