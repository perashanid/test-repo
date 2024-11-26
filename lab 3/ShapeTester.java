//task 2

class Shape {
  public String shape;
   
  public double area;
  
  public void setParameters(String x , double y ){
    
    this.shape=x;
    this.area = 3.1416*y*y;
    
    }
    
    public  void setParameters(String x , double y, double z ){
      
     
    
    this.shape=x;
    if(shape.equals("Triangle")){
      
      this.area = 0.5*y*z;}
       
       if(shape.equals("Rectangle")){
      
      this.area = y*z;}
    
    
  }
  
  
  public  String details(){
    
    return "Shape Name:" + shape + "\nArea:" + area;
 
  }
  
  
}

  
  
  
  
