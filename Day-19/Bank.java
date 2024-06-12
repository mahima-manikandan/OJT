class bankac{
    private String name;
    private String actid;
    private double balance=0;

    public String getName(){
        return name;
    }
    public String getactid(){
        return actid;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String newname){
        name = newname;
    }
    public void setactid(String newid){
        actid = newid;
    }
   

public void withdrow(double withdrow){
  
    if(balance > 0 && balance > withdrow){
        balance = balance - withdrow;
        System.out.println("Your withdrowal amount is : "+ withdrow);
    }
    else{
        System.out.println("No sufficient balance");
    }
    
}

public void deposit(double amount){
    balance = balance+amount;
}

   
}
public class Bank {
    public static void main(String[] args) {
        bankac obj = new bankac();
        obj.setName("Mahima");
        obj.setactid("9061");
        
        System.out.println("Name : "+obj.getName());
        System.out.println("Account Id : "+obj.getactid());
        //System.out.println("Balance :"+obj.getBalance());
        obj.deposit(700);
      
        
        obj.withdrow(500);
       
        System.out.println("Current Balance :"+obj.getBalance());

    }
    
}