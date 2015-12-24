class Account {
  static String bankName;
  int accountNo;
  String accountName;
  double balance;

  public Account(int accountNo, String accountName, double balance) {
    this.accountNo = accountNo;
    this.accountName = accountName;
    this.balance = balance;
  }

  public Account(int accountNo, String accountName) {
    this.accountNo = accountNo;
    this.accountName = accountName;
    this.balance = 10;
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
