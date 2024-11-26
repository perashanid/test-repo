//task 5
class TaxiLagbe{
  
  public String number;
  
  public int passenger = 0;
  
  public String list = "";
  
  public String area = " ";
  
  
  
  
  
  
  
  public int fare = 0;
  
  
  
  public void storeInfo(String x , String y ){
    
    this.number= x;
    this.area = y;
    
    System.out.println("Taxi number: " + number );
    
    System.out.println("This taxi can cover"+ area + " area");
    
    System.out.println("Total Passenger:" + passenger);
    
    System.out.println("Total collected fare: " + fare + "taka");
    
  }
  
  public  void addPassenger(String x , int y){
    
    if(passenger<4){
      
    
    this.passenger+=1;
    
    this.fare+=y;
    
    System.out.println("Dear " + x + "! Welcome to TaxiLagbe");
    
    list+=" " + x;
    }
    
    else{
      System.out.println("Taxi Full! No more passengers can be added");
      
    }
  }
    
   public void addPassenger(String x , int xx , String y , int yy){
    addPassenger(x,xx);
    addPassenger(y,yy);
      
      
    }
  

    
    
    
  
  
  public void printDetails(){
     System.out.println("Taxi number: " + number);
    
    System.out.println("This taxi can cover"+ area + " area");
    
    System.out.println("Total Passenger:" + passenger);
    
    System.out.println("Passenger Lists: " + list );
    
    System.out.println("Total collected fare: " + fare + "taka");
    
    
  }
}
  
  

    
  
  
    

    
    
    
    
    
    
    
  
  