package mypack;

public class Book {

   protected int bcode;
   protected String title;

   public Book(){}
   public Book(int bcode, String title){
      this.bcode=bcode;
      this.title=title;
      }

  public String toString(){
    return "Code : "+bcode+"\nTitle : "+title;
   }
}
