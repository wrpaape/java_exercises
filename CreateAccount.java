class CreateAccount {
  public static void main(String[] args) {
    Account reidsAccount = new Account();

    reidsAccount.accountNo = 123;
    reidsAccount.accountName = "Reid";
    reidsAccount.balance = 50;
  
    System.out.println(
      "A/c no: " + reidsAccount.accountNo +
      " A/c name: " + reidsAccount.accountName +
      " Balance " + reidsAccount.balance);
  }
}
