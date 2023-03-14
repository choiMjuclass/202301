import javax.swing.JMenuBar;

public class GMenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;

	private GFileMenu fileMenu;
	public GMenuBar() {
		super();
		
		this.fileMenu = new GFileMenu("File");
		this.add(fileMenu);	
	}
}
