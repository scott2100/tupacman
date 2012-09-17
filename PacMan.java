class PacMan {

	private static int pacManX, pacManY = 0;
	private static boolean up, down, left, right = false;

	public int getPacManX(){
		return pacManX;
	}

	public int getPacManY(){
		return pacManY;
	}

	public void setPacManX(int myPacManX){
		this.pacManX = myPacManX;
	}

	public void setPacManY(int myPacManY){
		this.pacManY = myPacManY;
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

}

