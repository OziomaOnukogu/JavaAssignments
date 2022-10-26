public class TryingMethods {
    // Main method
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * If you want to execute a method
         * Just Call it inside the main method .
         * Like This
         */
        System.out.println(add());
    }

    public static int add() {
        int result = 0;
        int i = 1;

        while (i < 1000) {
            result += i;

            i++;
        }

        return result;
    }

}
