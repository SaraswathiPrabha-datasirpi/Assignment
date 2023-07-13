import java.util.Arrays;

public class Account {
    
    private String id =" ";
    private String name = " ";
    private int balance= 0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    public void credit(int amount){
        balance = balance + amount;
    }
    public void debit(int amount){
        if(amount<= balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
    }

    public void transferTo (Account account1,Account account2,int amount){
        if(amount <= balance){
           account1. balance = balance - amount;
           account2.balance =+ amount;      
        }
         else{
            System.out.println("Amount exceeded balance");
        }
             
    }
    
   /*/ public String toString(){
        return this.id + " "+ this.name + " "+ this.balance; 
    }*/

public static void main(String[] args) {

    Account a1 = new Account("ID3445","Selvi",1000);
    Object[] sample= {a1.getId(),a1.getName(),a1.getBalance()};
    System.out.println("Account 1 Details:" + Arrays.toString(sample));

    Account acc = new Account("ID1234","Prabha",0);
    Object[] firstsample = {acc.getId(),acc.getName(),acc.getBalance()};
    System.out.println("Account 2 Details:" + Arrays.toString(firstsample));

    a1.credit(100);
    System.out.println("Account 1 credit Balance:" + a1.getBalance());
    
    a1.debit(50);
    System.out.println("Account 1 Debit Balance: "+ a1.getBalance());

    a1.debit(2000);
    System.out.println("Account 1 Debit Balance: "+ a1.getBalance());

    a1.transferTo(a1,acc,30);
    System.out.println("30Rs Debited in Account 1: " + a1.getBalance());
    System.out.println("30Rs Transfer from Account 1 to Account 2: "+ acc.getBalance());

    Object[] data= {a1.getId(),a1.getName(),a1.getBalance()};
    System.out.println("Account 1 Final Transaction Details:" + Arrays.toString(data));
   
    Object[] firstdata= {acc.getId(),acc.getName(),acc.getBalance()};
    System.out.println("Account 2 Final Transaction Details:" + Arrays.toString(firstdata));
}       
}
