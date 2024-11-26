//task 3
class Shelf {
  public int capacity = 0;
  
  public int books = 0;
  
  
  public  void showDetails(){
    
    System.out.println( "Shelf capacity: " + capacity + "\nNumber of books: " + books);
  }
  
  public void addBooks(int x){
    if( capacity==0){
      
      System.out.println("Zero capacity. Cannot add books.");
    }
    
    else if(capacity>x+books){
       System.out.println(  x +" books added to shelf");
       books += x;
    }
      
    
    else{
      
      System.out.println("Exceeds capacity");
    }
    
  }
}
  