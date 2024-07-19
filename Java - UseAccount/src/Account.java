import static java.lang.System.out;

public class Account {
    String name;
    String address;
    double balance;
    public void setName(String n) {
        if (!n.equals("")) {
            name = n;
        }
    }
    public String getName() {
        return name;
    }
    public void setAddress(String a) {
        address = a;
    }
    public String getAddress() {
        return address;
    }public void setBalance(double b) {
        balance = b;
    }
    public String getBalance() {
        return name;
    }
    public void display() {
        out.print(name);
        out.print("(");
        out.print(address);
        out.print(") has $");
        out.print(balance);
    }
    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}