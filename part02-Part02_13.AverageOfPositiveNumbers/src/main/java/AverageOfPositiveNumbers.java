
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstInput = Integer.valueOf(scanner.nextLine());
        int userInput;
        int sum = 0;
        int count = 0;
        
        if (firstInput > 0){
            sum = firstInput;
            count = 1;
        }  
        
        while(true){
            
            if (firstInput == 0){
                System.out.println("Cannot calculate the average");
                break;
            }
            
           
            userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput > 0){
                sum = sum + userInput;
                count++;
            }
            
            if(userInput == 0){
                System.out.println((double)sum / count);
                break;
            }   
            
        }    
    }
    
}    
