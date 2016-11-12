import java.util.Random;

/**
 * Represents the entire Rubix Cube
 * @author karce
 *
 */
public class RubiksCube {

	private int[][][] cube;
	int edgeTemp;
	int cornerTemp;
	Random rng = new Random();
	int rand;
	
	public RubiksCube() {
		cube = new int[3][3][3];
		addressCube();
	}
	
	private void addressCube() {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					cube[i][j][k] = count;
					count++;
				}
			}
		}
		//cube[1][1][1], number 13, doesn't matter
	}
	
	public int getPosition(int x, int y, int z) {
		return cube[x][y][z];
	}
	
	public boolean isSolved() {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube[i][j][k] != count) {
						return false;
					}
					count++;
				}
			}
		}
		return true;
	}
	
	//Assuming white is the top
	//Blue is the bottom middle
	//Red is the left middle
	//Orange is the right middle
	//Green is the top middle
	//Yellow is the bottom
	
	//whiteFace = cube[1][1][0]
	//blueFace = cube[1][2][1]
	//redFace = cube[0][1][1]
	//greenFace = cube[1][0][1]
	//orangeFace = cube[2][1][1]
	//yellowFace = cube[1][1][2]
	
	public void whiteClockwise() {
		edgeTemp = cube[1][0][0];
		cornerTemp = cube[0][0][0];
		
		//Edges
		cube[1][0][0] = cube[0][1][0];
		cube[0][1][0] = cube[1][2][0];
		cube[1][2][0] = cube[2][1][0];
		cube[2][1][0] = edgeTemp;
		
		//Corners
		cube[0][0][0] = cube[0][2][0];
		cube[0][2][0] = cube[2][2][0];
		cube[2][2][0] = cube[2][0][0];
		cube[2][0][0] = cornerTemp;
	}
	
	public void whiteCounterClockwise() {
		edgeTemp = cube[1][0][0];
		cornerTemp = cube[0][0][0];
		
		//Edges
		cube[1][0][0] = cube[2][1][0];
		cube[2][1][0] = cube[1][2][0];
		cube[1][2][0] = cube[0][1][0];
		cube[0][1][0] = edgeTemp;
		
		//Corners
		cube[0][0][0] = cube[2][0][0];
		cube[2][0][0] = cube[2][2][0];
		cube[2][2][0] = cube[0][2][0];
		cube[0][2][0] = cornerTemp;
	}
	
	public void blueClockwise() {
		edgeTemp = cube[1][2][0];
		cornerTemp = cube[0][2][0];
		
		//Edges
		cube[1][2][0] = cube[0][2][1];
		cube[0][2][1] = cube[1][2][2];
		cube[1][2][2] = cube[2][2][1];
		cube[2][2][1] = edgeTemp;
		
		//Corners
		cube[0][2][0] = cube[0][2][2];
		cube[0][2][2] = cube[2][2][2];
		cube[2][2][2] = cube[2][2][0];
		cube[2][2][0] = cornerTemp;
	}
	
	public void blueCounterClockwise() {
		edgeTemp = cube[1][2][0];
		cornerTemp = cube[0][2][0];
		
		//Edges
		cube[1][2][0] = cube[2][2][1];
		cube[2][2][1] = cube[1][2][2];
		cube[1][2][2] = cube[0][2][1];
		cube[0][2][1] = edgeTemp;
		
		//Corners
		cube[0][2][0] = cube[2][2][0];
		cube[2][2][0] = cube[2][2][2];
		cube[2][2][2] = cube[0][2][2];
		cube[0][2][2] = cornerTemp;
	}
	
	public void orangeClockwise() {
		edgeTemp = cube[2][1][0];
		cornerTemp = cube[2][2][0];
		
		//Edges
		cube[2][1][0] = cube[2][2][1];
		cube[2][2][1] = cube[2][1][2];
		cube[2][1][2] = cube[2][0][1];
		cube[2][0][1] = edgeTemp;
		
		//Corners
		cube[2][2][0] = cube[2][2][2];
		cube[2][2][2] = cube[2][0][2];
		cube[2][0][2] = cube[2][0][0];
		cube[2][0][0] = cornerTemp;
	}
	
	public void orangeCounterClockwise() {
		edgeTemp = cube[2][1][0];
		cornerTemp = cube[2][2][0];
		
		//Edges
		cube[2][1][0] = cube[2][0][1];
		cube[2][0][1] = cube[2][1][2];
		cube[2][1][2] = cube[2][2][1];
		cube[2][2][1] = edgeTemp;
		
		//Corners
		cube[2][2][0] = cube[2][0][0];
		cube[2][0][0] = cube[2][0][2];
		cube[2][0][2] = cube[2][2][2];
		cube[2][2][2] = cornerTemp;
	}
	
	public void redClockwise() {
		edgeTemp = cube[0][1][0];
		cornerTemp = cube[0][0][0];
		
		//Edges
		cube[0][1][0] = cube[0][0][1];
		cube[0][0][1] = cube[0][1][2];
		cube[0][1][2] = cube[0][2][1];
		cube[0][2][1] = edgeTemp;
		
		//Corners
		cube[0][0][0] = cube[0][0][2];
		cube[0][0][2] = cube[0][2][2];
		cube[0][2][2] = cube[0][2][0];
		cube[0][2][0] = cornerTemp;
	}
	
	public void redCounterClockwise() {
		edgeTemp = cube[0][1][0];
		cornerTemp = cube[0][0][0];
		
		//Edges
		cube[0][1][0] = cube[0][2][1];
		cube[0][2][1] = cube[0][1][2];
		cube[0][1][2] = cube[0][0][1];
		cube[0][0][1] = edgeTemp;
		
		//Corners
		cube[0][0][0] = cube[0][2][0];
		cube[0][2][0] = cube[0][2][2];
		cube[0][2][2] = cube[0][0][2];
		cube[0][0][2] = cornerTemp;
	}
	
	public void greenClockwise() {
		edgeTemp = cube[1][0][0];
		cornerTemp = cube[2][0][0];
		
		//Edges
		cube[1][0][0] = cube[2][0][1];
		cube[2][0][1] = cube[1][0][2];
		cube[1][0][2] = cube[0][0][1];
		cube[0][0][1] = edgeTemp;
		
		//Corners
		cube[2][0][0] = cube[2][0][2];
		cube[2][0][2] = cube[0][0][2];
		cube[0][0][2] = cube[0][0][0];
		cube[0][0][0] = cornerTemp;
	}
	
	public void greenCounterClockwise() {
		edgeTemp = cube[1][0][0];
		cornerTemp = cube[2][0][0];
		
		//Edges
		cube[1][0][0] = cube[0][0][1];
		cube[0][0][1] = cube[1][0][2];
		cube[1][0][2] = cube[2][0][1];
		cube[2][0][1] = edgeTemp;
		
		//Corners
		cube[2][0][0] = cube[0][0][0];
		cube[0][0][0] = cube[0][0][2];
		cube[0][0][2] = cube[2][0][2];
		cube[2][0][2] = cornerTemp;
	}
	
	public void yellowClockwise() {
		edgeTemp = cube[1][0][2];
		cornerTemp = cube[2][0][2];
		
		//Edges
		cube[1][0][2] = cube[2][1][2];
		cube[2][1][2] = cube[1][2][2];
		cube[1][2][2] = cube[0][1][2];
		cube[0][1][2] = edgeTemp;
		
		//Corners
		cube[2][0][2] = cube[2][2][2];
		cube[2][2][2] = cube[0][2][2];
		cube[0][2][2] = cube[0][0][2];
		cube[0][0][2] = cornerTemp;
	}
	
	public void yellowCounterClockwise() {
		edgeTemp = cube[1][0][2];
		cornerTemp = cube[2][0][2];
		
		//Edges
		cube[1][0][2] = cube[0][1][2];
		cube[0][1][2] = cube[1][2][2];
		cube[1][2][2] = cube[2][1][2];
		cube[2][1][2] = edgeTemp;
		
		//Corners
		cube[2][0][2] = cube[0][0][2];
		cube[0][0][2] = cube[0][2][2];
		cube[0][2][2] = cube[2][2][2];
		cube[2][2][2] = cornerTemp;
	}
	
	public void randomMove() {
		rand = rng.nextInt(12);
		switch (rand) {
		case 0:
			whiteClockwise();
			break;
		case 1:
			whiteCounterClockwise();
			break;
		case 2:
			blueClockwise();
			break;
		case 3:
			blueCounterClockwise();
			break;
		case 4:
			orangeClockwise();
			break;
		case 5:
			orangeCounterClockwise();
			break;
		case 6:
			redClockwise();
			break;
		case 7:
			redCounterClockwise();
		case 8:
			greenClockwise();
			break;
		case 9:
			greenCounterClockwise();
			break;
		case 10:
			yellowClockwise();
			break;
		case 11:
			yellowCounterClockwise();
			break;
		}
	}
	
	public int[] toArray() {
		int[] rubixCubeArray = new int[27];
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					rubixCubeArray[count] = cube[i][j][k];
					count++;
				}
			}
		}
		return rubixCubeArray;
	}
}
