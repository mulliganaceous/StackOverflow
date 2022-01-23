package chapterA;

// To use GUI, you have to import AWT and Swing libraries
import java.awt.*;
import javax.swing.*;

public class HelloWorldGUI {
	// GUI runs here
	public static void main(String[] args) {
		// The JFrame is the main window to put components inside
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel();
		
		// Sample customization methods
		frame.setTitle("Hello, World");
		
		// Add the main JPanel to the frame (with color coding)
		mainPanel.setBackground(Color.BLUE);
		frame.add(mainPanel);
		
		// Finally set up the GUI and make it visible.
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
}
