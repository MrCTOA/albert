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
	String actType;
	String costType;
	Node[] in;
	ArrayList<Node[]> hidden;
	Node[] out;
	float learnRate = 0.03;

	public NeuralNet(String actType_, String costType_, int nI, int[] nH, int nO) {
		actType = actType_;
		costType = costType_;

		in = new Node[nI];

		hidden = new ArrayList<Node[]>();
		for(int i = 0; i < nH.length; i++) {
			hidden.add(new Node[nH[i]]);
		}

		out = new Node[nO];
	}

	void calcCost(String type, float[] y) {
		int sigma;

		for(int i = 0; i < hidden.size(); i++) {
			for(int q = 0; q < hidden.get(i).length; q++) {
				sigma += hidden.get(i[q]).calcCost(type);
			}
		}
	}

	// This training methods is purely for testing
	void train(float[] x, float[] y) {
		this.push(x);
		this.calcCost(costType, y);
		}
	}

	// Pushes inputs to input nodes based on position
	void push(float[] x) {
		for(int i = 0; i < x.length; i++) {
			if(i < in.length) {
				in[i].receive(x[i]);
			}
		}
	}

	// Cycles network with data stored in input nodes
	void cycle() {
		// TODO
	}
}
