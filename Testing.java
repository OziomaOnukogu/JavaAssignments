import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
       
        int numberOne = 35;
        String label = "Here";
        boolean hasPass = true;
        double result = 34.22;
        double added = numberOne + result; 
        int studentStore = 60;

        ArrayList<Double> examsScore = new ArrayList<>();
        examsScore.add(34.0);
        

        //if statements
        if (studentStore >= 70) {
            System.out.println("Passing 70");  
        }else if (studentStore >= 60){
            System.out.println("Passing 60");
        }else{
            System.out.println("Passing else");   
        }

        //switch case
        switch (studentStore) {
            case 10:
                System.out.println("Passing 10");
                break;
            case 11:
                System.out.println("Passing 11");
                break;
            default:
                System.out.println("Passing Lass");
                break;
        }


        //loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Passing " + i);
        }

        double balanace = 30.0;
        while (balanace > 10) {
            System.out.println("Balance " + balanace); 
            balanace = balanace - 0.5;
        }

        // sample
        int lowerGradeA = 70;
        int upperGradeA = 99;
        int GradeB = 60 - 69;
        int GradeC = 50 - 59;
        int GradeD = 0 - 49;
        int GradeE = 48;

        int OziomaOnukogu = 49;
        boolean hasA = OziomaOnukogu >= lowerGradeA && OziomaOnukogu <= upperGradeA;

        // if statements
        if (OziomaOnukogu >= lowerGradeA && OziomaOnukogu <= upperGradeA) {
            System.out.println("GradeA");

        } else if (OziomaOnukogu >= 60) {
            System.out.println("GradeB");

        } else if (OziomaOnukogu >= 50) {
            System.out.println("GradeC");

        } else {
            System.out.println("GradeE");
        }
    }
    
    
}
