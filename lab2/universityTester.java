//task 1 

public class universityTester {
  public static void main (String []args){
    
    University uni2 =  new University ();
    University uni1 = new University ();
    
    System.out.println(uni1);
    System.out.println(uni2);
    System.out.println(uni1.name);
    System.out.println(uni1.country);
    System.out.println(uni2.name);
    System.out.println(uni2.country);
    
     uni1.name = "Imperial College London";
     uni1.country = "England";
     
     uni2.name = "Brac country";
     uni2.country = "Bangladesh";
     
     
     
     System.out.println(uni1.name);
    System.out.println(uni1.country);
    System.out.println(uni2.name);
    System.out.println(uni2.country);
     
     
    
  }
   
}

class University{
    public String name;
    public String country;
}

