public class Newcode {
    public static void main (String[] args) {
        System.out.println("Student Grading System");
        int score = 30;

        if(score >= 70 && score <= 100) {
            System.out.println("A");
        }
        else if (score >= 60 && score <=69){
            System.out.println("B");
        }
        else if (score >= 50 && score <=59){
            System.out.println("C");
        }
        else if (score >= 40 && score <=49){
            System.out.println("D");
        }
        else if (score>=0 && score <=39){
            System.out.println("F");
        }
        else{
            System.out.println("Invalid Score");
        }

    }
    
    
}

