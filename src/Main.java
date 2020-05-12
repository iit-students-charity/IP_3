public class Main {
    public static void main(String[] args) {
        double[] input = {1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0};

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
