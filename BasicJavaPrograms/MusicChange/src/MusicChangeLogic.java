import java.util.Scanner;

public class MusicChangeLogic {
    public static void main(String[] args){
        String song = "Blinding Lights";
        Boolean repeat = true;

        while (repeat){
            System.out.println(song);
            System.out.println("Do you want to change the song?");
            Scanner getInput = new Scanner(System.in);
            String userInput = getInput.nextLine();
            if(userInput.equals("yes")){
                repeat = false;
                System.out.println("We are onto next song!!");
            }
        }
    }
}
