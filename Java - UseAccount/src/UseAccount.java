import static java.lang.System.out;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();
        myAccount.name = "Mahan Khalili";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.02;
        yourAccount.name = "Hadi Khodapanah";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;
        double myInterset = myAccount.getInterest(5.00);
        double yourInterset = yourAccount.getInterest(7.00);
        out.printf("$%4.2f\n", myInterset);
        out.printf("$%5.2f\n", myInterset);
        out.printf("$%.2f\n", myInterset);
        out.printf("$%3.2f\n", myInterset);
        out.printf("$%.2f $%.2f", myInterset, yourInterset);
    }
}
