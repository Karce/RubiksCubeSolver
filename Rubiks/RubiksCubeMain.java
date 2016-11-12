import java.util.Arrays;

/**
 * Runs the solver
 * @author karce
 *
 */
public class RubiksCubeMain {
	public static RubiksCube rubble;
	public static long attempts;
	public static boolean trigger = true;
	
	public static void main(String args[]) {
		rubble = new RubiksCube();
		attempts = 0;
		
		for(int i = 0; i < 20; i++) {
			rubble.randomMove();
		}
		
		Solver doIt = new Solver();
		Checker checkIt = new Checker();
		Checker checkItToo = new Checker();
		
		doIt.start();
		checkIt.start();
		checkItToo.start();
	}
	
	public static class Solver extends Thread {
		@Override
		public void run() {
			while (trigger) {
				rubble.randomMove();
			}
		}
	}
	
	public static class Checker extends Thread {
		@Override
		public void run() {
			while (trigger) {
				if (rubble.isSolved()) {
					trigger = false;
					System.out.println("Solved! In only: " + attempts + " attempts.");
				}
				attempts++;
			}
		}
	}
}

