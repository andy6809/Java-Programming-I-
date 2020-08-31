
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text;
        
        while (true){
            text = scanner.nextLine();
            String[] word = text.split(" ");
            
            if(text.equals("")){
                break;
        }
            
            for(int i = 0; i < word.length; i++){
                if(word[i].contains("av")){
                    System.out.println(word[i]);
                }
            }
    }
}
}