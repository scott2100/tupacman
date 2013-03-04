class PacMan {

	private static int thisX, thisY,  positionY, positionX = 0;
	private static boolean up, down, left, right = false;
	private static Maze pacMaze = new Maze();

	public int getPacManX(){
		return thisX;
	}

	public int getPacManY(){
		return thisY;
	}

	public void setPacManX(int myPacManX){
		this.thisX = myPacManX;
	}

	public void setPacManY(int myPacManY){
		this.thisY = myPacManY;
	}

	public void setUp(boolean myUp){
		this.up = myUp;
	}
	
	public void setDown(boolean myDown){
		this.down = myDown;
	}

	public void setRight(boolean myRight){
		this.right = myRight;
	}

	public void setLeft(boolean myLeft){
		this.left = myLeft;
	}

	public boolean getUp(){
		return up;
	}

	public boolean getDown(){
		return down;
	}

	public boolean getLeft(){
		return left;
	}

	public boolean getRight(){
		return right;
	}

	public void move()
	{
		if (this.getUp() && this.getPacManY() >=0 && this.getPacManY() <=380)
		{
			this.setPacManY(this.getPacManY()-2);	
		}
		else if (this.getDown() && this.getPacManY() >=0 && this.getPacManY() <=380)
		{
			this.setPacManY(this.getPacManY()+2);
		}	
		else if (this.getLeft() && this.getPacManX() >=0 && this.getPacManX() <=380)
		{
			this.setPacManX(this.getPacManX()-2);
		}
		else if (this.getRight() && this.getPacManX() >=0 && this.getPacManX() <=380)
		{
			this.setPacManX(this.getPacManX() +2);
		}
		
		if (this.getPacManX() <0)
		{
			this.setPacManX(0);	
		}
		if (this.getPacManX() >380)
		{
			this.setPacManX(380);
		}
		if (this.getPacManY() < 0)
		{
			this.setPacManY(0);
		}
		if (this.getPacManY() > 380)
		{
			this.setPacManY(380);
		}	

		this.position();	
	}

	public void position(){

		//System.out.println("Pacman position Y: " + this.getPositionY());
		//System.out.println("Pacman position X: " + this.getPositionX());
		
		int posx = ((this.getPacManY() + 10) / 20); 
		int posy = ((this.getPacManX() + 10) / 20);


		int fat = pacMaze.getMaze()[posx][posy];
		System.out.print(fat);

	}
}

