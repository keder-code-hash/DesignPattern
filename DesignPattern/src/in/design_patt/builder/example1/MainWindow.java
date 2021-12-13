package in.design_patt.builder.example1;

public class MainWindow {
	private static MainWindow mainWindow=null;
	private MainWindow() {
		super();
	}
	Editor editor;
	Menu menu;
	Console console;
	public Editor getEditor() {
		return editor;
	}
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Console getConsole() {
		return console;
	}
	public void setConsole(Console console) {
		this.console = console;
	}
	public static MainWindow getMainWindow() {
		if(mainWindow==null) {
			mainWindow=new MainWindow();
			return mainWindow;
		}
		return null;
	}
}
