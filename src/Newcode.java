public class Newcode {
    public static void main(String[] args){

        System.out.println("Grading System ");

        int a = 0;

        if(a >= 70 && a <= 100){
            System.out.println("A");
        }

        else if (a>=60 && a<=69){
            System.out.println("B");
        }
        else if (a>=50 && a<=59){
            System.out.println("C");

        }

        else if (a>=0 && a<49){
            System.out.println("F");
        }
        else {
            System.out.println("Invalid");
        }


        

    }
    
    
}

