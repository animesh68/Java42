public class MyException {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try{
            bank.withdraw(12000);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
