package auctionsniper;

import javax.swing.SwingUtilities;

import auctionsniper.ui.MainWindow;

public class Main {
	public static final String SNIPER_STATUS_NAME = "sniper status";
	@SuppressWarnings("unused")
	private MainWindow ui;

	public Main() throws Exception {
		startUserInterface();
	}

	@SuppressWarnings("unused")
	public static void main(String... args) throws Exception {
		Main main = new Main();
	}

	private void startUserInterface() throws Exception {
		SwingUtilities.invokeAndWait(new Runnable() {
			public void run() {
				ui = new MainWindow();
			}
		});
	}
}