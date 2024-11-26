//task 4
class Library {
  
  public int cap = 0;
  
  
  public int books = 0;
  
  
  
   String [] list = new String [cap];
  
  
  
  public  void setBookCapacity(int x){
    this.cap = x;
     this.list = new String [cap];
    
  }
  
  public  void addBook(String x){
    if(books<cap){
    
    list[books]=x;
    books+=1;
   
    System.out.println("Book " + x +  " added to the library");
    }
    else{
      System.out.println("Maximum capacity exceeds. You cant add more than " + cap +   " books");
    }


  }
  
  
  public void printDetail(){
    
    System.out.println("Maximum Capacity:" + cap );
    
      System.out.println("Total Books:" + books);
      
      System.out.println("Book list:");
      
      
      for(int i =0 ; i <books; i++){
       System.out.println(list[i]);
       }
   
    
}
}
  
  