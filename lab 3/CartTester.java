//task 7
public class CartTester{
  public static void main(String [] args){
     Cart c1 = new Cart (); 
     Cart c2 = new Cart ();
     Cart c3 = new Cart ();

     c1.create_cart(1);
     c2.create_cart(2);
     c3.create_cart(3);
     System.out.println("====1====");
     c1.addItem("Table", 3900.5);
     c1.addItem("Chair", 1400.76);
     c1.addItem(5400.87, "Television");
     c1.addItem(5000.0, "Refrigerator");

     System.out.println("====2====");
     c2.addItem("Stove",439.90);
       
     System.out.println("====3====");
     c3.addItem("Chair",1400.5);
     c3.addItem(3400.0, "Chair");
       
     System.out.println("====4====");
     c1.cartDetails();
       
     System.out.println("====5====");
     c2.cartDetails();
       
     System.out.println("====6====");
     c3.cartDetails();
     c1.giveDiscount(10);
       
     System.out.println("====7====");
     c1.cartDetails();
  }
}


class Cart {
  
  public String item ;
  
  public double cost;
  
  //public int count=0;
  
  public String name;
  
  public double discount = 0;
  
  
  
  public double total =0;
  
  String [] items = new String [3];
  
  double [] costs = new double [3];
  
  int index =0;
  
  
  
  
  
  public void create_cart(int x){
    
    this.name="cart " + x ;
    
  }
  
  
  public void addItem(String i , double c){
    
   
    
    if(index<3){
   this.item = i;
    this.cost=c;
    this.total+=c;
    System.out.println("you have " + (index+1) + " item(s) in your cart now.");
    System.out.println(item + "added to " + this.name);
   items[index]=item;
   costs[index]=cost;
   index++;
   
  }
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  
  public void addItem( double c,String i){
    
   
    
    if(index<3){
   this.item = i;
    this.cost=c;
    this.total+=c;
    System.out.println("you have " + (index+1) + " item(s) in your cart now.");
    System.out.println(item + " added to " + this.name);
    
      items[index]=item;
   costs[index]=cost;
   index++;
    
    
  }
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  
  
  public void cartDetails(){
    System.out.println("your " + this.name);
    
    for(int i =0;i<index;i++){
      System.out.println( items[i] + " - " + costs[i]);}
    
    System.out.println("discount applied : " + discount + " % ");
    if(discount>0){
      System.out.println( "total price : " + ( total*discount- total ));}
    else{
       System.out.println( "total price : " + ( total ));}
      
                     
     
 
    
    
  }


 public void giveDiscount(int d ){
   
   this.discount=d;
   
   
 }
}
 

  
  
  