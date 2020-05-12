public class Main {
    public static void main(String[] args) {
        double[] input = {1.0, 0.9, 0.81, 0.243, 0.9, 1.0, 0.9, 0.81, 0.81, 0.9, 1.0, 0.9, 0.243, 0.81, 0.9, 1.0};

        Complex[] cinput = new Complex[input.length];
        for (int i = 0; i < input.length; i++)
            cinput[i] = new Complex(input[i], 0.0);

        FastFourierTransform.fft(cinput);

        System.out.println("Results:");
        for (Complex c : cinput) {
            System.out.println(c);
        }
    }
}
