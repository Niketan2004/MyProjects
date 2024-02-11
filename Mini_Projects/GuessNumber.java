package Mini_Projects;

import java.util.Scanner;

public class GuessNumber {
     public static void main(String[] args) {
          int a= (int)(Math.random()*100);
          System.out.println("Guess a random number!");
          Scanner sc= new Scanner(System.in);
          int b=sc.nextInt();
do
{
if (b<a) {
     System.out.println("Your guessed number is less than original number");
     System.out.println("Guess little bit high number...");
     //System.out.println("Chance left:  "+i);
     b=sc.nextInt();

}
else if (b>a) {
     System.out.println("Your guessed number is greater than original");
     System.out.println("Guess little bit low number...");
    // System.out.println("Chance left:  "+i);
     b=sc.nextInt();

}
     }

     while(b!=a);
     if (a==b) {
          System.out.println("\b \r CONGRATULATIONS!!!!....Your Guess is RIGHT!!! ");
     }
  


// if (i==0) {
//      System.out.println("GAME OVER!!!!...Your chances are Finish...");
//      System.out.println("BETTER LUCK NEXT TIME!!!!...");
// }
// }
// while( i!=0);
     }
    
     }

