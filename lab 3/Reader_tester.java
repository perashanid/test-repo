//task 8 

class Reader{
  
  public String name= "new user";
  
  public int capacity=0;
  
  
  int index=0;
  
  
  public String [] shelf ;
  
  
  public  String createReader(String x,int y){
    
    this.name = x ;
    this.capacity=y;
    this.shelf = new String[capacity];
    
    
    
   
    
   return "A new reader is created!";
    
  }
  public  void readerInfo(){
    
    System.out.println("Name : " + name);
    
    System.out.println("capacity : " + capacity);
    
    System.out.println("Books :");
    
    if(index ==0){
  
  System.out.println("No books added yet");
  
}
else{
  for(int i =0; i<index;i++){
    System.out.println( "Book" + (i+1) + ": " +shelf[i]);
  }
  
}

}
  
  public void addBook(String x ){
    if(index<capacity){
      
     this.shelf[index]=x;
      index++;
      
    }
    
    else {
      System.out.println("no more capacity");
    }
  }
 
  
}


    
    
    
  
    
    
      
    
    
    
    
    

