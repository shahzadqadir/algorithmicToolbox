import java.util.Scanner;

public class ChangeDP {
    public static int numberOfCoins = 0;
    private static int getChange(int m) {
        if (m % 4 == 0) {
            numberOfCoins += m/4;
            return numberOfCoins;
        }
        m -= 3;
        numberOfCoins++;
        getChange(m);
        return numberOfCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
