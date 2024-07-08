public class Grader {
    public static void main(String[] args) {
       double averageMarks=80;  
        if (averageMarks >= 93) {
            System.out.println("Grade is A");
        } else if (averageMarks >= 85) {
            System.out.println("Grade is B");
        } else if (averageMarks >= 80) {
            System.out.println("Grade is C");
        } else if (averageMarks >= 75) {
            System.out.println("Grade is D");
        } 
        else {
            System.out.println("Grade is E");
        }

        // Determine pass or fail 
        if (averageMarks >= 75) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
