package Mini_Projects;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

class Library {
     @SuppressWarnings({ "unchecked", "rawtypes" })
     // For storing Available books
     private LinkedList<String> AvailBooks = new LinkedList();

     @SuppressWarnings({ "rawtypes", "unchecked" })
     // for storing issued books
     private LinkedList<String> IssuedBooks = new LinkedList();
     // for storing name of customer and purchased book
     private Map<String, String> customerPurchases = new HashMap<>();
     Scanner sc = new Scanner(System.in);

     // method for adding books in database
     public void addBook() {
          System.out.println("------------------------------------------------");
          System.out.println("Enter name of Book");
          String b = sc.nextLine();
          AvailBooks.add(b);
          System.out.println("Book Added Successfully!");
          System.out.println("------------------------------------------------");
     }

     // method for issuing books for customer
     public void issueBook() {
          System.out.println("------------------------------------------------");
          // checks available books
          if (AvailBooks.isEmpty()) {
               System.out.println("Books are not Available!");
          } else {
               System.out.println("Available Books are :- ");
               System.out.println(AvailBooks);
          }
          System.out.println("---------------------------------------------");
          System.out.println("Enter the name of the book you want to buy:");
          String n = sc.nextLine();
          // sc.nextLine();
          System.out.println("Enter the name of Customer");
          String name = sc.nextLine();
          if (AvailBooks.contains(n)) {
               System.out.println("Your Selected Book is Issued to you...!");
               customerPurchases.put(name, n);
               AvailBooks.remove(n);
               IssuedBooks.add(n);

          } else {
               System.out.println("Your Entered Book is not Found!");
          }
          System.out.println("------------------------------------------------");
     }

     // method to returned book
     public void returnBook() {
          System.out.println("------------------------------------------------");
          // checks if issued book data is empty or not
          if (IssuedBooks.isEmpty()) {
               System.out.println("No Book is Issued to anyone!");
          } else {
               System.out.println("Enter the Name of the Book without any Mistakes:");
               String n = sc.nextLine();
               // sc.nextLine();
               System.out.println("Enter the name of Customer");
               String name = sc.nextLine();
               if (IssuedBooks.contains(n) && customerPurchases.containsKey(name)) {
                    System.out.println("Your book is Returned Successfully!");
                    IssuedBooks.remove(n);
                    AvailBooks.add(n);
               } else {
                    System.out.println("Please Enter the name Correctly!");
               }
          }
          System.out.println("------------------------------------------------");
     }

     // displays available books
     public void showAvailableBooks() {
          System.out.println("------------------------------------------------");
          // boolean availableBooks = false;
          if (AvailBooks.isEmpty()) {
               System.out.println("Books are not Available!");
          } else {
               System.out.println("Available Books are :- ");
               System.out.println(AvailBooks);
          }
          System.out.println("------------------------------------------------");

     }

}

// main class
public class LibraryManagement {
     public static void main(String[] args) {
          Library l = new Library();
          System.out.println("--------------WELCOME TO THE LIBRARY--------------");
          int choice;
          boolean validChoice = false;
          Scanner sc = new Scanner(System.in);
          do {
               try {
                    System.out.println("Enter your choice:");
                    System.out.println("1. Add Book");
                    System.out.println("2. Issue a Book");
                    System.out.println("3. Return a Book");
                    System.out.println("4. Show Available Books");
                    System.out.println("5. EXIT");
                    choice = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    switch (choice) {
                         case 1:
                              l.addBook();
                              break;
                         case 2:
                              l.issueBook();
                              break;
                         case 3:
                              l.returnBook();
                              break;
                         case 4:
                              l.showAvailableBooks();
                              break;
                         case 5:
                              System.out.println("-------------Thanks For Visiting-----------");
                              validChoice = true;
                              break;
                         default:
                              System.out.println("Enter a valid choice.");

                              break;
                    }
               } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.nextLine(); // Consume the invalid input
               }

          } while (!validChoice);
          sc.close();
     }
}
