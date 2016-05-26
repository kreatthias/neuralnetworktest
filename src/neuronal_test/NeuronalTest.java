package neuronal_test;

import com.dkriesel.snipe.core.NeuralNetwork;
import com.dkriesel.snipe.core.NeuralNetworkDescriptor;
import com.dkriesel.snipe.training.TrainingSampleLesson;

public class NeuronalTest {

	private static double alpha = 0.001;

	public static void main(String[] args) {
		NeuralNetworkDescriptor desc = new NeuralNetworkDescriptor(4, 2, 4);
		desc.setSettingsTopologyFeedForward();

		NeuralNetwork net = new NeuralNetwork(desc);

		int sizeEach;
		int longness;

		double[][] input = {

		};

		double[][] exspectedOutput = {

		};

		// double[] input = new double[sizeEach*longness];
		// for (int i = 0; i < sizeEach*longness; i++) {
		// double random = Math.random()*Math.pow(10, longness);
		// int r = (int) Math.floor(random);
		// input[i] =
		// }

		TrainingSampleLesson lession1 = new TrainingSampleLesson(input, exspectedOutput);
		net.trainBackpropagationOfError(lession1, 100, alpha);

	}
}
