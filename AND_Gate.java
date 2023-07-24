public class AND_Gate {

    //Initializing the biases and weights for the nodes of the network
    private final static int biasHiddenLayerH1=-20;
    private final static int biasHiddenLayerH2=-30;
    private final static int biasOutput=-50;
    private final static int weightH1=10;
    private final static int weightH2=15;
    private final static int weightOutput=25;

    //Function that performs the calculations done at every node and decides to either activate or not depending on the calculated value
    private static int HiddenCalculation(int weight, int bias, int input1, int input2){
        int x = (weight * input1) + (weight * input2) + bias;

        //Activation part of the function
        if(x==0)
            return 1;
        else
            return 0;
    }

    //Function that processes the inputs through the AND gate
    public static int process(int input1, int input2){
        int h1 = HiddenCalculation(weightH1, biasHiddenLayerH1, input1, input2);
        int h2 = HiddenCalculation(weightH2, biasHiddenLayerH2, input1, input2);

        return HiddenCalculation(weightOutput,biasOutput, h1, h2);
    }
}
