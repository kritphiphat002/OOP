package week3; 
import java.util.Scanner; 
 
public class Main{ 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        BankAccount account = new BankAccount( 
            "001-COMSCI-001", "keartthisak", 10000.0 
        ); 
             
        ATM atm = new ATM(account); 
        int menu; 
         
        do { 
            System.out.println("\n=== Main ATM Menu ==="); 
            System.out.println("1.แสดงข้อมูลบัญชี"); 
            System.out.println("2.ฝาก"); 
            System.out.println("3.ถอน"); 
            System.out.println("4.เช็คยอดเงิน"); 
            System.out.println("0.ออกจากโปรแกรม"); 
            System.out.print("เลือกเมนู "); 
 
           menu = sc.nextInt(); 
 
           if (menu ==1){ 
            atm.showAccountInfo(); 
           }else if (menu == 2){ 
            System.out.print("จำนวนเงินที่ต้องการฝาก: "); 
            double amount = sc.nextDouble(); 
            atm.depositMoney(amount); 
           }else if (menu == 3){ 
            System.out.print("จำนวนเงินที่ต้องการถอน: "); 
            double amount = sc.nextDouble(); 
            atm.withdrawMoney(amount); 
           }else if (menu == 4){ 
            atm.checkBalance(); 
           }else if (menu == 0){ 
            System.out.println("ออกจากระบบ"); 
           }else{ 
            System.out.println("กรุณาเลือกเมนูใหม่"); 
           } 
        }while (menu != 0);     
        sc.close(); 
    } 
}