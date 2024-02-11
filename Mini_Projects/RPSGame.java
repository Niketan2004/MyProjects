package Mini_Projects;

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
     public static void main(String[] args) {
          System.out.println("Enter your choice:-  (0-for Rock    1-for Paper    2-for Scissor)");
          Scanner sc= new Scanner(System.in);
          int Userchoice= sc.nextInt();
          Random random= new Random();
          if (Userchoice!=0 && Userchoice!=1 &&Userchoice!=2) {
               System.out.println("Please Enter a Valid Number...");
            
          }
               int CompChoice= random.nextInt(3);
               if (CompChoice==Userchoice) {
                    System.out.println("Its Draw!!!....");
               }
               else if (Userchoice==0 && CompChoice==2 ||Userchoice==1 && CompChoice==0||Userchoice==2 && CompChoice==1) {
                    System.out.println("You WIN!!!..");
               }
               else{
                    System.out.println("Computer WINS!....");
               }
             //  System.out.println("Computer choice is :-  "+CompChoice);
             if (CompChoice==0) {
               System.out.println("Computer choice is :- Rock ");
             }
             else  if (CompChoice==1) {
               System.out.println("Computer choice is :- Paper ");
             }
             else  if (CompChoice==2) {
               System.out.println("Computer choice is :- Scissor ");
             }
     }
}
