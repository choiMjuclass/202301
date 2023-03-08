import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GFileMenu extends JMenu {
	public GFileMenu(String title) {
		super(title);
		
		JMenuItem itemNew = new JMenuItem("new");
		this.add(itemNew);
	}
}
