package Mini_Projects;

import java.util.Random;
import java.util.Scanner;

class GuessNum {
     int num;
     int chance;
     int Rnum = Rnum();

     public int Rnum() {
          // int Rnum = (int) (Math.random() * 100);
          Random limit = new Random();
          Rnum = limit.nextInt(100);
          return Rnum;
     }

     public void Result() {

          while (chance != 0) {
               int count = 0;
               do {

                    if (num > Rnum) {
                         System.out.println("Your Choice is too Big,Please Enter A Smaller Number");

                    } else {
                         System.out.println("Your Choice is too Small, Please Enter a Greater number");
                    }
                    Scanner sc = new Scanner(System.in);
                    num = sc.nextInt();
                    count++;
                    chance--;
                    if (chance == 0) {

                         if (num == Rnum) {
                              System.out.println("Congratulations!!! You got Right Answer!");
                              System.out.println("Your Attempts are " + count);
                         }
                         System.out.println("*********GAME OVER !!!!!*********");
                         System.out.println("~~~~~~~~~The Number you have Chosen is not Correct~~~~~~~~~");
                         System.out.println("The Correct Number is  " + Rnum);
                         System.out.println("Your Chances are Finished....Better Luck Next Time!");

                         break;
                    }
               } while (num != Rnum);

               if (num == Rnum) {
                    if (count == 0) {
                         System.out.println("Congratulation!!!!YOU GOT RIGHT ANSWER at FIRST TRY!!!!!!!!!!!!");
                    } else {
                         System.out.println("Congratulations!!! You got Right Answer!");
                         System.out.println("Your Attempts are " + count);
                    }
                    break;
               }
          }
     }
}

public class ADVGuessNum {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          GuessNum gnum = new GuessNum();
          System.out.println();
          System.out.println("-----------WELCOME TO GUESS THE NUMBER GAME-----------");
          System.out.println("-----------Number will be Between 0 to 100--------\n");
          System.out.println("******Please Select Difficulty level******\n");
          System.out.println(
                    " 1.Free Mode(Unlimited Chances)  \n 2.Easy mode (20 chances) \n 3.Medium Mode (10 Chances) \n 4.Hard Mode (5 Chances) \n 5.Extreme Mode (3 chances) ");

          int n = sc.nextInt();
          switch (n) {

               case 1 -> gnum.chance = 100000;
               case 2 -> gnum.chance = 20;
               case 3 -> gnum.chance = 10;
               case 4 -> gnum.chance = 5;
               case 5 -> gnum.chance = 3;
               default -> System.out.println("Enter a Valid choice!");

          }
          System.out.println("----------Game is Started----------\n\n");

          System.out.println("Enter number that you choosen:  ");
          gnum.num = sc.nextInt();
          gnum.Result();

     }
}
