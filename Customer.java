import java.util.ArrayList;
import java.util.List;

public class Customer {
private String acctNo;
private String password;
private double balance;
private int attempt;

public Customer(String acctNo, String password, double balance, int attempt) {
    super();
    this.acctNo = acctNo;
    this.password = password;
    this.balance = balance;
    this.attempt = attempt;
}
public int getAttempt() {
    return attempt;
}
public void setAttempt(int attempt) {
    this.attempt = attempt;
}
public String getAcctNo() {
    return acctNo;
}
public void setAcctNo(String acctNo) {
    this.acctNo = acctNo;
}
public String getPIN() {
    return password;
}
public void setPIN(String password) {
    this.password = password;
}
public double getBalance() {
    return balance;
}
public void setBalance(double balance) {
    this.balance = balance;
}
}
