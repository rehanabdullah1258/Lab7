public class Ex1_Ex2_BasicAccount extends BankAccount{
    public void withdraws(double amount)
    {
        if(amount<=this.balance){
            this.balance=balance-amount-30;

    }
        else
        {
            this.balance=0;
            }

}
}

