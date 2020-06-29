public class Solution {

    // Complete the maximumToys function below. 
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int gifts = 0;
        int moneySpent = 0;

        while (moneySpent < k) { //Possibility of array out of bounds if have enough money to buy all of the gifts
            moneySpent += prices[gifts];
            gifts++;
        }

        return gifts - 1;
    }
    
    
    public class Solution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int gifts = 0;
        int moneySpent = 0;

       for (int price : prices) {
           moneySpent += price;
           if (moneySpent > k) {
               return gifts;
           } else {
               gifts++;
           }
       }

        return gifts;
    }
