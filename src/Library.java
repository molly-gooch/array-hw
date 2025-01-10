import java.sql.SQLOutput;

public class Library {

    public Book giver;
    public String owner = "Molly";
    public Book[] allBooks;
    public double t = 0;

    public static void main(String[] args) {
        Library Library = new Library();
        //TODO: Make an instance of the main class
    }

    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        //TODO: Give the array allBooks a size of 10

        allBooks = new Book[10];

        //TODO: Fill the array allReviews with reviews with random ratings from 0 to 10 inclusive

        for(int i=0; i<allBooks.length; i=i+1){
            int rate = (int)(Math.random()*11);
            giver = new Book(rate);
            allBooks[i]=giver;

            t=t+rate;
        }

        //TODO: print all the ratings in the array allReviews

        for(int x=0; x<allBooks.length; x=x+1){
            allBooks[x].print();
        }

        
        //TODO: Call the method averageRating
            averageRating();
    }

    public void averageRating(){
        //TODO: calculate the average rating from the array allReviews and print it
        t=t/10;
        System.out.println("average rating: " +t);
    }
}
