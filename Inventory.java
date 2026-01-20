public class Inventory {
    //Attributes
    private String name;
    private int stock;

    //Overloading Constructor #1
    public Inventory(String name, int stock){
        this.name = name;
        this.stock = stock;
    }

    //Overloading Constructor #2
    public Inventory(String name){
        /*
        this.name = name;
        this.stock = 0;
        */
        this(name, 0);
    }

    //Overloading Constructor #3
    public Inventory(int stock){
        /*
        this.name = "";
        this.stock = stock;
        */
        this("", stock);
    }

    //Default Constructor
    public Inventory(){
        this("", 0);
    }

    //getName()
    public String getName(){
        return this.name;
    }

    //getStock()
    public int getStock(){
        return this.stock;
    }

    //addStock()
    public void addStock(int amount){
        if(amount > 0){
            this.stock += amount;
        }
    }

    //removeStock()
    public void removeStock(int amount){
        if(amount > 0 && amount <= this.stock){
            this.stock -= amount;
        }
    }
}