class CreateAccount {
  public static void main(String[] args) {
    Account.bankName = "Ealing Bank";
    Account reidsAccount = new Account(123, "Reid", 50);
    Account billysAccount = new Account(123, "Billy");
  
    System.out.println(
      "A/c no: " + reidsAccount.accountNo +
      " A/c name: " + reidsAccount.accountName +
      " Balance " + reidsAccount.balance);
  
    System.out.println(
      "A/c no: " + billysAccount.accountNo +
      " A/c name: " + billysAccount.accountName +
      " Balance " + billysAccount.balance);
  }
}
