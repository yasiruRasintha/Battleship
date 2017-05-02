
public class Grid {

	public int[][] grid = new int[7][7];
	public String notation = "";
	
	
	public void placeShipsSubs(int x,int y,String pos) {
			int sub = 3;
			pos = pos.toLowerCase();
				if(pos.equals("h")){
					if(y+2<=6){
					grid[x][y]   = 3;
					grid[x][++y] = 3;
					grid[x][++y] = 3;
					}
				}
				if(pos.equals("v")){
					if(x+2<=6){
					grid[x][y]   = 3;
					grid[++x][y] = 3;
					grid[++x][y] = 3;
					}
				}
			}
			
		
			
			
	
	public void placeShipsC(int x,int y,String pos) {
		int carrier = 4;
		pos = pos.toLowerCase();
	
		if(pos.equals("h")){
			if(y+3<=6){
			grid[x][y]   = 4;
			grid[x][++y] = 4;
			grid[x][++y] = 4;
			grid[x][++y] = 4;
			}
		}
		if(pos.equals("v")){
			if(x+3<=6){
			grid[x][y]   = 4;
			grid[++x][y] = 4;
			grid[++x][y] = 4;
			grid[++x][y] = 4;
			}
		}
		
	}
	
		
	
	public void placeShipsWar(int x,int y,String pos) {
		int warship = 5;
		pos = pos.toLowerCase();
		
		if(pos.equals("h")){
			if(y+4<=6){
				grid[x][y]   = 5;
				grid[x][++y] = 5;
				grid[x][++y] = 5;
				grid[x][++y] = 5;
				grid[x][++y] = 5;
			}
		}	
		if(pos.equals("v")){
			if(x+4<=6){
				grid[x][y]   = 5;
				grid[++x][y] = 5;
				grid[++x][y] = 5;
				grid[++x][y] = 5;
				grid[++x][y] = 5;
			}
		}
	}

	
	public void viewGrid() {
		int gridlengthy = grid.length;
		int gridlengthx = grid[1].length;
		
		for(int i = 0;i<gridlengthx;i++){
			for(int j = 0;j<gridlengthy;j++){
				System.out.print(" ");
				System.out.print(grid[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
