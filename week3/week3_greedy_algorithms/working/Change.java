public class Change{

  public static int getChange(int m){
    int moneyLeft = m;
    int coinsOf10 = 0, coinsOf5 = 0;
    if (moneyLeft < 5){
      return moneyLeft;
    }
    if (moneyLeft/10 > 0){
      coinsOf10 = moneyLeft/10;
      moneyLeft -= (coinsOf10*10);
    }
    if (moneyLeft/5 > 0){
      coinsOf5 = moneyLeft/5;
      moneyLeft -= (coinsOf5*5);
    }
    return coinsOf5 + coinsOf10 + moneyLeft;
  }

  public static void main(String[] args){
    int money = 67;
    System.out.println("Number of coins required to change " +
    money + " is " + getChange(money));
    // System.out.println("10P coins required: " + coinsOf10);
    // System.out.println("5P coins required: " + coinsOf5);
    // System.out.println("1P coins required: " + money);
  }
}
