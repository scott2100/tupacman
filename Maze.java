import java.awt.*;
import javax.swing.*;

class Maze extends JPanel {
	
	private static int height = 400;
	private static int width = 400;
	private static int[][] maze = 	{
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					};
	
	public void setHeight(int height){
		this.height = height;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public void setMaze(int[][] maze){
		this.maze = maze;
	}

	public int[][] getMaze(){
		return maze;
	}
	

	public Maze()
	{
		this.setPreferredSize(new Dimension(height,width));
		this.setFocusable(true);
		setDoubleBuffered(true);

	}

}


