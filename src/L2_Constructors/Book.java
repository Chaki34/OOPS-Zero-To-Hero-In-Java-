package L2_Constructors;

public class Book {

     String  title;
     String  author;
     double  pages;
     double  price;

  // default constructor

    public Book(){

    }


    // parameterized  constructor

    public  Book(String title,String author,double price,double pages){

        this.title = title;
        this.author = author;
        this.pages= pages;
        this.price = price;

    }

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    // copy constructor

    public  Book (Book copybook){

        this.title = copybook.title;
        this.author = copybook.author;
        this.pages = copybook.pages;
    }




    public void Display(){
        System.out.println("Book Title:"+title);
        System.out.println("Book Author:"+author);
        System.out.println("Book Pages:"+pages);
        System.out.println("Book Price:"+price);
    }



    public void  Print(){
        System.out.println("Msg from Book class");
    }
}
