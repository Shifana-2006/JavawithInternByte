import java.util.*;
public class Main{
    public static void main(String[] args){
        int randomnum=(int)(Math.random()*100)+1;
        System.out.println("*****Welcome To Our NumberGuessing Game*****");
        int usernum=0;
        int attempts=0;
        int maxattempts=8;
        while(attempts<maxattempts){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Userguess:");
            usernum=input.nextInt();
            attempts++;
            if(usernum==randomnum){
                System.out.println("Wow,You guessed correctly!");
                break;
            }
            else if(usernum>randomnum){
                System.out.println("Too High,Try Again!");
            }
            else {
                System.out.println("Too Low,Try Again!");
            }
            System.out.println("Attempts left:"+(maxattempts-attempts));
        }
        if(usernum!=randomnum){
            System.out.println("You guessed Wrongly!");
            System.out.println("The Random Number was:"+randomnum);
        }
        System.out.println("Thanks for playing!");
    }
}