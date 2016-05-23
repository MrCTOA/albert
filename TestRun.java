/*
 * TestRun
 * - For use with the Albert Network Library (ANL)
 *
 * Jake Dunkley
 *
 * 05-14-2016
 *
 * CC BY-NC-SA 4.0
 */

 public class TestRun {
 	public static void main(String[] args) {
 		// TODO
 		NeuralNet net = new NeuralNet("sigmoid", "quad", 1, new int[]{1}, 1);

 		float[] testX = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 		float[] testY = {1, 4, 9, 16, 25, 36, 49, 64, 81};

 		//net.train(testX, testY);

 		net.push(new int[]{20});
 		net.cycle();
 	}
 }