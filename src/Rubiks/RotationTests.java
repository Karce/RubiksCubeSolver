package Rubiks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the rotation of the Rubik's Cube.
 * @author karce
 *
 */
public class RotationTests {
	RubiksCube rubble = new RubiksCube();

	@Test
	public void whiteFaceClockwise() {
		rubble.whiteClockwise();
		rubble.whiteClockwise();
		rubble.whiteClockwise();
		rubble.whiteClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void whiteFaceCounterClockwise() {
		rubble.whiteCounterClockwise();
		rubble.whiteCounterClockwise();
		rubble.whiteCounterClockwise();
		rubble.whiteCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void whiteFaceInverse() {
		rubble.whiteClockwise();
		rubble.whiteCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void blueFaceClockwise() {
		rubble.blueClockwise();
		rubble.blueClockwise();
		rubble.blueClockwise();
		rubble.blueClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void blueFaceCounterClockwise() {
		rubble.blueCounterClockwise();
		rubble.blueCounterClockwise();
		rubble.blueCounterClockwise();
		rubble.blueCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void blueFaceInverse() {
		rubble.blueClockwise();
		rubble.blueCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void orangeFaceClockwise() {
		rubble.orangeClockwise();
		rubble.orangeClockwise();
		rubble.orangeClockwise();
		rubble.orangeClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void orangeFaceCounterClockwise() {
		rubble.orangeCounterClockwise();
		rubble.orangeCounterClockwise();
		rubble.orangeCounterClockwise();
		rubble.orangeCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void orangeFaceInverse() {
		rubble.orangeClockwise();
		rubble.orangeCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void redFaceClockwise() {
		rubble.redClockwise();
		rubble.redClockwise();
		rubble.redClockwise();
		rubble.redClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void redFaceCounterClockwise() {
		rubble.redCounterClockwise();
		rubble.redCounterClockwise();
		rubble.redCounterClockwise();
		rubble.redCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void redFaceInverse() {
		rubble.redClockwise();
		rubble.redCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void greenFaceClockwise() {
		rubble.greenClockwise();
		rubble.greenClockwise();
		rubble.greenClockwise();
		rubble.greenClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void greenFaceCounterClockwise() {
		rubble.greenCounterClockwise();
		rubble.greenCounterClockwise();
		rubble.greenCounterClockwise();
		rubble.greenCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void greenFaceInverse() {
		rubble.greenClockwise();
		rubble.greenCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void yellowFaceClockwise() {
		rubble.yellowClockwise();
		rubble.yellowClockwise();
		rubble.yellowClockwise();
		rubble.yellowClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void yellowFaceCounterClockwise() {
		rubble.yellowCounterClockwise();
		rubble.yellowCounterClockwise();
		rubble.yellowCounterClockwise();
		rubble.yellowCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void yellowFaceInverse() {
		rubble.yellowClockwise();
		rubble.yellowCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
	
	@Test
	public void generalFaceTests() {
		rubble.blueClockwise();
		rubble.redClockwise();
		rubble.greenClockwise();
		rubble.orangeClockwise();
		rubble.orangeCounterClockwise();
		rubble.greenCounterClockwise();
		rubble.redCounterClockwise();
		rubble.blueCounterClockwise();
		Assert.assertTrue(rubble.isSolved());
	}
}
