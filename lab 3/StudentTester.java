//task 6
class Student{
  public String name= "not set";
  
  public String department = "CSE";
  
  public double cgpa = 0.0;
  
  public int credit = 9;
  
  public String s = "not set";
  
  public String e = "not set";
  
  
  
  
  public void showDetails(){
    
    System.out.println("Name :  " + name );
    
     System.out.println("Department : " + department);
     
      System.out.println("CGPA : " + cgpa);
     
     System.out.println("Credit : " + credit );
     
     System.out.println("Scholarship status : " + e  );
  
  }
 
  
  public void updateDetails(String name , double cgpa , int credit ){
    
    this.name = name;
    this.cgpa= cgpa;
    this.credit=credit;
    
    
    
    if(cgpa >=3.7){
      
      
      this.s= " eligible for Merit based scholarship";
      this.e="Merit based scholarship";
      
    }
    
    
    
    else if(cgpa>=3.5 && credit>10){
       this.s= "eligible for scholarship.";

       this.e="eligible for scholarship.";
     }
     else if (cgpa>=3.5 &&  cgpa<3.7){
       
        this.s= " eligible for Need-based scholarship";
        this.e="Need-based scholarship";
        
        
     }
     
     else{
       this.s=" not eligible for scholarship";
       this.e="No scholarship";

     }
     }
  
  public void updateDetails(String name , double cgpa  ){
    
    this.name = name;
    this.cgpa= cgpa;
  
    
    
    
    if(cgpa >=3.7){
      
      
      this.s= " eligible for merit based scholarship" ;
        this.e="Merit based scholarship";
      
    }
    
    
    
    else  if(cgpa>=3.5 && credit>10){
       this.s= " eligible for  scholarship";
       this.e=" eligible for  scholarship";
     }
    
    else  if(cgpa>=3.5 && cgpa<3.7){
       this.s= " eligible for  need based scholarship";
       this.e=" need based scholarship";
     }
     
     
     else{
       this.s=" not eligible for scholarship";
       this.e="No scholarship";

     }
     }
  
  public void updateDetails(String name , double cgpa , int credit, String dep ){
    
    this.name = name;
    this.cgpa= cgpa;
    this.credit=credit;
    this.department=dep;
    
    
    
    if(cgpa >=3.7){
      
      
      this.s= " eligible for Merit based  scholarship";
      this.e="Merit based scholarship";
      
    }
    
    
    
   else  if(cgpa>=3.5 && credit>10){
       this.s= " eligible for need based scholarship";
       this.e="need based scholarship";
     }
     else if (cgpa>=3.5 &&  cgpa<3.7){
       
        this.s= " eligible Need based scholarship";
        
     }
     
     else{
       this.s=" not eligible for scholarship";
       this.e="No scholarship";

     }
     }
  
  
  
  
  public void  checkScholarshipEligibility(){
    
    
    System.out.println( this.name + " is" + this.s); 
  
  

  }
}

    
  
  
  
