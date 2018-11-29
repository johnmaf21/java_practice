package week09;

/**
 * Created by u1874295 on 29/11/2018.
 */
public class BankAccountDemo {

    public static void main (String[] args){
        BankAccount b = new BankAccount("783268323", "Jane Doe", true);
        System.out.println(b);
        b.isHasOverdraft();
    }
}
