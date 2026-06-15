package activities;


abstract class Book {
 String title;

 //Abstract method
 abstract void setTitle(String s);

 //Concrete method
 String getTitle() {
     return title;
 }
}

public class Activity5 {
    public static void main(String[] args) {
        //Create object of MyBook
        MyBook newNovel = new MyBook();

        //Setting the title
        newNovel.setTitle("A Tale of Two Cities");

        //Print title
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
