import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank();
    public static void main(String[] args) throws Exception{
        while(true) {
            bank.welcomeUser();
            bank.checkAccount();

            bank.promptUser();
        }
}
}
