import java.awt.*;
import javax.swing.*;

class Maze extends JPanel {
	
	public static int height = 400;
	public static int width = 400;
	public static int[][] maze = 	{
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
		

	public Maze()
	{
		this.setPreferredSize(new Dimension(height,width));
		this.setFocusable(true);
		setDoubleBuffered(true);

	}

	protected void paintComponent(Graphics g)
	{
		
		
			Image image = createImage(400,400);
			Graphics g2 = image.getGraphics();

			g2.setColor(Color.BLACK);
			g2.fillRect(0,0,400,400);
			
			for(int y=0; y<maze.length; y++){
				for(int x=0; x<maze[y].length; x++){
					if(maze[x][y] == 1){
						g2.setColor(Color.BLUE);
						g2.drawRect(x*20,y*20,20,20);
					}
				}
			}

			/*
			g2.setColor(Color.BLUE);
			g2.drawRoundRect(0,0,400,10,10,10);
			g2.drawRoundRect(0,0,10,400,10,10);
			
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(1,1,390,9,10,10);
			g2.fillRoundRect(1,1,9,390,10,10);		
			*/
			
			g.drawImage(image,0,0,null);
	}
		
}


