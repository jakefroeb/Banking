import java.util.HashMap;

/**
 * Created by jakefroeb on 9/1/16.
 */
public class Bank {

        String name;
        int promptChoice;
        int withdrawl;
        Double balance;
        String account;
        boolean hasAccount = true;

        public HashMap<String, Double> customers = new HashMap<>();

        public Bank(){
            customers.put("jimbo", 100.0);

        }



        public void userName() throws Exception {
            System.out.println("Enter your name");
            name = Main.scanner.nextLine();

            if(!name.isEmpty()){
                System.out.println("Hello" + name);
            }
            else{
                throw new Exception("No name provided");
            }

        }
        public void checkAccount(){
            if(customers.containsKey(name)){
                System.out.println("Hello " + name);
            }
            else{

                System.out.println("Would you like to create an account? y/n");
                account = Main.scanner.nextLine();
                if(account.equalsIgnoreCase("y")){
                    hasAccount = false;
                    System.out.println("How much would you like to deposit?");
                    balance = Double.parseDouble(Main.scanner.nextLine());
                    customers.put(name,balance);
                }
                else{
                    System.out.println("This bank is for account holders only.");
                }            }


        }
//        public void createAccount(){
//            if(hasAccount = false){
//
//            }
//
//        }

        public void promptUser() throws Exception{
            balance = customers.get(name);
            do {
                System.out.println("Would you like to 1. Check my balance, 2. Withdraw Funds, or 3. Cancel");
                promptChoice = Integer.parseInt(Main.scanner.nextLine());
                if (promptChoice == 1) {
                    System.out.println("Your balance is " + balance);
                } else if (promptChoice == 2) {
                    System.out.println("How much Would you like to withdrawl?");
                    withdrawl = Integer.parseInt(Main.scanner.nextLine());
                    if (balance-withdrawl < 0) {
                        throw new Exception("Invalid amount");
                    } else {
                        balance = balance - withdrawl;
                        System.out.println("Please take all of your money your remaining funds are " + balance);
                        customers.put(name, balance);

                    }
                } else if (promptChoice == 3) {
                    System.out.println("Thank you please come again");
                } else {
                    throw new Exception("Invalid prompt");
                }
            }
            while(promptChoice != 3);
            name = "  ";
            balance = 0.0;






        }

    }