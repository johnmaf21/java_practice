package week09;

/**
 * Created by u1874295 on 29/11/2018.
 */
public class BankAccountDemo {

    public static void main (String[] args){
        BankAccount jane = new BankAccount("783268323", "Jane Doe", true);
        System.out.println(jane);
        if (jane.getAccountNumber()=="783268323"){
            System.out.println("Hello "+jane.getAccountHolder());



            if (jane.deposit(100)){
                System.out.println("Here is £100");
                if (jane.addInterest(10)){
                    System.out.println("We were feeling generous so we added 10% interest.\nYour balance is £"+jane.getBalance());
                    System.out.println("jane = " + jane);
                    jane.withdraw(jane.getBalance());
                    System.out.println("Joking "+jane.getAccountHolder()+" we don't give out free money.\nYour balance is £"+jane.getBalance());
                    System.out.println("jane = " + jane);
                }
            }

            jane.setHasOverdraft(true);
            System.out.println("jane = " + jane);

        }
    }
}
