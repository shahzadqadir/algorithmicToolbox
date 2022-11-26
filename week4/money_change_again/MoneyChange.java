public class MoneyChange{
        public int numberOfCoins = 0;
    public int change(int amount){        
        if (amount % 4 == 0) {
            numberOfCoins += amount/4;
            return numberOfCoins;
        }
        amount -= 3;
        numberOfCoins++;
        change(amount);
        return numberOfCoins;
    }
}