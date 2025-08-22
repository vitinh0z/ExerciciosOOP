package Construtores.ConstrutoresVerificadores;

public class Account {

    private String accountNumber;
    private double balance;

    public Account (String accountNumber, double balance){
        if (accountNumber == null){
            throw new IllegalArgumentException ("Não pode ser vazio");
        }
        else {
            System.out.println("Numero conta valida");
        }
        if (balance < 0){
            throw new IllegalArgumentException("Deve ser maior que zero");
        }
        else {
            System.out.println("Saldo positivo");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString (){
        return "Conta: " + " | " + getAccountNumber() + " | " + " Saldo: " + getBalance();
    }
    

    
}
