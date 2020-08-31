
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine()); 
        int res;
        
        if(num < 0){   
            res = num * (-1);
            System.out.println(res);
        } else {
            System.out.println(num);
        }
        

    }
}
