class Account {
  int accountNo;
  String accountName;
  double balance;

  public Account(int no, String name, double bal) {
    accountNo = no;
    accountName = name;
    balance = bal;
  }

  public Account(int no, String name) {
    accountNo = no;
    accountName = name;
    balance = 10;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void deposit(double amount, double level) {
    deposit(amount);
    if (balance > level) {
      System.out.println("Current balance = " + balance);
    }
  }

  public void clearBalance() {
    balance = 0;
  }

  public double withdraw(double amount) {
    if (balance - amount < 0) {
      System.out.println("Insufficient Funds");
    } else {
      balance -= amount;
    }

    return balance;
  }
}
