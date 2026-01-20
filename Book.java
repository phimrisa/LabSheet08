public class Book {
    private String title;
    private int totalBook;
    private int availableBook;

    public Book(String title, int totalBook) {
        this.title = title;
        this.totalBook = totalBook;
        this.availableBook = totalBook;
    }

    public Book(String title){
        this.title = title;
        this.totalBook = 0;
        this.availableBook = totalBook;
    }

    public Book(){
        this.title = "";
        this.totalBook = 0;
        this.availableBook = totalBook;
    }

    public String getTitle(){
        return this.title;
    }

    public int getTotalBook(){
        return this.totalBook;
    }

    public int getAvailableBook(){
        return this.availableBook;
    }

    public void borrowBook(){
        if(this.availableBook > 0){
            this.availableBook--;
        }
    }

    public void returnBook(){
        if(availableBook < totalBook){
            this.availableBook++;
        }
    }
}
