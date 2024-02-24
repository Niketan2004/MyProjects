# Library Management System

This Java project implements a simple library management system. It allows users to add books to the library, issue books to customers, return books, and display available books.

## Features

- Add Book: Add a new book to the library database.
- Issue Book: Issue a book to a customer by recording the customer's name and the book they purchased.
- Return Book: Allow customers to return a book they previously purchased.
- Show Available Books: Display a list of available books in the library.
- Exit: Exit the library management system.

## Usage

To use this program, follow these steps:

1. Run the `LibraryManagement` class.
2. Choose from the available options by entering the corresponding number:
   - `1`: Add Book
   - `2`: Issue a Book
   - `3`: Return a Book
   - `4`: Show Available Books
   - `5`: EXIT
3. Follow the prompts to complete the selected action.

## File Structure

- `Library.java`: Contains the `Library` class which defines methods for managing the library.
- `LibraryManagement.java`: Main class that contains the `main` method to run the library management system.

## Additional Notes

- The program ensures that the user provides valid input for menu choices.
- Each customer's purchase is recorded using a `HashMap`, associating the customer's name with the book they purchased.
- Books are stored in separate `LinkedList` objects for available books and issued books.

