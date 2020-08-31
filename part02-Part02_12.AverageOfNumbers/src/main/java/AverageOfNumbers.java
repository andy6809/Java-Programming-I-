
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double avg;
        int num;
        int count = 0;
        int sum = 0;
        
        while(true){
            
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0){ 
                avg = (double) sum / count;
                System.out.println("Average of the numbers: " + avg);
                break;
            }
            
            sum = sum + num;
            count++;
            
        }
    }
}