import javax.swing.*;

public class BorrowBookTest {
    public static void main(String[] args) {
        Book book = new Book("C# Programming", 5);
        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to borrow books?",
                "Borrow Books", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION){
            if(book.getAvailableBook() != 0){
                book.borrowBook();
                System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
            } else if(book.getAvailableBook() == 0){
                JOptionPane.showMessageDialog(null, "No books available to borrow …",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(null, "END PROGRAM");
        }
    }
}