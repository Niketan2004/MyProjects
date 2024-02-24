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
          int count = 0;
          Scanner sc = new Scanner(System.in);
          while (chance != 0) {

               // do {
                    System.out.println("Enter your Guessed Number:- ");

                    try {
                         num = sc.nextInt();

                         if (num == Rnum) {
                              if (count == 0) {
                                   System.out.println("Congratulation!!!!YOU GOT RIGHT ANSWER at FIRST TRY!!!!!!!!!!!!");
                                             break;
                              } else {
                                   System.out.println("Congratulation!!!!YOU GOT RIGHT ANSWER...");
                                   System.out.println("You took " + count + " Attempts");
                                //  break;
                              }
                              break;
                         } else if (num > Rnum) {
                              System.out.println("Too HIGH!!!!!!");
                         } else if (num < Rnum) {
                              System.out.println("Too LOW!!!!!");
                         }
                         count++;
                         chance--;
                         if (chance == 0) {

                              if (num == Rnum) {
                                   System.out.println("Congratulations!!! You got Right Answer!");
                                   System.out.println("Your Attempts are " + count);
                                   break;
                              }
                              System.out.println("*********GAME OVER !!!!!*********");
                              System.out.println("~~~~~~~~~The Number you have Chosen is not Correct~~~~~~~~~");
                              System.out.println("The Correct Number is  " + Rnum);
                              System.out.println("Your Chances are Finished....Better Luck Next Time!");

                              break;
                         }
                    } catch (Exception e) {
                         System.out.println("Enter a Number not Character!");
                         sc.next();
                    }
               // } while (num != Rnum);
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
          boolean exit = false;
          do {
               try {
                    int n = sc.nextInt();
                    switch (n) {

                         case 1:
                              gnum.chance = Integer.MAX_VALUE;
                              exit = true;
                              break;
                         case 2:
                              gnum.chance = 20;
                              exit = true;
                              break;
                         case 3:
                              gnum.chance = 10;
                              exit = true;
                              break;
                         case 4:
                              gnum.chance = 5;
                              exit = true;
                              break;
                         case 5:
                              gnum.chance = 3;
                              exit = true;
                              break;
                         default:
                              System.out.println("Enter a Valid choice!");
                              exit = true;
                              break;

                    }
               } catch (Exception e) {
                    System.out.println("You have Entered Wrong Choice!..Please Enter a Valid Number");
                    sc.nextLine();
               }
          } while (!exit);
          gnum.Result();

     }
}
