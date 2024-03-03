package com.example;

public class AbstractBankingMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        initializeCustomers(bank);

        // run the customer report
        CustomerReport report = new CustomerReport();
        report.setBank(bank);
        report.generateReport();
    }

    private static void initializeCustomers(Bank bank) {
        Customer customer;
// Create several customers and their accounts
        bank.addCustomer("Will", "Smith");
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00));

        bank.addCustomer("Bradley", "Cooper");
        customer = bank.getCustomer(1);
        SavingsAccount sack = new SavingsAccount(500.00);
        customer.addAccount(sack);
        sack.deposit(500);

       bank.addCustomer("Jill", "Smith");
       customer = bank.getCustomer(2);
       customer.addAccount(new CheckingAccount(2_000.00, 500.00));
       
       
       bank.addCustomer("Bill", "Shezi");
       customer = bank.getCustomer(3);
       customer.addAccount(new CheckingAccount(5_000_000.00));
       
       bank.addCustomer("Tim", "Ndlovu");
       customer = bank.getCustomer(4);
       customer.addAccount(new CheckingAccount(200.00));
       
       bank.addCustomer("Maria", "Moodley");
       customer = bank.getCustomer(5);
       CheckingAccount chkAcct = new CheckingAccount(5_000.00);
//       customer.addAccount(chkAcct);
       if(chkAcct.withdraw(6000.00)) {
           customer.addAccount(chkAcct);
           System.out.println("Withdrawal successful! Balance = R" + chkAcct.getBalance());
       } else {
           customer.addAccount(chkAcct);
           System.out.println("Insufficient funds");
       }
        }

    }

