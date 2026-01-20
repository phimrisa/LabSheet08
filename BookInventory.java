import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        Book books[] = new Book[3];

        for(int i=0; i<books.length; i++){
            String title = JOptionPane.showInputDialog("Enter book title:");
            int totalBook = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number:"));
            books[i] = new Book(title, totalBook);
        }

        for(Book books_ : books) {
            System.out.println(books_.getTitle() + " has " + books_.getTotalBook() + " books, " +
                    "can borrow" + books_.getAvailableBook() + " books.");
        }
    }
}
