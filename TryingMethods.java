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

    // Even Numbers
    public static void evenNumbers() {
        int sumOfEven = 0;
        for (int i = 12; i < 103; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            } else
                ;
        }

        System.out.println(sumOfEven);
    }

    // Days of week
    public String daysOfWeek(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednasday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Put the correct Number of day";
        }
    }

    // Authentication
    public void authentication(String userName, String password) {
        if (userName == "Ozioma" & password == "Ozioma123") {
            System.out.println("Authentication Success");
        } else if (userName == "Favour" & password == "Favour123") {
            System.out.println("Authentication Success");
        } else
            System.out.println("Wrong Username or Password !");
    }
}
