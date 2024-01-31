import java.util.*;
public class Bank {
    int balance;
    int accno;
    public Bank( int balance, int accno) {
        this.balance = balance;
        this.accno = accno;
    }
    void deposite(){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter amount to be deposited: ");
        int depositeamount=d.nextInt();
        System.out.println("Balance after depositing amount: " +(balance+depositeamount));
        balance+=depositeamount;
    }
    void withdraw(){
        Scanner w=new Scanner(System.in);
        System.out.println("Enter amount to be Withdrawed: ");
        int withdrawamount=w.nextInt();
        if(withdrawamount>balance)
            System.out.println("Insufficient Balance");
        else
            System.out.println("Balance after withdrawing amount: " +(balance-withdrawamount));
        balance-=withdrawamount;
    }
    public  static void main(String[] args){
        Bank s1=new Bank(100,66);
        s1.deposite();
        s1.withdraw();

    }
}
