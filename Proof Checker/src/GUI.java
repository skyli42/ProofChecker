import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class GUI {
	
	public GUI(int width, int height){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame = new JFrame("Proof Checker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, width, height);
		frame.setLocationRelativeTo(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu filemenu = new JMenu("File");
		menuBar.add(filemenu);
	
		JMenuItem openItem = new JMenuItem("Open",KeyEvent.VK_T);
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
		openItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		filemenu.add(openItem);
		
		frame.setJMenuBar(menuBar);
		
		
		frame.setVisible(true);
	}
	
	
	
}
