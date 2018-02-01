package bank;

public class PaymentService {


    void transferMoney(Account from, Account to , int balance){

        to.balance = to.balance + balance;
        from.balance = from.balance - balance;
    }
}
