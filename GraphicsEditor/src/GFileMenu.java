import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GFileMenu extends JMenu {
	private static final long serialVersionUID = 1L;

	private JMenuItem itemNew;
	
	public GFileMenu(String title) {
		super(title);
		
		this.itemNew = new JMenuItem("new");
		this.add(this.itemNew);
	}
}
