/*
 * Node
 * - For use with the Albert Network Library (ANL)
 *
 * Jake Dunkley
 *
 * 05-14-2016
 *
 * CC BY-NC-SA 4.0
 */

public class Node {
	ArrayList<float> in;
	float weight;
	float bias;
	float toPush;

	public Node() {
		in = new ArrayList<float>();
		weight = Math.random(10) - 5;
		bias = Math.random(10) - 5;
	}

	// Switch that handles activation function methods
	void activate(String type) {
		float z;
		
		for(int i = 0; i < in.size(); i++) {
			z += in.get(i);
		}

		switch(type) {
			case "sigmoid": // Sigmoid activation function
				toPush = 1/(1 + Math.pow(Math.E, (-z - bias)));
				break;  

			case "relu": // Rectifier Linear Unit activation function
				toPush = Math.log(1 + Math.pow(Math.E, (z - bias)));
				break;

			// Add more here

			default: // If the String received is invalid
				System.out.println("Error: Invalid activation function");
				break;
		}

		toPush *= weight;
	}

	public float calcCost(String type, float y) {
		float c;

		switch(type) {
			case "quad": // Quadratic cost function
				// TODO
				break;

			default: // If the String received is invalid
				System.out.println("Error: Invalid cost function");
				break;
		}
	}

	void pushTo(Node n) {
		n.receive(toPush);
	}

	void receive(float n) {
		in.add(n);
	}

}