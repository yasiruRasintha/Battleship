
public class BattleshipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grid grid = new Grid();
		grid.placeShipsSubs(2,3,"v");
		grid.placeShipsC(1,1,"h");
		grid.placeShipsWar(2,2,"v");
		
		
		grid.viewGrid();
	}

}
