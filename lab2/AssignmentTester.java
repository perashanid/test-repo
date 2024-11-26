public class AssignmentTester{
  public static void main(String [] args){
    Assignment as1 = new Assignment();
    as1.printDetails();
    System.out.println("1---------------");
    as1.tasks = 11;
    as1.difficulty = "Moderate";
    as1.submission = true;
    as1.printDetails();
    System.out.println("2---------------");
    System.out.println(as1.makeOptional());
    System.out.println("3---------------");

     as1.printDetails();
    System.out.println("4---------------");
    Assignment as2 = new Assignment();
    as2.tasks = 12;
    as2.difficulty = "Hard";
    as2.submission = false;
    as2.printDetails();
    System.out.println("5---------------");
    System.out.println(as2.makeOptional());
  }
}


class Assignment {
  public int tasks = 0;
  
  public String difficulty ;
  
  public boolean submission = false;
  
  
  public void printDetails(){
    
    System.out.print("number of tasks : " + tasks +"\nDifficulty level : " + difficulty +"\nsubission required : " + submission  );
    System.out.println();
  }
  
  public boolean   makeOptional(){
    if(submission){
    System.out.println("assignment will not not require submission " );
     submission =false;
     return submission;
  }
    
    else{
      System.out.println("assignment will not not require submission " );
      return submission;
      
}
  } 
}
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  