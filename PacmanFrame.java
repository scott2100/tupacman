import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

class PacmanFrame{
	
	public PacmanFrame(){
		JFrame frame = new JFrame();
		PacmanPanel pacPanel = new PacmanPanel();
		Maze mazePanel = new Maze();
		frame.add(pacPanel);
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String [] args){
		new PacmanFrame();
	}
}
