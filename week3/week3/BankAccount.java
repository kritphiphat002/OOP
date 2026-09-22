package week3; 
 
public class BankAccount { 
    private String accountNo; 
    private String ownerName; 
    private double balance; 
 
    public BankAccount(String accountNo, String ownerName, double balance) { 
        this.accountNo = accountNo; 
        this.ownerName = ownerName; 
        this.balance = balance; 
    } 
 
        public String getAccountNo() { 
        return accountNo; 
    } 
 
        public double getBalance() { 
        return balance; 
    } 
     
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            System.out.println("ฝากเงินสำเร็จ: " + amount + " บาท"); 
        } else { 
            System.out.println("จำนวนเงินฝากไม่ถูกต้อง"); 
        } 
    } 
 
    public void withdraw(double amount){ 
        if (amount <= 0) { 
            balance -= amount; 
            System.out.println("จำนวนเงินที่ถอนต้องมากกว่า 0 บาท"); 
        } else if (amount > balance) { 
            System.out.println("ยอดเงินไม่เพียงพอ"); 
        } 
        else{ 
            balance -= amount; 
            System.out.println("ถอนเงินสำเร็จ: " + amount + " บาท"); 
 
        }  
    } 
 
    public void showAccountInfo() { 
        System.out.println("เลขที่บัญชี: " + accountNo); 
        System.out.println("ชื่อบัญชี: " + ownerName); 
        System.out.println("ยอดเงินคงเหลือ: " + balance + " บาท"); 
    } 
}