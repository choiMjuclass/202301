import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class GMenuBar extends JMenuBar {
	public GMenuBar() {
		GFileMenu fileMenu = new GFileMenu("File");
		this.add(fileMenu);	
;
	}
}
