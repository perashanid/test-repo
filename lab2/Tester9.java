public class Tester9{
  public static void main(String[]args){
     CellPhone phone1 = new CellPhone();
     phone1.printDetails();
     phone1.model ="Nokia 1100";
     System.out.println("1##################");
     phone1.storeContact("Joy - 01834");
     System.out.println("===================");
     phone1.printDetails();
     System.out.println("2##################");
     phone1.storeContact("Toya - 01334");
     phone1.storeContact("Aayan - 01135");
     System.out.println("===================");
     phone1.printDetails();
     System.out.println("3##################");
     phone1.storeContact("Sani - 01441");
     System.out.println("===================");
     phone1.printDetails();  
  }
}


class  CellPhone {
  
 String [] storage = new String[3];
  
 
  public String model = "unknown" ;
  
  public int  contact = 0;
   
  public void storeContact(String x){
    if(contact<3){
      
      storage[contact] = x ;
      contact++;
      System.out.print("contact saved " );
      
    }
    else{
      System.out.println("memory full.new contact cant be stored.");
      
    }
  }
  public void printDetails(){
    System.out.println( "phone model " + model + "\ncontact stored "  + contact );
    
    for(  String  contact  : storage){
      System.out.println(contact);
    }
  }
}
        
    
    


     
    
    
    
    
    
    