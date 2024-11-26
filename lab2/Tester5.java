public class Tester5{
  public static void main(String[] args) {
    Course c1 = new Course();
    Course c2 = new Course();  
    System.out.println("========== 1 ==========");
    c1.updateDetails("Programming Language I","CSE110", 3);
    c1.displayCourse(); 
    System.out.println("========== 2 ==========");
    c2.updateDetails("Data Structures","CSE220",3);
    c2.displayCourse();  
    System.out.println("========== 3 ==========");
    c1.updateDetails("Programming Language II","CSE111",3);
    c1.displayCourse();
  }
}

class Course {
  public String name;
  public String code ;
  public int credit ;
  
  
  
  public void updateDetails( String  name , String code , int credit ){
    
    this.name = name;
    this.code = code;
    this.credit = credit;
    
  }
  
  public  void displayCourse(){
    
    
    System.out.print( "Course Name: " + name +"\ncourse Code : " + code + "\nCourse Credit : " + credit ) ;
    
    System.out.println();
      
  }
}
