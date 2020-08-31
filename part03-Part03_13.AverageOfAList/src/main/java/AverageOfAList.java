
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int num = scanner.nextInt();
            if(num == -1){
                break;
            }
            
            numbers.add(num);
        }
        
        double avg = 0;
        for(int number : numbers){
            avg = avg + number;
        }
        
        System.out.println("Average: " + (avg / numbers.size()));
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
