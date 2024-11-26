//task 1 
class  BankAccount {
  public int AccountNo= 0 ;
  public String type = "Not set" ;
  
  
  public String  printDetails(){
    
  return  "Account No:" + AccountNo + "\nType: " + type ;
    
    
  }
  
  
  public void setInfo(int x , String y ){
    
    this.AccountNo= x;
    this.type = y ; 
    
  }
}
  
  
    
  
  
  
  
  
  