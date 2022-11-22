public class Main {

public static void main(String[] args) {
    Customer cust1 = new Customer("123456", "1122", 100, 0); // New customer object

    StandardAtm SA1 = new StandardAtm(cust1);//created a standard ATM object and passed cust1 in it

    SA1.accessacc("123456", "1122");//given SA1 an account number: the printout method should not work
    //SA1.withdrawCash(100);

    DepositAtm SA2 = new DepositAtm(cust1); // created a deposit ATM object and passed cust1 through it
    SA2.depositCash(50);
  

}
}
