import java.util.Scanner;
public class daynight {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hour");
        int hour = sc .nextInt();
        System.out.println("Enter the Distance");
        double distance = sc.nextDouble();
        double price;
        if(hour >= 7 && hour <=23){
            if(distance <=4){
                price = 10;
            }
            else {
                price = 10 + (distance -4) * 1.9;
            }
        }
        else {
            if(distance <= 4){
                price = 11;
            }
            else {
                price = 11 + (distance -4) * 2.2;
            }
        }
        System.out.printf("The Price is : %.2f YUAN%n",price);
        sc.close();
    }
    
}
