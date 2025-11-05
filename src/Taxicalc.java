import java.util.Scanner;
public class Taxicalc {
    public static void main(String[] args) {
        System.out.println("Taxi Fare Calculator");
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        double km = sc.nextDouble();
        float price;
        
        if(time >= 7 && time < 23) { // Day time: 7:00 - 22:59
            price = 10;
            if(km > 4) {
                price += (km - 4) * 1.9;
            }
        } else { // Night time: 23:00 - 6:59
            price = 11;
            if(km > 4) {
                price += (km - 4) * 2.2;
            }
        }
        
        System.out.println("Total Fare: " + price + " YUAN");
        sc.close();
    }
}