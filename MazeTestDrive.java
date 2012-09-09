import java.awt.*;
import javax.swing.*;

class MazeTestDrive {

	public MazeTestDrive(){

		JFrame frame = new JFrame();
		Maze testMaze = new Maze();
		frame.add(testMaze);
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	

	public static void main(String [] args){
		new MazeTestDrive();
	}

}
