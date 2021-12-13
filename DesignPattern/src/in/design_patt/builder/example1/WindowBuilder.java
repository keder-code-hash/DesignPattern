package in.design_patt.builder.example1;

public class WindowBuilder {
	public static MainWindow createWindow() {
		MainWindow mainWindow=MainWindow.getMainWindow();
		mainWindow.setConsole(new Console());
		mainWindow.setEditor(new Editor());
		mainWindow.setMenu(new Menu());
		return mainWindow;
	}
}
