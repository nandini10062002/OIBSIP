import java.util.*;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game!!");
        System.out.println("Game will have 8 Rounds.");
        System.out.println("""
                Before going ahead there are some rules/instructions you have to follow...

                1.Select any number in between 1-100.
                2.Now system will select a number
                3.If your number matches with the system you will earn 2 bonus points
                4.But if your number doesn't matches with system number you will not get any point.
                You are Good To Go
                Enjoy your Game.
                Wish You Luck!!!""");
        char ch;
        do{
            game();
            System.out.println("Do you want to proceed further y/n ?");
            ch=sc.next().charAt(0);
        }while(ch=='y');
  }
  public static void game(){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int count=0;
        while(count<9){
            System.out.println("\nEnter Your Number :");
            int userNum=sc.nextInt();
            int sysNum=r.nextInt(99);
            System.out.println();
            count++;
            int point=0;
            if(count==8){
                System.out.println("OOPS! You didn't get correct guess in 8 guesses");
                break;
            }
            if(userNum==sysNum){
                System.out.println("Congratulations! Your & System number matches!");
                System.out.println("You win in "+count+" guesses!");
                System.out.println("Score : "+(point+(2*count)));
                break;
            }else if(userNum>sysNum){
                System.out.println("Try Again! Your number is greater than System Number");
                System.out.println("Score : "+point);
            }else{
                System.out.println("Try Again! Your number is smaller than System Number");
                System.out.println("Score : "+point);
            }

        }
  }
}