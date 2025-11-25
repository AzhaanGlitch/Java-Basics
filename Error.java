public class Error{
    public static void main (String[] args){
        int numerators = {10, 200, 30, 40};
        int denominators = {1, 2, 0, 4};

        for (int i = 0; i < numerators.length; i++){
            System.err.println(divide(numerators[i], denominators[i]));
        }

        System.err.println("Good Job :)");
    }

    public static int divide (int a, int b){
        return a/b;
    }
}