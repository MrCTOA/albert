/*
 * NeuralNet
 * - For use with the Albert Network Library (ANL)
 *
 * Jake Dunkley
 *
 * 05-14-2016
 *
 * CC BY-NC-SA 4.0
 */

public class NeuralNet {
	Node[] in;
	ArrayList<Node[]> hidden;
	Node[] out;
	float learnRate = 0.03;

	public NeuralNet(int nI, int[] nH, int nO) {
		in = new Node[nI];

		hidden = new ArrayList<Node[]>();
		for(int i = 0; i < nH.length; i++) {
			hidden.add(new Node[nH[i]]);
		}

		out = new Node[nO];
	}

	void calcCost(String type) {
		switch(type) {
			case "quad": // Quadratic cost function
				break;

			default: // If the String received is invalid
				System.out.println("Error: Invalid cost function");
				break;
		}
	}

	// This training methods is purely for testing
	void train(float[] x, float[] y) {
		for(int i = i; i < x.length; i++) {
			// TODO
		}
	}

	// Sends inputs to input nodes based on position
	void input(float x) {
		// TODO
	}

	void pass() {
		// TODO
	}
}
