import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JPanel;

class PacmanPanel extends JPanel implements Runnable, KeyListener{
	
	public static int height = 400; 
	public static int width = 400;
	public static int PacManX, PacManY = 0;
	public boolean left, right, up, down;
	Maze pacMaze = new Maze();	

	public PacmanPanel(){
		this.setPreferredSize(new Dimension(height,width));
		this.setFocusable(true);
		setDoubleBuffered(true);
		addKeyListener(this);
		new Thread(this).start();
	}	

	protected void paintComponent(Graphics g)
	{	
		Image image = createImage(height, width);
		Graphics g2 = image.getGraphics();
		
		//g2.setColor(Color.BLACK);
		//g2.fillRect(0,0,height,width);
		
		g2.setColor(Color.YELLOW);
		g2.fillRect(PacManX,PacManY,20,20);
		g2.dispose();
		g.drawImage(image, 0, 0, null);
	}

	public void run()
	{
		while(true)
		{
			repaint();
			move();
			try
			{
				Thread.sleep(20);
			}
			catch(Exception e)
			{
			}
		}
	}
	
	public void move()
	{
		if (up && PacManY>=0 && PacManY<=380)
		{
			PacManY=PacManY-2;	
		}
		else if (down && PacManY>=0 && PacManY<=380)
		{
			PacManY=PacManY+2;
		}	
		else if (left && PacManX>=0 && PacManX<=380)
		{
			PacManX=PacManX-2;
		}
		else if (right && PacManX>=0 && PacManX<=380)
		{
			PacManX=PacManX+2;
		}
		
		if (PacManX<0)
		{
			PacManX=0;	
		}
		if (PacManX>380)
		{
			PacManX=380;
		}
		if (PacManY<0)
		{
			PacManY=0;
		}
		if (PacManY>380){
			PacManY=380;
		}		
	}
	
	public void setUp(boolean up){
		this.up = up;
	}
	
	public void setDown(boolean down){
		this.down = down;
	}

	public void setRight(boolean right){
		this.right = right;
	}

	public void setLeft(boolean left){
		this.left = left;
	}

	@Override
	public void keyPressed(KeyEvent e){

		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			up=false;
			down=false;
			right=false;
			left=true;	
		}

		else if (key == KeyEvent.VK_RIGHT){
			up=false;
			down=false;
			right=true;
			left=false;
		}

		else if (key == KeyEvent.VK_UP){
			up=true;
			down=false;
			right=false;
			left=false;
		}	

		else if (key == KeyEvent.VK_DOWN){
			up=false;
			down=true;
			right=false;
			left=false;
		}
	}

	@Override
	public void keyReleased(KeyEvent e){
		//
	}
	
	@Override
	public void keyTyped(KeyEvent e){
		//
	}
	
}

	
