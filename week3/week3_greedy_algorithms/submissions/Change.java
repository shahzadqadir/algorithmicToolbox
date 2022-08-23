import java.util.Scanner;

public class Change {
	private static int getChange(int m) {
		/* coins available are 1, 5, 10
		 * return minimum number of coins required to change the input sum
		 */
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }

}
