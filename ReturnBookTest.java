import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 5);
        while (true) {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to borrow/return book?",
                    "Borrow/Return Book", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                int choice = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to borrow book\nPress 2 to return book"));

                if (choice == 1) {
                    if (book.getAvailableBook() == 0) {
                        JOptionPane.showMessageDialog(null, "No books available to borrow...",
                                "Warning Message", JOptionPane.WARNING_MESSAGE);
                    } // There are no books available for borrowing.
                    else {
                        book.borrowBook();
                        System.out.println("Borrowed 1 books, available " + book.getAvailableBook() + " books.");
                    }
                } // Borrow the book.
                else if (choice == 2) {
                    if (book.getAvailableBook() == book.getTotalBook()) {
                        JOptionPane.showMessageDialog(null, "Cannot return! All books are already here.",
                                "Warning Message", JOptionPane.WARNING_MESSAGE);
                    } // There is no point in returning the books when no books have been borrowed yet.
                    else {
                        book.returnBook();
                        System.out.println("Return 1 books, available " + book.getAvailableBook() + " books.");
                    }
                } // Return the book.
                else {
                    JOptionPane.showMessageDialog(null, "END PROGRAM");
                    break;
                } // The user enters a number other than 1 or 2.
            } // "Yes" option.
            else {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            } // "No" option.
        }
    }
}
