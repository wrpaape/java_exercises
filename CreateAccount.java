class CreateAccount {
  public static void main(String[] args) {
    Account reidsAccount = new Account(123, "Reid", 50);
  
    System.out.println(
      "A/c no: " + reidsAccount.accountNo +
      " A/c name: " + reidsAccount.accountName +
      " Balance " + reidsAccount.balance);
  }
}
